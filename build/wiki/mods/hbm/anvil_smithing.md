---
title: "groovyscript.wiki.hbm.anvil_smithing.title"
titleTemplate: "Hbm's Nuclear Tech - Community Edition | CleanroomMC"
description: "groovyscript.wiki.hbm.anvil_smithing.description."
source_code_link: "https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/blob/2.0.0.0/src/main/java/com/hbm/integration/groovy/script/AnvilSmithing.java"
---

# groovyscript.wiki.hbm.anvil_smithing.title (Hbm's Nuclear Tech - Community Edition)

## Description

groovyscript.wiki.hbm.anvil_smithing.description.

:::::::::: details Warning {open id="warning"}
This compat is not fully documented. Some or all of its features are not present on the wiki. View the source code to gain an accurate understanding of the compat.
::::::::::

## Identifier

The identifier `mods.hbm.anvil_smithing` will be used as the default on this page.

:::::::::: details All Identifiers {open id="quote"}

Any of these can be used to refer to this compat:

```groovy:no-line-numbers {4}
mods.hbm.anvilsmithing
mods.hbm.anvilSmithing
mods.hbm.AnvilSmithing
mods.hbm.anvil_smithing/* Used as page default */ // [!code focus]
```

::::::::::

## Adding Recipes

- Add the given recipe to the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.anvil_smithing.add(AnvilSmithingRecipe)
    ```

### Recipe Builder

Just like other recipe types, the groovyscript.wiki.hbm.anvil_smithing.title also uses a recipe builder.

Don't know what a builder is? Check [the builder info page](../../getting_started/builder.md) out.

:::::::::: details Recipe Builder {open id="abstract"}

---

- Create the Recipe Builder.

    ```groovy:no-line-numbers
    mods.hbm.anvil_smithing.recipeBuilder()
    ```

---

- `IngredientList<IIngredient>`. Sets the item inputs of the recipe. Requires greater than or equal to 1.

    ```groovy:no-line-numbers
    input(IIngredient)
    input(IIngredient...)
    input(Collection<IIngredient>)
    ```

- `ItemStackList`. Sets the item outputs of the recipe. Requires exactly 1.

    ```groovy:no-line-numbers
    output(ItemStack)
    output(ItemStack...)
    output(Collection<ItemStack>)
    ```

- `int`. groovyscript.wiki.hbm.anvil_smithing.tier.value. Requires greater than 0. (Default `1`).

    ```groovy:no-line-numbers
    tier(int)
    tierDNT()
    tierIron()
    tierMurky()
    tierSteel()
    tierBismuth()
    tierMeteorite()
    tierStarmetal()
    tierOsmiridium()
    tierSchrabidate()
    tierFerrouranium()
    ```

---

- First validates the builder, returning `null` and outputting errors to the log file if the validation failed, then registers the builder and returns the registered object. (returns `null` or `com.hbm.inventory.recipes.anvil.AnvilSmithingRecipe`).

    ```groovy:no-line-numbers
    register()
    ```

---

::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.anvil_smithing.recipeBuilder()
    .input(item('minecraft:clay'), item('minecraft:clay'))
    .tierIron()
    .output(item('minecraft:diamond'))
    .register()

mods.hbm.anvil_smithing.recipeBuilder()
    .input(item('minecraft:clay'), item('minecraft:clay'))
    .tier(2)
    .output(item('minecraft:diamond')*2)
    .register()
```

:::::::::

::::::::::

## Removing Recipes

- Removes the given recipe from the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.anvil_smithing.remove(AnvilSmithingRecipe)
    ```

- Removes all recipes that match the given output:

    ```groovy:no-line-numbers
    mods.hbm.anvil_smithing.removeByOutput(ItemStack)
    ```

- Removes all registered recipes:

    ```groovy:no-line-numbers
    mods.hbm.anvil_smithing.removeAll()
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.anvil_smithing.removeByOutput(item('minecraft:clay'))
mods.hbm.anvil_smithing.removeAll()
```

::::::::::

## Getting the value of recipes

- Iterates through every entry in the registry, with the ability to call remove on any element to remove it:

    ```groovy:no-line-numbers
    mods.hbm.anvil_smithing.streamRecipes()
    ```
