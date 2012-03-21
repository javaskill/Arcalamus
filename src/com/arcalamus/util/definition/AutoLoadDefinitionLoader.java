package com.arcalamus.util.definition;

public abstract class AutoLoadDefinitionLoader extends DefinitionLoader {

	protected AutoLoadDefinitionLoader(String directory) {
		super(directory);
		load();
	}

}