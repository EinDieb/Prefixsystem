package net.phhstudios.mc.prefixsystem.data;

import net.phhstudios.mc.prefixsystem.main.Main;
import org.bukkit.Server;

public class data
{
    public static Main instance;
    public static String systemprefix = "§9Prefixsystem §7| ";
    public static String serververion = getVersion(instance.getServer());


    public static String getVersion(Server server)
    {
        String packageName = server.getClass().getPackage().getName();
        return packageName.substring(packageName.lastIndexOf('.') + 1);
    }


}
