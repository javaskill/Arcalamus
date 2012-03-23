package com.arcalamus.control;

import com.arcalamus.util.event.Event;

public class MouseClickEvent extends Event {

	private final boolean rightClicked;

	public MouseClickEvent(boolean rightClicked) {
		this.rightClicked = rightClicked;
	}

	public boolean wasRightClicked() {
		return rightClicked;
	}

}