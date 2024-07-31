package org.herac.tuxguitar.app.action.impl.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.herac.tuxguitar.action.TGActionContext;
import org.herac.tuxguitar.action.TGActionException;
import org.herac.tuxguitar.action.TGActionManager;
import org.herac.tuxguitar.editor.action.TGActionBase;
import org.herac.tuxguitar.editor.action.file.TGWriteSongAction;
import org.herac.tuxguitar.io.base.TGFileFormatManager;
import org.herac.tuxguitar.io.base.TGFileFormatUtils;
import org.herac.tuxguitar.util.TGContext;

public class TGWriteFileAction extends TGActionBase {
	
	public static final String NAME = "action.file.write";
	
	public static final String ATTRIBUTE_FILE_NAME = "fileName";
	// file export: boolean attribute, set to true if writing to a non commonFileFormat
	public static final String ATTRIBUTE_FILE_EXPORT = "fileExport";
	
	public TGWriteFileAction(TGContext context) {
		super(context, NAME);
	}
	
	protected void processAction(TGActionContext context){
		try {
			String fileName = context.getAttribute(ATTRIBUTE_FILE_NAME);
			
			context.setAttribute(TGWriteSongAction.ATTRIBUTE_OUTPUT_STREAM, new FileOutputStream(new File(fileName)));
			String formatCode = TGFileFormatUtils.getFileFormatCode(fileName);
			context.setAttribute(TGWriteSongAction.ATTRIBUTE_FORMAT_CODE, formatCode);
			context.setAttribute(ATTRIBUTE_FILE_EXPORT, !TGFileFormatManager.getInstance(getContext()).isNativeWriteFileFormat(formatCode));
			
			TGActionManager tgActionManager = TGActionManager.getInstance(getContext());
			tgActionManager.execute(TGWriteSongAction.NAME, context);
		} catch (FileNotFoundException e) {
			throw new TGActionException(e);
		}
	}
}
