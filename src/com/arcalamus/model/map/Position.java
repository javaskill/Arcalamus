package com.arcalamus.model.map;

public class Position {

	private int x, y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	private Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Position)) {
			return false;
		}
		Position position = (Position) o;
		return getX() == position.getX() && getY() == position.getY();
	}

	public static Position create(int x, int y) {
		return new Position(x, y);
	}

}