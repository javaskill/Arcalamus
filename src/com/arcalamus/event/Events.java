package com.arcalamus.event;

import com.arcalamus.control.KeyboardListener;
import com.arcalamus.control.MouseListener;
import com.arcalamus.event.events.KeyboardPressEvent;
import com.arcalamus.event.events.MouseClickEvent;
import com.arcalamus.event.events.TestEvent;
import com.arcalamus.util.event.EventManager;

public class Events extends EventManager {

	private static final Events instance = new Events();
	public static Events get() {
		return instance;
	}

	private Events() {
		registerEvent(new TestEvent());//TestEvent.class
		registerEvent(new KeyboardPressEvent(0));
		registerEvent(new MouseClickEvent(false));
		
		registerListener(new KeyboardListener());
		registerListener(new MouseListener());
	}

}