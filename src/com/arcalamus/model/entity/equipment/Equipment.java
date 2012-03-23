package com.arcalamus.model.entity.equipment;

import com.arcalamus.model.item.Item;
import com.arcalamus.util.definition.Definition;
import com.arcalamus.util.strings.StringUtils;

public class Equipment extends Item {

	public Equipment(Definition definition, int amount) {
		super(definition, amount);
	}

	public int requiredLevel() {
		return StringUtils.toInteger(getDefinition().getProperty("required-level"));
	}

}