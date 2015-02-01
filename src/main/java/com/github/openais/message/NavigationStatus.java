package com.github.openais.message;

import java.util.LinkedHashMap;
import java.util.Map;

public enum NavigationStatus {

	UNDERWAY_USING_ENGINE(0),

	AT_ANCHOR(1),

	NOT_UNDER_COMMAND(2),

	RESTRICTED_MANEUVERABILITY(3),

	CONSTRAINED_BY_HER_DRAUGHT(4),

	MOORED(5),

	// TODO: complete the items to number 14
	// TODO: refer to
	// http://catb.org/gpsd/AIVDM.html#_types_1_2_and_3_position_report_class_a

	NOT_DEFINED();

	private final int value;

	private final static int NOT_DEFINED_VALUE = 15;

	NavigationStatus() {
		this.value = NOT_DEFINED_VALUE;
	}

	NavigationStatus(int value) {
		this.value = value;
	}

	public static NavigationStatus parse(int value) {
		final Map<Integer, NavigationStatus> map = new LinkedHashMap<Integer, NavigationStatus>();
		map.put(1, AT_ANCHOR);
		map.put(2, NOT_UNDER_COMMAND);
		map.put(3, RESTRICTED_MANEUVERABILITY);
		map.put(4, CONSTRAINED_BY_HER_DRAUGHT);
		map.put(5, MOORED);
		// TODO: complete the items to number 14
		final NavigationStatus navigationStatus = map.get(value);
		if (navigationStatus == null) {
			return NOT_DEFINED;
		} else {
			return navigationStatus;
		}
	}

	public int getValue() {
		return value;
	}

}