package net.brcdev.gangs.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerAllyChatEvent extends Event implements Cancellable {
  public static HandlerList getHandlerList() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public HandlerList getHandlers() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public boolean isCancelled() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public void setCancelled(boolean cancelled) {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public Player getPlayer() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public String getMessage() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public void setMessage(String message) {
    throw new UnsupportedOperationException("API Reference Only!");
  }
}
