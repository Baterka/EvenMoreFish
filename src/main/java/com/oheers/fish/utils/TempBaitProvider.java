package com.oheers.fish.utils;

import com.oheers.fish.FishUtils;
import com.oheers.fish.baits.Bait;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Collections;
import java.util.Random;

public class TempBaitProvider implements Listener {

	@EventHandler
	public void onMove(PlayerMoveEvent event) {
		try {
			if (event.getFrom().getChunk() != event.getTo().getChunk()) {
				String[] knownBaits = { "Shrimp", "Rare Elixir" };
				FishUtils.giveItems(Collections.singletonList(new Bait(knownBaits[new Random().nextInt(2)]).create()), event.getPlayer());
			}
		} catch (NullPointerException ignored) {}
	}
}
