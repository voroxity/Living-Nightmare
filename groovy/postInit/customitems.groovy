import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem
import net.minecraftforge.event.entity.player.PlayerInteractEvent
import net.minecraft.util.text.TextComponentString
import java.util.Random
import net.minecraft.init.Items
import net.minecraft.init.SoundEvents
import net.minecraft.util.SoundCategory
import net.minecraft.potion.Potion
import net.minecraft.potion.PotionEffect
import net.minecraft.util.DamageSource
import net.minecraftforge.event.entity.player.ItemTooltipEvent

@groovy.transform.Field def tooltipMap = [:]

event_manager.listen { ItemTooltipEvent event ->
    for (def entry in tooltipMap) { // iterate tooltip map
        if (event.getItemStack() in entry.key) { // if the item in the event matches the map entry
            event.getToolTip() << entry.value    // add the line of the map entry
        }
    }
}

def addTooltip(ItemStack itemStack, String line) {
    tooltipMap[itemStack] = line // store item and line in map
}

addTooltip(item('livingnightmare:d6'), 'LETS GO GAMBLING')
addTooltip(item('livingnightmare:luna'), 'She is so cute I could eat her.')

// Define a custom damage source with a unique ID string
def diceDamage = new DamageSource("diceroll")
        .setDamageBypassesArmor()   // optional: ignores armor
        .setDamageIsAbsolute()      // optional: ignores resistance
        .setMagicDamage()           // optional: marked as magic

event_manager.listen { RightClickItem event ->
    def player = event.entityPlayer
    def stack  = event.itemStack
    def D6     = item('livingnightmare:d6')

    if (!player.world.isRemote && stack != null && stack.item == D6.item) {

        def rng = new Random()
        int roll = rng.nextInt(6) + 1

        def msg = new TextComponentString("${player.name} rolled a ${roll}")
        player.world.playerEntities.each { p ->
            p.sendMessage(msg)
        }

        // On 1, kill the player and play anvil hit
        if (roll <= 1) {
            
            // Kill the player
            player.attackEntityFrom(diceDamage, Float.MAX_VALUE)

            // Play anvil hit sound at the player's position
            player.world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.PLAYERS, 2.0F, 0.5F)
            player.world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_WITHER_HURT, SoundCategory.PLAYERS, 2.0F, 2.0F)
        }

        // On 6, give a potion effect
        if (roll >= 6) {

            player.world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1.0F, 1.0F)
            player.world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_WITHER_BREAK_BLOCK, SoundCategory.PLAYERS, 1.5F, 1.0F)
            // potion effect
            int duration  = 20 * 60   // ticks
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("strength"), duration, 4))
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("resistance"), duration, 4))
        }
    }
}

event_manager.listen { RightClickItem event ->
    def stack = event.itemStack
    if (stack == null) return
    if (stack.item != item('livingnightmare:luna').item) return

    def player = event.entityPlayer
    def world = player.world
    if (world.isRemote) return  // server side only

    // Cancel normal use
    event.setCanceled(true)

    // Play eating sound at the player
    world.playSound(
        null,                          // player for whom to play sound; null = everyone nearby
        player.posX,
        player.posY,
        player.posZ,
        SoundEvents.ENTITY_GENERIC_EAT, // change to any sound you want
        SoundCategory.PLAYERS,
        5.0F,                          // volume
        1.0F                           // pitch
    )

    world.playSound(
        null,                          // player for whom to play sound; null = everyone nearby
        player.posX,
        player.posY,
        player.posZ,
        SoundEvents.ENTITY_PLAYER_BURP, // change to any sound you want
        SoundCategory.PLAYERS,
        1.0F,                          // volume
        0.75F                           // pitch
    )

    // Consume 1 item
    stack.shrink(1)
}