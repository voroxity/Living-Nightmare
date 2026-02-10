---
title: "groovyscript.wiki.hbm.blast_furnace.title"
titleTemplate: "Hbm's Nuclear Tech - Community Edition | CleanroomMC"
description: "groovyscript.wiki.hbm.blast_furnace.description."
source_code_link: "https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/blob/2.0.0.0/src/main/java/com/hbm/integration/groovy/script/BlastFurnace.java"
---

# groovyscript.wiki.hbm.blast_furnace.title (Hbm's Nuclear Tech - Community Edition)

## Description

groovyscript.wiki.hbm.blast_furnace.description.

:::::::::: details Warning {open id="warning"}
This compat is not fully documented. Some or all of its features are not present on the wiki. View the source code to gain an accurate understanding of the compat.
::::::::::

## Identifier

The identifier `mods.hbm.blast_furnace` will be used as the default on this page.

:::::::::: details All Identifiers {open id="quote"}

Any of these can be used to refer to this compat:

```groovy:no-line-numbers {4}
mods.hbm.blastfurnace
mods.hbm.blastFurnace
mods.hbm.BlastFurnace
mods.hbm.blast_furnace/* Used as page default */ // [!code focus]
```

::::::::::

## Adding Recipes

- Add the given recipe to the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.blast_furnace.add(Tuple.Triplet<Object, Object, ItemStack>)
    ```

## Removing Recipes

- Removes the given recipe from the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.blast_furnace.remove(Tuple.Triplet<Object, Object, ItemStack>)
    ```

- Removes all registered recipes:

    ```groovy:no-line-numbers
    mods.hbm.blast_furnace.removeAll()
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.blast_furnace.removeAll()
```

::::::::::

## Getting the value of recipes

- Iterates through every entry in the registry, with the ability to call remove on any element to remove it:

    ```groovy:no-line-numbers
    mods.hbm.blast_furnace.streamRecipes()
    ```
