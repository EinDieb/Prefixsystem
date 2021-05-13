package net.phhstudios.mc.prefixsystem.ver.v1_13.listener;

import net.phhstudios.mc.prefixsystem.data.data;
import org.bukkit.Bukkit;
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

            net.minecraft.server.v1_12_R1.IChatBaseComponent tabHeader = net.minecraft.server.v1_12_R1.IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + header + "\"}");
            net.minecraft.server.v1_12_R1.IChatBaseComponent tabFooter = net.minecraft.server.v1_12_R1.IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + footer + "\"}");

            net.minecraft.server.v1_12_R1.PacketPlayOutPlayerListHeaderFooter headerPacket = new net.minecraft.server.v1_12_R1.PacketPlayOutPlayerListHeaderFooter();
            try {
                Field field2 = headerPacket.getClass().getDeclaredField("a");
                field2.setAccessible(true);
                field2.set(headerPacket, tabHeader);
                Field field = headerPacket.getClass().getDeclaredField("b");
                field.setAccessible(true);
                field.set(headerPacket, tabFooter);
            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                ((org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer)player).getHandle().playerConnection.sendPacket(headerPacket);
            }
        }else
        {
            Bukkit.getConsoleSender().sendMessage(data.systemprefix + "§cThe server version could not be found!");
        }
    }

}
