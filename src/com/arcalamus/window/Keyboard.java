package com.arcalamus.window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.arcalamus.control.KeyboardPressEvent;
import com.arcalamus.util.event.EventManager;

public class Keyboard implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		EventManager.get().dispatchEvent(new KeyboardPressEvent(arg0.getKeyCode()));
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