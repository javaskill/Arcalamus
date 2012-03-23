package com.arcalamus.event.events;

import com.arcalamus.util.event.Event;

public class MouseClickEvent extends Event {

	private boolean rightClicked;

	public MouseClickEvent(boolean rightClicked) {
		this.rightClicked = rightClicked;
	}

	public boolean wasRightClicked() {
		return rightClicked;
	}

}