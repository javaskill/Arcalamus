package com.arcalamus.model.map;

public class World {

	private final Layer[] layers = new Layer[Layer.Type.values().length];

	public Layer getLayer(Layer.Type type) {
		return layers[type.ordinal()];
	}

}