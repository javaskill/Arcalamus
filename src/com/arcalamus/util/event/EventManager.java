package com.arcalamus.util.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.arcalamus.control.KeyboardListener;
import com.arcalamus.control.MouseListener;
import com.arcalamus.util.event.events.ListenerRegistrationEvent;

public class EventManager {

	private static final EventManager instance = new EventManager();
	public static final EventManager get() {
		return instance;
	}

	private final List<EventListener> listeners = new ArrayList<EventListener>();
	private final List<String> events = new ArrayList<String>();

	public void registerListener(EventListener listener) {
		listeners.add(listener);
		dispatchEvent(new ListenerRegistrationEvent(listener));
	}

	public void registerEvent(Class<?> clazz) {
		events.add(clazz.getName());
	}

	public void dispatchEvent(Event event) {
		for (EventListener listener : listeners) {
			for (Method method : listener.getClass().getMethods()) {
				if (method.getAnnotation(HandlesEvent.class) != null) {
					Class<?>[] parameters = method.getParameterTypes();
					if (parameters.length == 1) {
						if (event.getClass().getName().equalsIgnoreCase(parameters[0].getName())) {
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

	private EventManager() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				registerEvent(ListenerRegistrationEvent.class);

				registerListener(new MouseListener());
				registerListener(new KeyboardListener());
			}
		};
		thread.start();
	}

}