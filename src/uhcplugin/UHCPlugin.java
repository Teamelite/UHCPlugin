package uhcplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class UHCPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Plugin Enabled");
    }
}
