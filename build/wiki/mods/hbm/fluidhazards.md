---
title: "groovyscript.wiki.hbm.fluidhazards.title"
titleTemplate: "Hbm's Nuclear Tech - Community Edition | CleanroomMC"
description: "groovyscript.wiki.hbm.fluidhazards.description."
source_code_link: "https://github.com/MisterNorwood/Hbm-s-Nuclear-Tech-CE/blob/2.0.0.0/src/main/java/com/hbm/integration/groovy/script/FluidHazards.java"
---

# groovyscript.wiki.hbm.fluidhazards.title (Hbm's Nuclear Tech - Community Edition)

## Description

groovyscript.wiki.hbm.fluidhazards.description.

## Editing Values

- Groovy DSL variant of set(). Replaces all existing hazards for the fluid:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.set(Object, Closure<?>)
    ```

- Replace all existing hazards for a fluid with the builder's entries. Backs up previous entries for hot reload:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.set(Object, FluidHazards.FluidHazardBuilder)
    ```

- Toggle whether fluid hazards apply to NTM containers (filled items). Default true. Returns the new value:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.setApplyToNTMContainer(boolean)
    ```

## Adding Recipes

- Groovy DSL variant of add(). The closure receives a FluidHazardBuilder as delegate. Existing entries remain:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.add(Object, Closure<?>)
    ```

- Append a single HazardEntry to a fluid. fluidId may be String ('modid:fluid' or 'fluid'), ResourceLocation, or Fluid. Does not remove existing entries:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.add(Object, HazardEntry)
    ```

- Append all entries produced by the builder to a fluid. fluidId may be String/ResourceLocation/Fluid. Existing entries remain:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.add(Object, FluidHazards.FluidHazardBuilder)
    ```

## Removing Recipes

- Clear all hazard entries for a single fluid. Previous entries are backed up for reload; no-op if none present:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.clear(Object)
    ```

- Remove a specific HazardEntry instance from a fluid. Returns true if removed. Note: removal is identity-based on the entry object:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.remove(Object, HazardEntry)
    ```

- Clear all fluids' hazard entries. Backs up everything for hot reload before clearing:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.clearAll()
    ```

:::::::::: details Example {open id="example"}
```groovy:no-line-numbers
mods.hbm.fluidhazards.clearAll()
```

::::::::::

## Getting the value of recipes

- List all HazardEntry rows currently registered for a fluid as an immutable copy. Returns empty list if none:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.list(Object)
    ```

- Create a new FluidHazardBuilder. Use to compose one or more HazardEntry rows for a fluid:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.builder()
    ```

- Access built-in hazard types and factories (e.g., radiation(), unstable(timer), dangerousDrop(...)):

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.getTypes()
    ```

- Access helper hazard modifiers (fuel/RTG/RBMK/etc.) to attach to entries in the builder:

    ```groovy:no-line-numbers
    mods.hbm.fluidhazards.getModifiers()
    ```
