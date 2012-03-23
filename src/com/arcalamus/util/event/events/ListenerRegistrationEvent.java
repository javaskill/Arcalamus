package com.arcalamus.util.event.events;

import com.arcalamus.util.event.Event;
import com.arcalamus.util.event.EventListener;

public class ListenerRegistrationEvent extends Event {

	private final EventListener listener;

	public ListenerRegistrationEvent(EventListener listener) {
		this.listener = listener;
	}

	public EventListener getListener() {
		return listener;
	}

}