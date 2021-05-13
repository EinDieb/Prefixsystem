package net.phhstudios.mc.prefixsystem.main;

import net.phhstudios.mc.prefixsystem.data.data;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        data.instance = this;
        String version = data.getVersion(data.instance.getServer());
        if (version.startsWith("v1_8"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_8.manager.manager.loadsystem();
        }else if (version.startsWith("v1_9"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_9.manager.manager.loadsystem();
        }else if (version.startsWith("v1_10"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_10.manager.manager.loadsystem();
        }else if (version.startsWith("v1_11"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_11.manager.manager.loadsystem();
        }else if (version.startsWith("v1_12"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_12.manager.manager.loadsystem();
        }else if (version.startsWith("v1_13"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_13.manager.manager.loadsystem();
        }else if (version.startsWith("v1_14"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_14.manager.manager.loadsystem();
        }else if (version.startsWith("v1_15"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_15.manager.manager.loadsystem();
        }else if (version.startsWith("v1_16"))
        {
            net.phhstudios.mc.prefixsystem.ver.v1_16.manager.manager.loadsystem();
        }else
        {
            Bukkit.getConsoleSender().sendMessage(data.systemprefix + "§cThe server version could not be found!");
        }

        super.onEnable();
    }

    @Override
    public void onDisable()
    {

        super.onDisable();
    }
}
