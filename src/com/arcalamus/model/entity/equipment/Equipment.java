package com.arcalamus.model.entity.equipment;

import com.arcalamus.model.item.Item;
import com.arcalamus.util.definition.Definition;

public class Equipment extends Item {

	public Equipment(Definition definition, int amount) {
		super(definition, amount);
	}

	public int requiredLevel() {
		return getDefinition().toInteger(getDefinition().getProperty("required-level"));
	}

}