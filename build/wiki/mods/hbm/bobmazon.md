---
title: "groovyscript.wiki.hbm.bobmazon.title"
titleTemplate: "Hbm's Nuclear Tech - Community Edition | CleanroomMC"
description: "groovyscript.wiki.hbm.bobmazon.description."
source_code_link: "https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/blob/2.0.0.0/src/main/java/com/hbm/integration/groovy/script/Bobmazon.java"
---

# groovyscript.wiki.hbm.bobmazon.title (Hbm's Nuclear Tech - Community Edition)

## Description

groovyscript.wiki.hbm.bobmazon.description.

:::::::::: details Warning {open id="warning"}
This compat is not fully documented. Some or all of its features are not present on the wiki. View the source code to gain an accurate understanding of the compat.
::::::::::

## Identifier

The identifier `mods.hbm.bobmazon` will be used as the default on this page.

:::::::::: details All Identifiers {open id="quote"}

Any of these can be used to refer to this compat:

```groovy:no-line-numbers {1}
mods.hbm.bobmazon/* Used as page default */ // [!code focus]
mods.hbm.Bobmazon
```

::::::::::

## Adding Recipes

- Add the given recipe to the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.bobmazon.add(Tuple<BobmazonOfferFactory.OfferCategory, GUIScreenBobmazon.Offer>)
    ```

## Removing Recipes

- Removes the given recipe from the recipe list:

    ```groovy:no-line-numbers
    mods.hbm.bobmazon.remove(Tuple<BobmazonOfferFactory.OfferCategory, GUIScreenBobmazon.Offer>)
    ```

- Removes all registered recipes:

    ```groovy:no-line-numbers
    mods.hbm.bobmazon.removeAll()
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.bobmazon.removeAll()
```

::::::::::

## Getting the value of recipes

- Iterates through every entry in the registry, with the ability to call remove on any element to remove it:

    ```groovy:no-line-numbers
    mods.hbm.bobmazon.streamRecipes()
    ```
