package dev.luan.test.Plugin

import org.bukkit.{Location, Material}
import org.bukkit.event.{EventHandler, Listener}
import org.bukkit.event.player.PlayerMoveEvent

class Events extends Listener {

  @EventHandler
  def onPlayerMove(event: PlayerMoveEvent): Unit = {
    val player = event.getPlayer
    if(player.getItemInHand.getType == Material.ICE) {
      val location = new Location(player.getWorld, player.getLocation.getX, player.getLocation.getY - 1, player.getLocation.getZ)
      player.getWorld.getBlockAt(location).setType(Material.ICE)
    }
  }

}