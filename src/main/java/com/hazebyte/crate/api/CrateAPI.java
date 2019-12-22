package com.hazebyte.crate.api;

import com.hazebyte.crate.api.crate.BlockCrateRegistrar;
import com.hazebyte.crate.api.crate.CrateRegistrar;
import org.bukkit.Bukkit;

import java.io.File;

public class CrateAPI {
    private static CratePlugin instance;
    public static String SERVER_VERSION = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];

    private CrateAPI() {}

    public static File getDataFolder() {
        return instance.getDataFolder();
    }

    public static CrateRegistrar getCrateRegistrar() {
        return getInstance().getCrateRegistrar();
    }

    public static BlockCrateRegistrar getBlockCrateRegistrar() {
        return getInstance().getBlockCrateRegistrar();
    }

    public static boolean hasImplementation() {
        return instance != null;
    }

    public static void setImplementation(CratePlugin plugin) {
        instance = plugin;
    }

    public static CratePlugin getInstance() {
        if(instance == null) {
            throw new NullPointerException("CrateReloaded not found.");
        }

        return instance;
    }

    public static String getMessage(String key) {
        return getInstance().getMessage(key);
    }
}
