package com.arcalamus.model.entity.equipment;

import com.arcalamus.util.definition.AutoLoadDefinitionLoader;
import com.arcalamus.util.definition.DefinitionLoader;

public class EquipmentDefinitionLoader extends AutoLoadDefinitionLoader {

	private static final DefinitionLoader instance = new EquipmentDefinitionLoader();

	public static final DefinitionLoader get() {
		return instance;
	}

	private EquipmentDefinitionLoader() {
		super("equipment");
	}

}