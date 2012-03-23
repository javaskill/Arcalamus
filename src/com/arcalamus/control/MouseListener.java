package com.arcalamus.control;

import com.arcalamus.event.events.MouseClickEvent;
import com.arcalamus.util.event.EventListener;
import com.arcalamus.util.event.HandlesEvent;

public class MouseListener implements EventListener {

	@HandlesEvent
	public void onMouseClick(MouseClickEvent event) {
		System.out.println((event.wasRightClicked() ? "Right" : "Left") + " clicked");
	}

}