---
title: "groovyscript.wiki.hbm.anvil_construction.title"
titleTemplate: "Hbm's Nuclear Tech - Community Edition | CleanroomMC"
description: "groovyscript.wiki.hbm.anvil_construction.description."
source_code_link: "https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/blob/2.0.0.0/src/main/java/com/hbm/integration/groovy/script/AnvilConstruction.java"
---

# groovyscript.wiki.hbm.anvil_construction.title (Hbm's Nuclear Tech - Community Edition)

## Description

groovyscript.wiki.hbm.anvil_construction.description.

:::::::::: details Warning {open id="warning"}
This compat is not fully documented. Some or all of its features are not present on the wiki. View the source code to gain an accurate understanding of the compat.
::::::::::

## Identifier

The identifier `mods.hbm.anvil_construction` will be used as the default on this page.

:::::::::: details All Identifiers {open id="quote"}

Any of these can be used to refer to this compat:

```groovy:no-line-numbers {4}
mods.hbm.anvilconstruction
mods.hbm.anvilConstruction
mods.hbm.AnvilConstruction
mods.hbm.anvil_construction/* Used as page default */ // [!code focus]
```

::::::::::

## Adding Recipes

- Add the given recipe to the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.add(AnvilRecipes.AnvilConstructionRecipe)
    ```

### Recipe Builder

Just like other recipe types, the groovyscript.wiki.hbm.anvil_construction.title also uses a recipe builder.

Don't know what a builder is? Check [the builder info page](../../getting_started/builder.md) out.

:::::::::: details Recipe Builder {open id="abstract"}

---

- Create the Recipe Builder.

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.recipeBuilder()
    ```

---

- `int`. groovyscript.wiki.hbm.anvil_construction.maxTier.value. Requires less than or equal to 0. (Default `1916169`).

    ```groovy:no-line-numbers
    maxTier(int)
    maxTierDNT()
    maxTierIron()
    maxTierMurky()
    maxTierSteel()
    maxTierBismuth()
    maxTierMeteorite()
    maxTierStarmetal()
    maxTierOsmiridium()
    maxTierSchrabidate()
    maxTierFerrouranium()
    ```

- `int`. groovyscript.wiki.hbm.anvil_construction.minTier.value. Requires greater than 0. (Default `1`).

    ```groovy:no-line-numbers
    minTier(int)
    minTierDNT()
    minTierIron()
    minTierMurky()
    minTierSteel()
    minTierBismuth()
    minTierMeteorite()
    minTierStarmetal()
    minTierOsmiridium()
    minTierSchrabidate()
    minTierFerrouranium()
    ```

- `AnvilRecipes.OverlayType`. groovyscript.wiki.hbm.anvil_construction.overlayType.value. Requires not null. (Default `NONE`).

    ```groovy:no-line-numbers
    OverlayNone()
    OverlaySmithing()
    OverlayRecycling()
    OverlayConstruction()
    ```

---

- First validates the builder, returning `null` and outputting errors to the log file if the validation failed, then registers the builder and returns the registered object. (returns `null` or `com.hbm.inventory.recipes.anvil.AnvilRecipes$AnvilConstructionRecipe`).

    ```groovy:no-line-numbers
    register()
    ```

---

::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.anvil_construction.recipeBuilder()
    .input(item('minecraft:clay'), item('minecraft:clay'))
    .OverlayConstruction()
    .output(item('minecraft:diamond'))
    .register()
    .register()

mods.hbm.anvil_construction.recipeBuilder()
    .input(item('minecraft:clay'))
    .output(item('minecraft:diamond')*2, item('minecraft:diamond')*2)
    .OverlayRecycling()
    .maxTier(4)
    .register()
    .register()
```

:::::::::

::::::::::

## Removing Recipes

- Removes the given recipe from the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.remove(AnvilRecipes.AnvilConstructionRecipe)
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllNone:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllNone()
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllNone:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllNone(IIngredient)
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllSmithing:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllSmithing()
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllSmithing:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllSmithing(IIngredient)
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllRecycling:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllRecycling()
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllRecycling:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllRecycling(IIngredient)
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllConstruction:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllConstruction()
    ```

- groovyscript.wiki.hbm.anvil_construction.removeAllConstruction:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAllConstruction(IIngredient)
    ```

- Removes all registered recipes:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.removeAll()
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.anvil_construction.removeAllNone()
mods.hbm.anvil_construction.removeAllNone(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAllSmithing()
mods.hbm.anvil_construction.removeAllSmithing(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAllRecycling()
mods.hbm.anvil_construction.removeAllRecycling(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAllConstruction()
mods.hbm.anvil_construction.removeAllConstruction(item('minecraft:clay'))
mods.hbm.anvil_construction.removeAll()
```

::::::::::

## Getting the value of recipes

- Iterates through every entry in the registry, with the ability to call remove on any element to remove it:

    ```groovy:no-line-numbers
    mods.hbm.anvil_construction.streamRecipes()
    ```
