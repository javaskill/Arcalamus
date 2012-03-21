package com.arcalamus.model.entity.player;

import java.awt.Graphics;

import com.arcalamus.model.entity.Entity;
import com.arcalamus.model.map.Position;
import com.arcalamus.util.definition.Definition;

public class Player extends Entity {

	public Player(Definition definition, Position position) {
		super(definition, position);
	}

	public String getUsername() {
		return getDefinition().getProperty("username");
	}

	@Override
	public void render(Graphics g) {

	}

}