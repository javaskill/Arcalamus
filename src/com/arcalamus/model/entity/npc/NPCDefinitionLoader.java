package com.arcalamus.model.entity.npc;

import com.arcalamus.util.definition.AutoLoadDefinitionLoader;
import com.arcalamus.util.definition.DefinitionLoader;

public class NPCDefinitionLoader extends AutoLoadDefinitionLoader {

	private static final DefinitionLoader instance = new NPCDefinitionLoader();

	public static final DefinitionLoader get() {
		return instance;
	}

	private NPCDefinitionLoader() {
		super("npcs");
	}

}