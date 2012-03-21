package com.arcalamus;

import com.arcalamus.model.entity.equipment.EquipmentDefinitionLoader;
import com.arcalamus.model.entity.npc.NPCDefinitionLoader;

public final class Launcher {

	public static void main(String[] args) {
		EquipmentDefinitionLoader.get();
		NPCDefinitionLoader.get();
	}

}