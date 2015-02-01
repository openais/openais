package com.github.openais.message;

public class AisMessageType1 extends AbstractAisMessagePositionReportClassA {

	private static final int AIS_MESSAGE_TYPE = 1;

	@Override
	public int getMessageType() {
		return AIS_MESSAGE_TYPE;
	}

}
