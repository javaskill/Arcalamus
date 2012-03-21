package com.arcalamus.model.entity.npc;

import java.awt.Graphics;

import com.arcalamus.model.entity.Entity;
import com.arcalamus.model.map.Position;
import com.arcalamus.util.definition.Definition;

public class NPC extends Entity {

	public NPC(Definition definition, Position position) {
		super(definition, position);
	}

	public boolean isAggressive() {
		return getDefinition().toBoolean(getDefinition().getProperty("aggressive"));
	}

	public boolean isAttackable() {
		return getDefinition().toBoolean(getDefinition().getProperty("attackable"));
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

}