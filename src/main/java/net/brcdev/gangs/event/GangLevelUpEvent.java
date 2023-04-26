package net.brcdev.gangs.event;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.brcdev.gangs.gang.Gang;

public class GangLevelUpEvent extends Event implements Cancellable {
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

    public Gang getGang() {
        throw new UnsupportedOperationException("API Reference Only!");
    }

    public int getPreviousLevel() {
        throw new UnsupportedOperationException("API Reference Only!");
    }

    public int getCurrentLevel() {
        throw new UnsupportedOperationException("API Reference Only!");
    }
}
