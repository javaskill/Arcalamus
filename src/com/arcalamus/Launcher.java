package com.arcalamus;

import com.arcalamus.engine.Engine;
import com.arcalamus.model.entity.equipment.EquipmentDefinitionLoader;
import com.arcalamus.model.entity.npc.NPCDefinitionLoader;
import com.arcalamus.util.event.EventManager;
import com.arcalamus.window.Window;

public final class Launcher {

	public static void main(String[] args) {
		Engine.get();
		
		EventManager.get();

		EquipmentDefinitionLoader.get();
		NPCDefinitionLoader.get();

		Window.get();
	}

}