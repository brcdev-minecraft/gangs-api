package net.brcdev.gangs.event;

import net.brcdev.gangs.gang.Gang;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerLeaveGangEvent extends Event implements Cancellable {
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

  public OfflinePlayer getOfflinePlayer() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public Player getKickedBy() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public Gang getGang() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public LeaveReason getLeaveReason() {
    throw new UnsupportedOperationException("API Reference Only!");
  }

  public enum LeaveReason {
    DISBANDED, DISBANDED_LEADER, KICKED, LEFT
  }
}
