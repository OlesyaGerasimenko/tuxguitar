package org.herac.tuxguitar.io.image;

import java.util.ArrayList;
import java.util.List;

import org.herac.tuxguitar.app.graphics.TGPainterImpl;
import org.herac.tuxguitar.app.graphics.TGResourceFactoryImpl;
import org.herac.tuxguitar.app.printer.PrintController;
import org.herac.tuxguitar.app.printer.PrintDocument;
import org.herac.tuxguitar.app.printer.PrintLayout;
import org.herac.tuxguitar.app.ui.TGApplication;
import org.herac.tuxguitar.document.TGDocumentContextAttributes;
import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.TGRectangle;
import org.herac.tuxguitar.graphics.TGResourceFactory;
import org.herac.tuxguitar.graphics.control.TGFactoryImpl;
import org.herac.tuxguitar.io.base.TGFileFormatException;
import org.herac.tuxguitar.io.base.TGSongStream;
import org.herac.tuxguitar.io.base.TGSongStreamContext;
import org.herac.tuxguitar.song.managers.TGSongManager;
import org.herac.tuxguitar.song.models.TGSong;
import org.herac.tuxguitar.ui.UIFactory;
import org.herac.tuxguitar.ui.resource.UIImage;
import org.herac.tuxguitar.util.TGContext;
import org.herac.tuxguitar.util.error.TGErrorManager;

public class ImageExporterStream implements TGSongStream{
	
	private static final int PAGE_WIDTH = 550;
	private static final int PAGE_HEIGHT = 800;
	
	private TGContext context;
	private TGSongStreamContext streamContext;
	
	public ImageExporterStream(TGContext context, TGSongStreamContext streamContext) {
		this.context = context;
		this.streamContext = streamContext;
	}
	
	public void process() throws TGFileFormatException {
		ImageExporterSettings settings = this.streamContext.getAttribute(ImageExporterSettings.class.getName());
		if( settings != null ){
			TGSong song = this.streamContext.getAttribute(TGDocumentContextAttributes.ATTRIBUTE_SONG);
			TGSongManager manager = new TGSongManager(new TGFactoryImpl());
			TGSong clonedSong = song.clone(manager.getFactory());
			
			TGResourceFactory factory = new TGResourceFactoryImpl(getUIFactory());
			
			PrintController controller = new PrintController(clonedSong, manager, factory);
			PrintLayout layout = new PrintLayout(controller, settings.getStyles());
			
			layout.loadStyles(1f);
			layout.updateSong();
			layout.makeDocument(new PrintDocumentImpl(new TGRectangle(25 , 25, PAGE_WIDTH, PAGE_HEIGHT), settings.getFormat(), settings.getPath() ));
		}
	}
	
	public UIFactory getUIFactory() {
		return TGApplication.getInstance(this.context).getFactory();
	}
	
	private class PrintDocumentImpl implements PrintDocument{
		
		private TGPainterImpl painter;
		private TGRectangle bounds;
		private String path;
		private List<UIImage> pages;
		private ImageFormat format;
		
		public PrintDocumentImpl(TGRectangle bounds, ImageFormat format, String path){
			this.bounds = bounds;
			this.path = path;
			this.painter = new TGPainterImpl(getUIFactory());
			this.pages = new ArrayList<UIImage>();
			this.format = format;
		}
		
		public TGPainter getPainter() {
			return this.painter;
		}
		
		public TGRectangle getBounds(){
			return this.bounds;
		}
		
		public void pageStart() {
			int width = Math.round(this.bounds.getWidth() + (this.bounds.getX() * 2));
			int height = Math.round(this.bounds.getHeight() + (this.bounds.getY() * 2));
			
			UIFactory factory = getUIFactory();
			UIImage page = factory.createImage(width, height);
			this.painter.setHandle(page.createPainter());
			this.pages.add( page );
		}
		
		public void pageFinish() {
			this.painter.dispose();
		}
		
		public void start() {
			// Not implemented
		}
		
		public void finish() {
			try {
				ImageWriter.write(this.format, this.path, this.pages);
				
				for(UIImage uiImage : this.pages) {
					uiImage.dispose();
				}
			} catch (Throwable throwable) {
				TGErrorManager.getInstance(ImageExporterStream.this.context).handleError(throwable);
			}
		}
		
		public boolean isPaintable(int page) {
			return true;
		}
	}
}
