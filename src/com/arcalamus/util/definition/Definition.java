package com.arcalamus.util.definition;

import java.util.HashMap;
import java.util.Map;

import com.arcalamus.util.strings.StringConverter;

public class Definition extends StringConverter {

	private final Map<String, String> properties = new HashMap<String, String>();

	private final String name;
	private final DefinitionLoader loader;

	protected Definition(String name, DefinitionLoader loader) {
		this.name = name;
		this.loader = loader;
	}

	public String getName() {
		return name;
	}

	public DefinitionLoader getLoader() {
		return loader;
	}

	public String getProperty(String key) {
		return properties.get(key);
	}

	protected Map<String, String> getProperties() {
		return properties;
	}

	protected void addProperty(String key, String value) {
		properties.put(key, value);
	}

}