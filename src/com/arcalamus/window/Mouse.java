package com.arcalamus.window;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.arcalamus.control.MouseClickEvent;
import com.arcalamus.util.event.EventManager;

public class Mouse implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		EventManager.get().dispatchEvent(new MouseClickEvent(arg0.getButton() == 3));
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}