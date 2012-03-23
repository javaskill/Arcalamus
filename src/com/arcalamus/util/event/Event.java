package com.arcalamus.util.event;

public abstract class Event {
	// marker

	@Override
	public String toString() {
		return getClass().getName();
	}
}