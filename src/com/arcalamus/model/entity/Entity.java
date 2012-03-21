package com.arcalamus.model.entity;

import com.arcalamus.model.map.Position;
import com.arcalamus.render.Component;
import com.arcalamus.util.definition.Definition;

public abstract class Entity implements Component {

	private final Definition definition;
	private final Position position;

	public Entity(Definition definition, Position position) {
		this.definition = definition;
		this.position = position;
	}

	public Definition getDefinition() {
		return definition;
	}

	public Position getPosition() {
		return position;
	}

}