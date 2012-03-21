package com.arcalamus.model.item;

import java.awt.Graphics;

import com.arcalamus.model.map.Position;
import com.arcalamus.util.definition.Definition;

public class GroundItem extends Item {

	private final Position position;

	public GroundItem(Definition definition, Position position, int amount) {
		super(definition, position, amount);
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public void render(Graphics g) {

	}

}