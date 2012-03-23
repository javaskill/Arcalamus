package com.arcalamus.window;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private static final Window instance = new Window();
	public static Window get() {
		return instance;
	}

	private Window() {
		setTitle("Arcalamus");
		setSize(800, 600);
		addKeyListener(new Keyboard());
		addMouseListener(new Mouse());
		setVisible(true);
	}

}