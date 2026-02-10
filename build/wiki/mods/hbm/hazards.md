---
title: "groovyscript.wiki.hbm.hazards.title"
titleTemplate: "Hbm's Nuclear Tech - Community Edition | CleanroomMC"
description: "groovyscript.wiki.hbm.hazards.description."
source_code_link: "https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/blob/2.0.0.0/src/main/java/com/hbm/integration/groovy/script/Hazards.java"
---

# groovyscript.wiki.hbm.hazards.title (Hbm's Nuclear Tech - Community Edition)

## Description

groovyscript.wiki.hbm.hazards.description.

## Identifier

The identifier `mods.hbm.hazards` will be used as the default on this page.

:::::::::: details All Identifiers {open id="quote"}

Any of these can be used to refer to this compat:

```groovy:no-line-numbers {1}
mods.hbm.hazards/* Used as page default */ // [!code focus]
```

::::::::::

## Editing Values

- Recompute cache and schedule updates for all online players. Called automatically by mutating methods:

    ```groovy:no-line-numbers
    mods.hbm.hazards.refresh()
    ```

- Add a target to the hazard blacklist. The target won't be evaluated for hazards until unblacklisted:

    ```groovy:no-line-numbers
    mods.hbm.hazards.blacklist(Object)
    ```

- Remove a target from the hazard blacklist. Returns true if an entry was removed:

    ```groovy:no-line-numbers
    mods.hbm.hazards.unblacklist(Object)
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.hazards.refresh()
```

::::::::::

## Adding Recipes

- Register hazard data using a Groovy closure DSL. The closure receives a HazardDataBuilder as its delegate:

    ```groovy:no-line-numbers
    mods.hbm.hazards.register(Object, Closure<?>)
    ```

- Register hazard data for a target (Item/ItemStack/Block/ore dict/ResourceLocation/IIngredient/Collection). Replaces existing data, backs up old mapping for reload:

    ```groovy:no-line-numbers
    mods.hbm.hazards.register(Object, HazardData)
    ```

- Register hazard data using a builder. Equivalent to register(target, builder.build()):

    ```groovy:no-line-numbers
    mods.hbm.hazards.register(Object, Hazards.HazardDataBuilder)
    ```

- Add a post-transformer for a specific Item or ItemStack. If respectNbt=true, only applies when sanitized NBT matches. Runs after built-in and fluid hazards. The transformer receives (stack, entries) and must return the new list:

    ```groovy:no-line-numbers
    mods.hbm.hazards.postTransform(Object, boolean, BiFunction<ItemStack, List<HazardEntry>, List<HazardEntry>>)
    ```

- Multiply all computed hazard entries for an Item after fluid passes. Example: multiplyItemHazards('hbm:hot_ingot', 0.5D):

    ```groovy:no-line-numbers
    mods.hbm.hazards.multiplyItemHazards(Object, double)
    ```

## Removing Recipes

- Remove hazard mappings for a target (Item/Stack/etc.). Restores previous mapping on reload if one existed:

    ```groovy:no-line-numbers
    mods.hbm.hazards.unregister(Object)
    ```

- Clear internal hazard caches without changing mappings. Use after bulk content changes:

    ```groovy:no-line-numbers
    mods.hbm.hazards.clearCaches()
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.hazards.clearCaches()
```

::::::::::

## Getting the value of recipes

- Create a new mutable HazardData builder. Use with DSL or method chaining, then call build():

    ```groovy:no-line-numbers
    mods.hbm.hazards.data()
    ```

- Accessors for built-in and factory hazard types. Example: hazards.getTypes().radiation():

    ```groovy:no-line-numbers
    mods.hbm.hazards.getTypes()
    ```

- Compute hazard level for the given ItemStack and HazardType. Returns 0 if stack/type invalid:

    ```groovy:no-line-numbers
    mods.hbm.hazards.hazardLevel(ItemStack, IHazardType)
    ```

- Accessors for helper hazard modifiers (fuel/RTG/RBMK/etc.):

    ```groovy:no-line-numbers
    mods.hbm.hazards.getModifiers()
    ```

- Convenience: read radiation hazard level for the given ItemStack. Returns 0 if empty:

    ```groovy:no-line-numbers
    mods.hbm.hazards.radiationLevel(ItemStack)
    ```
