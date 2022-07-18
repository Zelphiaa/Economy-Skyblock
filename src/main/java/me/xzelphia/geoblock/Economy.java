package me.xzelphia.geoblock;

import lombok.Getter;
import me.xzelphia.geoblock.controller.ClassRegistrationController;
import org.bukkit.plugin.java.JavaPlugin;

public class Economy extends JavaPlugin {

    @Getter
    private static Economy instance;
    PaperCommandManager manager = new PaperCommandManager(Bu);
    private final ClassRegistrationController crc = new ClassRegistrationController();

    
    @Override
    public void onEnable() {
        crc.loadListeners("me.elb1to.souppvp.listeners");
        crc.loadCommands("me.elb1to.souppvp.commands");
    }

    public void onDisable(){

    }
}
