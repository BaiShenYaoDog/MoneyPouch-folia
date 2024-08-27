package com.leonardobishop.moneypouch.gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class Menu {

    private final Player player;
    private Menu superMenu;
    private Inventory inventory;

    public Menu(Player player) {
        this.player = player;
    }

    public Menu getSuperMenu() {
        return superMenu;
    }

    public void setSuperMenu(Menu superMenu) {
        this.superMenu = superMenu;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public abstract void onClick(int slot);

    public abstract void update();

    public abstract void initialize();

}
