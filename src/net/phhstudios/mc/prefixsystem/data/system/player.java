package net.phhstudios.mc.prefixsystem.data.system;

import org.bukkit.entity.Player;

public class player
{

    public static boolean hasPermission(Player p, String perm)
    {

        if(p.hasPermission(perm) || p.hasPermission("*"))
        {
            return true;
        }else
        {
            return false;
        }

    }

}
