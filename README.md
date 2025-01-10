# Villager Professions Plus

The goal of this mod is to add more professions to the game.

## Planned Additions

| Description           | Status   |
| --------------------- | -------- |
| Netherographer        | Complete |
| Netherography Table   | Complete |
| Netherographer Trades | Complete |

## Professions

### Netherographer

The Netherographer is a profession that specializes in the study of the Nether. They journey into the nether so will be interested in buying a lot of supplies. They are able to trade for items that are useful in the Nether and sell items that they find in the Nether.

## Trades

Anything listed as buy means that the villager will buy that item from the player. Anything listed as sell means that the villager will sell that item to the player.

| Profession     | Level      | Type | Item                     | Amount | Price      |
| -------------- | ---------- | ---- | ------------------------ | ------ | ---------- |
| Netherographer | Novice     | Buy  | Bread                    | 4      | 1 Emerald  |
| Netherographer | Novice     | Buy  | Carrot                   | 20     | 1 Emerald  |
| Netherographer | Novice     | Buy  | Stone Pickaxe            | 1      | 1 Emerald  |
| Netherographer | Novice     | Buy  | Iron Pickaxe             | 1      | 2 Emerald  |
| Netherographer | Novice     | Buy  | Stone Shovel             | 1      | 1 Emerald  |
| Netherographer | Novice     | Buy  | Iron Shovel              | 1      | 2 Emerald  |
| Netherographer | Novice     | Sell | Warped Fungus            | 4      | 1 Emerald  |
| Netherographer | Novice     | Sell | Crimson Fungus           | 4      | 1 Emerald  |
| Netherographer | Apprentice | Buy  | Ladder                   | 10     | 1 Emerald  |
| Netherographer | Apprentice | Buy  | Soul Lantern             | 4      | 5 Emerald  |
| Netherographer | Apprentice | Sell | Basalt                   | 1      | 1 Emerald  |
| Netherographer | Apprentice | Sell | Nether Wart              | 4      | 1 Emerald  |
| Netherographer | Apprentice | Sell | Twisted Vines            | 4      | 1 Emerald  |
| Netherographer | Apprentice | Sell | Weeping Vines            | 4      | 1 Emerald  |
| Netherographer | Journeyman | Buy  | Soul Campfire            | 4      | 6 Emerald  |
| Netherographer | Journeyman | Buy  | Diamond Pickaxe          | 1      | 10 Emerald |
| Netherographer | Journeyman | Buy  | Diamond Shovel           | 1      | 10 Emerald |
| Netherographer | Journeyman | Buy  | Warped Fungus On A Stick | 1      | 12 Emerald |
| Netherographer | Journeyman | Sell | Shroomlight              | 1      | 1 Emerald  |
| Netherographer | Journeyman | Sell | Glowstone                | 1      | 2 Emerald  |
| Netherographer | Expert     | Sell | Crying Obsidian          | 1      | 2 Emerald  |
| Netherographer | Expert     | Sell | Magma Block              | 1      | 2 Emerald  |
| Netherographer | Expert     | Sell | Soul Sand                | 1      | 2 Emerald  |
| Netherographer | Expert     | Sell | Soul Soil                | 1      | 2 Emerald  |
| Netherographer | Expert     | Sell | Raw Gold                 | 1      | 4 Emerald  |
| Netherographer | Master     | Sell | Respawn Anchor           | 1      | 32 Emerald |
| Netherographer | Master     | Sell | Gilded Blackstone        | 1      | 16 Emerald |

## Updating the mod

When an update is made to the mod, the following needs to be done to bump the version:

- Update any version numbers that need to be updated
  - in `gradle.properties`
    - `mod_version`
  - in `.github/workflows/build.yml`
    - `env.VERSION`
    - `env.RELEASE_NAME`
