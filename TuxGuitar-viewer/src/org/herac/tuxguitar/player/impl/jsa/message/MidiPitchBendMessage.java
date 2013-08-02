package org.herac.tuxguitar.player.impl.jsa.message;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

public class MidiPitchBendMessage extends MidiShortMessage{
	
	public MidiPitchBendMessage(int channel,int value, int voice, boolean bendMode) throws InvalidMidiDataException{
		this.setMessage(ShortMessage.PITCH_BEND, channel, 0, value);
		this.setVoice(voice);
		this.setBendMode(bendMode);
	}
	
	public MidiPitchBendMessage(int channel,int value) throws InvalidMidiDataException{
		this(channel, value, DEFAULT_VOICE, DEFAULT_BEND_MODE);
	}
}
