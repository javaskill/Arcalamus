package com.arcalamus.engine;

import nome.scheduler.Scheduler;
import nome.scheduler.Schedulers;

public class Engine {

	private final Scheduler scheduler;

	public Scheduler getScheduler() {
		return scheduler;
	}

	private Engine() {
		scheduler = Schedulers.newScheduler();
	}

	private static final Engine instance = new Engine();
	public static Engine get() {
		return instance;
	}

}