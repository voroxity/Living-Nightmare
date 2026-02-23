// debug_only
import net.minecraft.server.MinecraftServer
import net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent
import net.minecraft.util.text.TextComponentString
import net.minecraftforge.fml.common.FMLCommonHandler

// === CONFIG ===
if (!this.hasProperty("commandToRun")) {
    this.commandToRun = "/srpevolution getphase"
}
if (!this.hasProperty("intervalTicks")) {
    this.intervalTicks = 20 * 60
}

// === STATE ===
if (!this.hasProperty("autoRunnerEnabled")) this.autoRunnerEnabled = false
if (!this.hasProperty("tickCounter"))       this.tickCounter       = 0

// === HELPERS ===
// No capturing, just run the command.
void runAndLog(MinecraftServer mcServer, String cmd) {
    def commandManager = mcServer.commandManager
    commandManager.executeCommand(mcServer, cmd)
}

// === TICK HANDLER ===
event_manager.listen { ServerTickEvent event ->
    tickCounter++
    if (!autoRunnerEnabled) return

    def server = FMLCommonHandler.instance().minecraftServerInstance
    if (server == null) return

    if (tickCounter % intervalTicks == 0) {
        runAndLog(server, commandToRun)
    }
}

// === COMMANDS ===
minecraft.command.registerCommand('gstart', { server, sender, args ->
    autoRunnerEnabled = true
    sender.sendMessage(new TextComponentString("Groovy auto-command runner: started."))
})

minecraft.command.registerCommand('gstop', { server, sender, args ->
    autoRunnerEnabled = false
    sender.sendMessage(new TextComponentString("Groovy auto-command runner: stopped."))
})

minecraft.command.registerCommand('gtoggle', { server, sender, args ->
    autoRunnerEnabled = !autoRunnerEnabled
    def state = autoRunnerEnabled ? "started" : "stopped"
    sender.sendMessage(new TextComponentString("Groovy auto-command runner: " + state + "."))
})