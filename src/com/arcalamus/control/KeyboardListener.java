package com.arcalamus.control;

import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_UP;

import com.arcalamus.util.event.EventListener;
import com.arcalamus.util.event.EventManager;
import com.arcalamus.util.event.HandlesEvent;
import com.arcalamus.util.event.events.ListenerRegistrationEvent;

public class KeyboardListener implements EventListener {

	@HandlesEvent
	public void onRegistration(ListenerRegistrationEvent event) {
		EventManager.get().registerEvent(KeyboardPressEvent.class);
	}

	@HandlesEvent
	public void onKeyPressed(KeyboardPressEvent event) {
		switch (event.getKeyCode()) {
		case VK_UP:
			System.out.println("Pressed up on keyboard!");
			break;
		case VK_DOWN:
			System.out.println("Pressed down on keyboard!");
			break;
		case VK_LEFT:
			System.out.println("Pressed left on keyboard!");
			break;
		case VK_RIGHT:
			System.out.println("Pressed right on keyboard!");
			break;
		}
	}

}