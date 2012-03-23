package com.arcalamus.util.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class EventManager {

	private final List<EventListener> listeners = new ArrayList<EventListener>();
	private final Map<String, Event> events = new HashMap<String, Event>();

	protected void registerListener(EventListener listener) {
		listeners.add(listener);
	}

	protected void registerEvent(Event event) {
		events.put(event.toString(), event);
	}

	public void dispatchEvent(Event event) {
		for (EventListener listener: listeners) {
			for (Method method : listener.getClass().getMethods()) {
				for (Class<?> clazz : method.getParameterTypes()) {
					String clazzName = clazz.getSimpleName();
					if (events.containsKey(clazzName)) {
						Event invokedEvent = events.get(clazzName);
						if (event.equals(invokedEvent)) {
							try {
								method.invoke(listener, event);
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}

}