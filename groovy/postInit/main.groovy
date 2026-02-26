
log.info('postint loaded')
//oredict
//remove from the ore dict
ore_dict.remove('gunpowder', item('mwc:sulfur_dust'))
ore_dict.remove('dustSulfur', item('mwc:sulfur_dust'))
ore_dict.remove('ingotCopper', item('mwc:copper_ingot'))
ore_dict.remove('ingotLead', item('mwc:lead_ingot'))
ore_dict.remove('oreTin', item('thermalfoundation:ore', 1))
ore_dict.remove('oreClathrateOilSand', item('thermalfoundation:ore_fluid:', 0))
ore_dict.remove('oreClathrateOilShale', item('thermalfoundation:ore_fluid', 1))
ore_dict.remove('ingotCopper', item('thermalfoundation:material', 128))
ore_dict.remove('ingotTin', item('thermalfoundation:material', 129))
ore_dict.remove('ingotLead', item('thermalfoundation:material', 131))
ore_dict.remove('ingotNickel', item('thermalfoundation:material', 133))
ore_dict.remove('ingotaluminum', item('thermalfoundation:material', 132))
ore_dict.remove('ingotSteel', item('thermalfoundation:material', 160))
ore_dict.remove('fuelcoke', item('thermalfoundation:material', 802))
ore_dict.remove('dustSulfur', item('thermalfoundation:material', 771))
//add to the ore dict
ore_dict.add('oreLimestone', item('chisel:limestone:*'))
ore_dict.add('oreLimestone', item('chisel:limestone1:*'))
ore_dict.add('oreLimestone', item('chisel:limestone2:*'))

//crafting
//remove by output
crafting.removeByOutput(item('malisisdoors:forcefielditem'))
crafting.removeByOutput(item('thermalfoundation:material:128'))
crafting.removeByOutput(item('thermalfoundation:material:129'))
crafting.removeByOutput(item('thermalfoundation:material:131'))
crafting.removeByOutput(item('thermalfoundation:material:132'))
crafting.removeByOutput(item('thermalfoundation:material:160'))
crafting.removeByOutput(item('thermalfoundation:material:802'))
crafting.removeByOutput(item('thermalfoundation:material', 771))
//remove by input
crafting.removeByInput(item('thermalfoundation:material:132'))
crafting.removeByInput(item('thermalfoundation:material:802'))
crafting.removeByInput(item('thermalfoundation:material', 771))
//add
crafting.addShapeless(item('hbm:sulfur'), [item('thermalfoundation:material', 771)])

//smelting
//remove by input
furnace.removeByInput(item('mwc:sulfur_dust:*'))
furnace.removeByInput(item('mwc:copper_ore:*'))
furnace.removeByInput(item('mwc:lead_ore:*'))
//remove by out put
furnace.removeByOutput(item('thermalfoundation:material', 771))
//add
furnace.add(item('hbm:sulfur'), item('minecraft:gunpowder'))
furnace.add(item('hbm:powder_quartz'), item('appliedenergistics2:material', 5))

//jei
mods.jei.ingredient.hide(item('mwc:sulfur_dust'))
mods.jei.ingredient.hide(item('mwc:sulfur_ore'))
mods.jei.ingredient.hide(item('mwc:copper_ore'))
mods.jei.ingredient.hide(item('mwc:copper_ingot'))
mods.jei.ingredient.hide(item('mwc:lead_ore'))
mods.jei.ingredient.hide(item('mwc:lead_ingot'))
