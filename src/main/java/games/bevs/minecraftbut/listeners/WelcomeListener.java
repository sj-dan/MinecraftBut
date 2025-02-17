package games.bevs.minecraftbut.listeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import games.bevs.minecraftbut.commons.utils.CC;
import games.bevs.minecraftbut.world.ButWorld;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class WelcomeListener implements Listener
{
	@Getter
	private ButWorld butWorld;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player player = e.getPlayer();
		World world = player.getWorld();
		
		if(this.getButWorld().getWorld() != world)
			return;
		
		player.sendMessage(CC.bAqua + "  MinecraftBut " + CC.gray + "made by " + CC.bAqua + "Sprock" + CC.gray + "!");
	}
}
