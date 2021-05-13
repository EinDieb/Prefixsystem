package net.phhstudios.mc.prefixsystem.ver.v1_8.commands;


import de.phh.prefix.main.Main;
import net.phhstudios.mc.prefixsystem.data.data;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor
{
	public boolean ping;


	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("ping"))
		{
			if(!(sender instanceof Player)) {
				Bukkit.getConsoleSender().sendMessage(data.systemprefix + "§cNot available for the console");
				return false;
			}

			Player p = (Player)sender;
			if(Main.isactivated("Ping", "enable", null) == true)
			{
				if(args.length == 0)
				{
					p.sendMessage(Main.getreplace(Main.ismessage("Ping","message",null),p,true).replaceAll("%ping%", ""+getPing(p)));
				}
			}else
			{
				p.sendMessage(Main.getreplace(Main.ismessage("PrefixSystem","disablecommand",null),p,true));
			}
		}
		
	return false;
    
	}

	public int getPing(Player p) {
		return ((org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer)p).getHandle().playerConnection.player.ping;
	}
		

	
}
