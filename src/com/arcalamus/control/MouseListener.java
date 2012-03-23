package com.arcalamus.control;

import com.arcalamus.util.event.EventListener;
import com.arcalamus.util.event.EventManager;
import com.arcalamus.util.event.HandlesEvent;
import com.arcalamus.util.event.events.ListenerRegistrationEvent;

public class MouseListener implements EventListener {

	@HandlesEvent
	public void onRegistration(ListenerRegistrationEvent event) {
		EventManager.get().registerEvent(MouseClickEvent.class);
	}

	@HandlesEvent
	public void onMouseClick(MouseClickEvent event) {
		System.out.println((event.wasRightClicked() ? "Right" : "Left") + " clicked");
	}

}