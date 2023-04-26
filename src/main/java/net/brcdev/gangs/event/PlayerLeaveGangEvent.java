package net.brcdev.gangs.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.brcdev.gangs.gang.Gang;

public class PlayerLeaveGangEvent extends Event implements Cancellable {
    public enum LeaveReason {
        DISBANDED, DISBANDED_LEADER, KICKED, LEFT
    }

    public HandlerList getHandlers() {
        throw new UnsupportedOperationException("API Reference Only!");
    }

    public static HandlerList getHandlerList() {
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
}
