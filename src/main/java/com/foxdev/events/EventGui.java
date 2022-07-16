package com.foxdev.events;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EventGui implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        Player p = (Player) sender;
        Gui gui = Gui.gui()
                .disableAllInteractions()
                .title(Component.text("Events!"))
                .rows(2)
                .create();

        GuiItem dropparty = ItemBuilder.from(Material.PAPER).name(Component.text("DropParty")).asGuiItem(event -> {

            Bukkit.broadcastMessage(Math.round(p.getLocation().getX()) + " A drop party will be there!");

        });

        GuiItem veiling = ItemBuilder.from(Material.PAPER).name(Component.text("Veiling")).asGuiItem(event -> {

            Bukkit.broadcastMessage(Math.round(p.getLocation().getX()) + " A Veiling will be there!");

        });

        gui.setItem(5, dropparty);
        gui.setItem(7, veiling);

        gui.open(p);

        return false;
    }
}
