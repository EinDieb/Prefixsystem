package net.phhstudios.mc.prefixsystem.ver.v1_8.manager;

import net.phhstudios.mc.prefixsystem.data.data;
import net.phhstudios.mc.prefixsystem.main.Main;
import net.phhstudios.mc.prefixsystem.ver.v1_8.commands.ping;
import org.bukkit.Bukkit;

public class manager
{
    public static void loadsystem()
    {
        loadcommands();
        loadevents();
        loadlisteners();
    }

    public static void loadcommands()
    {
        data.instance.getCommand("ping").setExecutor(new ping());
    }

    public static void loadevents()
    {

    }

    public static void loadlisteners()
    {

    }

}
