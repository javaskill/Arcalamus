package com.arcalamus.model.map;

import java.awt.Graphics;
import java.io.File;

import com.arcalamus.render.Component;

public class Tile implements Component {

	private Type type;
	private final Position position;

	public Tile(Type type, Position position) {
		this.type = type;
		this.position = position;
	}

	public Type getType() {
		return type;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public void render(Graphics g) {
		
	}
	
	@Override
	public String toString() {
		return position + ", " + type.name();
	}

	public static enum Type {
		GRASS(true),
		STONE(true),
		WATER(false);

		private final File file;
		private final boolean walkable;

		Type(boolean walkable) {
			this.file = new File("sprites/tiles/" + name().toLowerCase() + ".png");//fix
			this.walkable = walkable;
		}

		public File getFile() {
			return file;
		}

		public boolean isWalkable() {
			return walkable;
		}

	}

}