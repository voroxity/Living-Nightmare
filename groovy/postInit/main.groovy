
log.info('postInit main')

//remove recipe
crafting.removeByOutput(item('malisisdoors:forcefielditem'))//force field door

//Add recipe
crafting.addShapeless(item('hbm:sulfur'), [item('thermalfoundation:material', 771)])//Thermal sulfur to NTM sulfur
furnace.add(item('hbm:sulfur'), item('minecraft:gunpowder'))//NTM sulfur to gunpowder
crafting.addShaped(item('livingnightmare:luna'), [[item('srparasites:lurecomponent5'),item('minecraft:wool'),item('minecraft:wool')],[item('srparasites:lurecomponent1'),item('srparasites:lurecomponent2'),item('srparasites:lurecomponent1')],[item('minecraft:wool'), null,item('minecraft:wool')]])
mods.hbm.Bobmazon.recipeBuilder()
    .output(item('livingnightmare:d6'))
    .setRequirementHidden()
    .setCost(64)
    .setAuthor('voroxity')
    .setComment('LETS GO GAMBLING')
    .setCategoryNormal()
    .setRating(5)
    .register()

//DISSABLED
/*
//ordict
ore_dict.remove('gunpowder', item('mwc:sulfur_dust'))
ore_dict.remove('dustSulfur', item('mwc:sulfur_dust'))
ore_dict.remove('dustSulfur', item('thermalfoundation:material', 771))
ore_dict.remove('ingotCopper', item('mwc:copper_ingot'))
ore_dict.remove('ingotCopper', item('thermalfoundation:material', 128))
ore_dict.remove('ingotCopper', item('projectred-core:resource_item', 100))
ore_dict.remove('ingotLead', item('mwc:lead_ingot'))
ore_dict.remove('ingotTin', item('thermalfoundation:material', 129))
ore_dict.remove('ingotTin', item('projectred-core:resource_item', 101))
ore_dict.remove('ingotLead', item('thermalfoundation:material', 131))
ore_dict.remove('ingotNickel', item('thermalfoundation:material', 133))
ore_dict.remove('ingotaluminum', item('thermalfoundation:material', 132))
ore_dict.remove('ingotSteel', item('thermalfoundation:material', 160))
ore_dict.remove('fuelcoke', item('thermalfoundation:material', 802))
ore_dict.remove('ingotSilver', item('projectred-core:resource_item', 102))
ore_dict.remove('oreTin', item('thermalfoundation:ore', 1))
ore_dict.remove('oreClathrateOilSand', item('thermalfoundation:ore_fluid:', 0))
ore_dict.remove('oreClathrateOilShale', item('thermalfoundation:ore_fluid', 1))
ore_dict.add('oreLimestone', item('chisel:limestone:*'))
ore_dict.add('oreLimestone', item('chisel:limestone1:*'))
ore_dict.add('oreLimestone', item('chisel:limestone2:*'))
//crafting table
crafting.removeByOutput(item('thermalfoundation:material:128'))
crafting.removeByOutput(item('thermalfoundation:material:129'))
crafting.removeByOutput(item('thermalfoundation:material:131'))
crafting.removeByOutput(item('thermalfoundation:material:132'))
crafting.removeByOutput(item('thermalfoundation:material:160'))
crafting.removeByOutput(item('thermalfoundation:material:802'))
crafting.removeByOutput(item('thermalfoundation:material', 771))
crafting.removeByInput(item('thermalfoundation:material:132'))
crafting.removeByInput(item('thermalfoundation:material:802'))
crafting.removeByInput(item('thermalfoundation:material', 771))
//furnace
furnace.add(item('hbm:powder_quartz'), item('appliedenergistics2:material', 5))
furnace.removeByInput(item('mwc:sulfur_dust:*'))
furnace.removeByInput(item('mwc:copper_ore:*'))
furnace.removeByInput(item('mwc:lead_ore:*'))
furnace.removeByOutput(item('thermalfoundation:material', 771))
//JEI
mods.jei.ingredient.hide(item('mwc:sulfur_dust'))
mods.jei.ingredient.hide(item('mwc:sulfur_ore'))
mods.jei.ingredient.hide(item('mwc:copper_ore'))
mods.jei.ingredient.hide(item('mwc:copper_ingot'))
mods.jei.ingredient.hide(item('mwc:lead_ore'))
mods.jei.ingredient.hide(item('mwc:lead_ingot'))
*/