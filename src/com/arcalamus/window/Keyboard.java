package com.arcalamus.window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.arcalamus.event.Events;
import com.arcalamus.event.events.KeyboardPressEvent;

public class Keyboard implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		Events.get().dispatchEvent(new KeyboardPressEvent(arg0.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}