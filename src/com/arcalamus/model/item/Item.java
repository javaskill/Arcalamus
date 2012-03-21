package com.arcalamus.model.item;

import java.awt.Graphics;

import com.arcalamus.model.entity.Entity;
import com.arcalamus.model.map.Position;
import com.arcalamus.render.Component;
import com.arcalamus.util.definition.Definition;

public class Item extends Entity implements Component {

	private final int amount;

	public Item(Definition definition, Position position, int amount) {
		super(definition, position);
		this.amount = amount;
	}

	public Item(Definition definition, int amount) {
		this(definition, null, amount);
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

}