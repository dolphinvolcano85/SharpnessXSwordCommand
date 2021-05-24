package com.nublux.sharpnessxSword;

import org.bukkit.plugin.java.JavaPlugin;

public class Sword extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("sword").setExecutor(new SharpnessXSwordCMD());
    }
}
