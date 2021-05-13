package net.phhstudios.mc.prefixsystem.ver.v1_15.listener;

import net.minecraft.server.v1_14_R1.IChatBaseComponent;
import net.minecraft.server.v1_14_R1.PacketPlayOutPlayerListHeaderFooter;
import net.phhstudios.mc.prefixsystem.data.data;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class HeaderandFooteronTab
{

    public static void sendTablistHeaderAndFooter(Player player, String header, String footer)
    {
        if (data.serververion.startsWith("v1_12"))
        {
            if(header == null) header = "";
            if(footer == null) footer = "";

            PacketPlayOutPlayerListHeaderFooter packetPlayOutPlayerListHeaderFooter = new PacketPlayOutPlayerListHeaderFooter();
            packetPlayOutPlayerListHeaderFooter.header = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + header + "\"}");
            packetPlayOutPlayerListHeaderFooter.footer = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + footer + "\"}");
            Bukkit.getOnlinePlayers().forEach(o -> ((CraftPlayer) o).getHandle().playerConnection.sendPacket(packetPlayOutPlayerListHeaderFooter));
        }else
        {
            Bukkit.getConsoleSender().sendMessage(data.systemprefix + "§cThe server version could not be found!");
        }
    }

}
