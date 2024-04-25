package org.herac.tuxguitar.app.system.config;

public class TGConfigKeys {
	
	/* list of obsolete configuration key names
	 * these keys were used in previous versions of TuxGuitar, and SHALL NOT be re-used for new configuration parameters 
	 * as old values (with an old signification) can be found in user's configuration file (when user upgrades TuxGuitar from an old version)
	 */
	static final String[] OBSOLETE_KEYS = {
			"color.caret.1",
			"color.caret.2",
			};

	// valid configuration key names
	public static final String SKIN = "skin";
	public static final String WINDOW_TITLE = "window.title";
	public static final String SHOW_SPLASH = "show.splash";
	public static final String MAXIMIZED = "window.maximized";
	public static final String WIDTH = "window.width";
	public static final String HEIGHT = "window.height";
	public static final String SHOW_INSTRUMENTS = "show.instruments";
	public static final String SHOW_TRANSPORT = "show.transport";
	public static final String SHOW_FRETBOARD = "show.fretboard";
	public static final String SHOW_MATRIX = "show.matrix";
	public static final String SHOW_PIANO = "show.piano";
	public static final String SHOW_MARKERS = "show.markers";
	public static final String SHOW_MAIN_TOOLBAR = "show.main-toolbar";
	public static final String SHOW_EDIT_TOOLBAR = "show.edit-toolbar";
	public static final String SHOW_TRACKS = "show.tracks";
	public static final String LAYOUT_MODE = "layout.mode";
	public static final String LAYOUT_STYLE = "layout.style";
	public static final String LANGUAGE = "language";
	public static final String EDITOR_MOUSE_MODE = "editor.mouse.mode";
	public static final String EDITOR_NATURAL_KEY_MODE = "editor.natural.key.mode";
	public static final String FONT_DEFAULT = "font.default";
	public static final String FONT_NOTE = "font.note";
	public static final String FONT_LYRIC = "font.lyric";
	public static final String FONT_TEXT = "font.text";
	public static final String FONT_CHORD = "font.chord";
	public static final String FONT_CHORD_FRET = "font.chord-fret";
	public static final String FONT_GRACE = "font.grace";
	public static final String FONT_MARKER = "font.marker";
	public static final String FONT_PRINTER_DEFAULT = "font.printer.default";
	public static final String FONT_PRINTER_NOTE = "font.printer.note";
	public static final String FONT_PRINTER_LYRIC = "font.printer.lyric";
	public static final String FONT_PRINTER_TEXT = "font.printer.text";
	public static final String FONT_PRINTER_CHORD = "font.printer.chord";
	public static final String FONT_PRINTER_GRACE = "font.printer.grace";
	public static final String FONT_ABOUT_DIALOG_TITLE = "font.about.dialog.title";
	public static final String COLOR_FOREGROUND = "color.foreground";
	public static final String COLOR_BACKGROUND = "color.background";
	public static final String COLOR_LINE = "color.line";
	public static final String COLOR_SCORE_NOTE = "color.score.note";
	public static final String COLOR_TAB_NOTE = "color.tab.note";
	public static final String COLOR_PLAY_NOTE = "color.play.note";
	public static final String COLOR_SELECTION = "color.selection";
	public static final String COLOR_CARET_CURRENT_VOICE = "color.caret.voice.current";
	public static final String COLOR_CARET_OTHER_VOICE = "color.caret.voice.other";
	public static final String COLOR_CARET_ALPHA = "color.caret.alpha";
	public static final String COLOR_LOOP_S_MARKER = "color.loop.s.marker";
	public static final String COLOR_LOOP_E_MARKER = "color.loop.e.marker";
	public static final String COLOR_MEASURE_NUMBER = "color.measure.number";
	public static final String MIDI_PORT = "midi.port";
	public static final String MIDI_SEQUENCER = "midi.sequencer";
	public static final String MAX_HISTORY_FILES = "history.max-files";
	public static final String FRETBOARD_STRING_SPACING = "fretboard.string-spacing";
	public static final String FRETBOARD_STYLE = "fretboard.style";
	public static final String FRETBOARD_FONT = "fretboard.font";
	public static final String FRETBOARD_COLOR_BACKGROUND = "fretboard.color.background";
	public static final String FRETBOARD_COLOR_STRING = "fretboard.color.string";
	public static final String FRETBOARD_COLOR_FRET_POINT = "fretboard.color.fret-point";
	public static final String FRETBOARD_COLOR_NOTE = "fretboard.color.note";
	public static final String FRETBOARD_COLOR_SCALE = "fretboard.color.scale";
	public static final String FRETBOARD_DIRECTION = "fretboard.direction";
	public static final String PIANO_COLOR_KEY_NATURAL = "piano.color.natural-key";
	public static final String PIANO_COLOR_KEY_NOT_NATURAL = "piano.color.not-natural-key";
	public static final String PIANO_COLOR_NOTE = "piano.color.note";
	public static final String PIANO_COLOR_SCALE = "piano.color.scale";
	public static final String MATRIX_GRIDS = "matrix.grids";
	public static final String MATRIX_FONT = "matrix.font";
	public static final String MATRIX_COLOR_FOREGROUND = "matrix.color.foreground";
	public static final String MATRIX_COLOR_LINE_1 = "matrix.color.line-1";
	public static final String MATRIX_COLOR_LINE_2 = "matrix.color.line-2";
	public static final String MATRIX_COLOR_LINE_3 = "matrix.color.line-3";
	public static final String MATRIX_COLOR_BORDER = "matrix.color.border";
	public static final String MATRIX_COLOR_POSITION = "matrix.color.position";
	public static final String MATRIX_COLOR_NOTE = "matrix.color.note";
	public static final String MATRIX_COLOR_PLAY_NOTE = "matrix.color.play-note";
	public static final String TABLE_AUTO_SIZE = "table.auto-size";
	public static final String FORCE_OS_DEFAULTS = "painter.force-os-defaults";

	public static final String STYLE_MIN_BUFFER_SEPARATOR = "style.minBufferSeparator";
	public static final String STYLE_MIN_TOP_SPACING = "style.minTopSpacing";
	public static final String STYLE_MIN_SCORE_TAB_SPACING = "style.minScoreTabSpacing";
	public static final String STYLE_STRING_SPACING = "style.stringSpacing";
	public static final String STYLE_SCORE_LINE_SPACING = "style.scoreLineSpacing";
	public static final String STYLE_TRACK_SPACING = "style.trackSpacing";
	public static final String STYLE_FIRST_TRACK_SPACING = "style.firstTrackSpacing";
	public static final String STYLE_FIRST_MEASURE_SPACING = "style.firstMeasureSpacing";
	public static final String STYLE_FIRST_NOTE_SPACING = "style.firstNoteSpacing";
	public static final String STYLE_MEASURE_LEFT_SPACING = "style.measureLeftSpacing";
	public static final String STYLE_MEASURE_RIGHT_SPACING = "style.measureRightSpacing";
	public static final String STYLE_CLEF_SPACING = "style.clefSpacing";
	public static final String STYLE_KEY_SIGNATURE_SPACING = "style.keySignatureSpacing";
	public static final String STYLE_TIME_SIGNATURE_SPACING = "style.timeSignatureSpacing";
	public static final String STYLE_CHORD_FRET_INDEX_SPACING = "style.chordFretIndexSpacing";
	public static final String STYLE_CHORD_STRING_SPACING = "style.chordStringSpacing";
	public static final String STYLE_CHORD_FRET_SPACING = "style.chordFretSpacing";
	public static final String STYLE_CHORD_NOTE_SIZE = "style.chordNoteSize";
	public static final String STYLE_CHORD_LINE_WIDTH = "style.chordLineWidth";
	public static final String STYLE_REPEAT_ENDING_SPACING = "style.repeatEndingSpacing";
	public static final String STYLE_EFFECT_SPACING = "style.effectSpacing";
	public static final String STYLE_DIVISION_TYPE_SPACING = "style.divisionTypeSpacing";
	public static final String STYLE_TEXT_SPACING = "style.textSpacing";
	public static final String STYLE_MARKER_SPACING = "style.markerSpacing";
	public static final String STYLE_LOOP_MARKER_SPACING = "style.loopMarkerSpacing";
	public static final String STYLE_LINE_WIDTHS = "style.lineWidths";
	public static final String STYLE_DURATION_WIDTHS = "style.durationWidths";

	public static final String HOMEPAGE_URL = "homepage.url";
}
