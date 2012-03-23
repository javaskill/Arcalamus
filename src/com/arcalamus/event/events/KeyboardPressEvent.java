package com.arcalamus.event.events;

import com.arcalamus.util.event.Event;

public class KeyboardPressEvent extends Event {

	private final int keyCode;

	public KeyboardPressEvent(int keyCode) {
		this.keyCode = keyCode;
	}

	public int getKeyCode() {
		return keyCode;
	}

}