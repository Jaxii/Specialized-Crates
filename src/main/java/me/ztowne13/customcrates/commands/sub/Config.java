package me.ztowne13.customcrates.commands.sub;

import me.ztowne13.customcrates.SpecializedCrates;
import me.ztowne13.customcrates.commands.Commands;
import me.ztowne13.customcrates.interfaces.igc.IGCMenuMain;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by ztowne13 on 6/23/16.
 */
public class Config extends SubCommand {
    public Config() {
        super("config", 1, "", new String[]{"conf", "c", "configure", "igc", "configuration", "yml"});
    }

    @Override
    public boolean run(SpecializedCrates cc, Commands cmds, String[] args) {
        CommandSender sender = cmds.getCmdSender();
        if (cmds.canExecute(false, false, "")) {
            new IGCMenuMain(cc, (Player) sender, null).open();
            cmds.msgSuccess("Opened in game configuration.");
            return true;
        } else {
            cmds.msgError("This is an in-game command only.");
            return false;
        }
    }
}
