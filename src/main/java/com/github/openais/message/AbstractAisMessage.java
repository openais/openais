package com.github.openais.message;

public abstract class AbstractAisMessage {

	private int repeatIndicator;

	private int mmsi;

	public abstract int getMessageType();

	public int getRepeatIndicator() {
		return repeatIndicator;
	}

	public void setRepeatIndicator(int repeatIndicator) {
		this.repeatIndicator = repeatIndicator;
	}

	public int getMmsi() {
		return mmsi;
	}

	public void setMmsi(int mmsi) {
		this.mmsi = mmsi;
	}

}
