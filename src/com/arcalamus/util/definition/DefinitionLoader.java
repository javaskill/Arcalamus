package com.arcalamus.util.definition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DefinitionLoader {

	private static final String DEFINITIONS_DIRECTORY = "data/definitions/";
	private static final String DEFINITION_EXTENSION = ".def";
	private static final String DEFINITION_COMMENT_HEAD = "#";
	private static final String DEFINITION_REGEX = ":";

	static final String formatFileName(File file) {
		return file.getName().replace(DEFINITION_EXTENSION, "");
	}

	private final Map<String, Definition> definitions = new HashMap<String, Definition>();

	private final String directory;

	protected DefinitionLoader(String directory) {
		this.directory = directory;
	}

	public String getDirectory() {
		return DEFINITIONS_DIRECTORY + directory + "/";
	}

	public Definition getDefinition(String key) {
		return definitions.get(key);
	}

	public boolean loadDefinition(File file) {
		try {
			final String formattedName = formatFileName(file);

			Definition definition = new Definition(formattedName, this);

			BufferedReader reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				if (!line.startsWith(DEFINITION_COMMENT_HEAD)) {
					String[] split = line.split(DEFINITION_REGEX);
					definition.addProperty(split[0], split[1]);
				}
			}

			reader.close();

			definitions.put(formattedName, definition);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			// ignore printing out stack trace!
			return false;
		}
	}

	public void load() {
		File directory = new File(getDirectory());
		for (File definition : directory.listFiles()) {
			if (definition.isFile() && definition.getName().endsWith(DEFINITION_EXTENSION)) {
				loadDefinition(definition);
			}
		}
	}

	public void unload() {
		definitions.clear();
	}

}