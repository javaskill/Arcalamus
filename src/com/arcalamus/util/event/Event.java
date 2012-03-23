package com.arcalamus.util.event;

public abstract class Event {

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Event)) {
			return false;
		}
		return toString().equalsIgnoreCase(((Event) o).toString());
	}

}