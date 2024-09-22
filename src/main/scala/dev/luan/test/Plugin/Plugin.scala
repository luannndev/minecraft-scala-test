package dev.luan.test.Plugin

import org.bukkit.plugin.java.JavaPlugin


class TestPlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    System.out.print("§aEnabled scala test plugin")
    getServer.getPluginManager.registerEvents(new Events, this)
  }

}