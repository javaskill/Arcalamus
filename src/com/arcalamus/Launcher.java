package com.arcalamus;

import com.arcalamus.event.Events;
import com.arcalamus.model.entity.equipment.EquipmentDefinitionLoader;
import com.arcalamus.model.entity.npc.NPCDefinitionLoader;
import com.arcalamus.window.Window;

public final class Launcher {

	public static void main(String[] args) {
		Events.get();
		Window.get();
		EquipmentDefinitionLoader.get();
		NPCDefinitionLoader.get();
	}

}