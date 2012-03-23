package com.arcalamus.control;

import com.arcalamus.event.events.KeyboardPressEvent;
import com.arcalamus.util.event.EventListener;
import com.arcalamus.util.event.HandlesEvent;

import static java.awt.event.KeyEvent.*;

public class KeyboardListener implements EventListener {

	@HandlesEvent
	public void onKeyPressed(KeyboardPressEvent event) {
		switch (event.getKeyCode()) {
		case VK_LEFT:
			System.out.println("Pressed left on keyboard!");
			break;
		case VK_RIGHT:break;
		case VK_UP:
			System.out.println("Pressed up on keyboard!");
			break;
		case VK_DOWN:break;
		}
	}

}