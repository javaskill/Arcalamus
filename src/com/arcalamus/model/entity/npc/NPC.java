package com.arcalamus.model.entity.npc;

import java.awt.Graphics;

import com.arcalamus.model.entity.Entity;
import com.arcalamus.model.map.Position;
import com.arcalamus.util.definition.Definition;

import static com.arcalamus.util.strings.StringUtils.toBoolean;

public class NPC extends Entity {

	public NPC(Definition definition, Position position) {
		super(definition, position);
	}

	public boolean isAggressive() {
		return toBoolean(getDefinition().getProperty("aggressive"));
	}

	public boolean isAttackable() {
		return toBoolean(getDefinition().getProperty("attackable"));
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

}