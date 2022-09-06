# Companion for map mods
Unofficial BungeeCord and Spigot (Paper) companion plugin for
[Xaero's Minimap](https://www.curseforge.com/minecraft/mc-mods/xaeros-minimap)
(and their [World Map](https://www.curseforge.com/minecraft/mc-mods/xaeros-world-map)),
[JourneyMap](https://www.curseforge.com/minecraft/mc-mods/journeymap) and
VoxelMap.

This plugin fixes Multi-world detection in multiplayer by simulating mod presence on
the server side.

This plugin was inspired by @kosma's [worldnamepacket](https://github.com/kosma/worldnamepacket),
which supported Velocity, Fabric and Spigot at the time of writing.

## Support table
| Mod                                                                                | Version                     | Status      |
|------------------------------------------------------------------------------------|-----------------------------|-------------|
| [Xaero's Minimap](https://www.curseforge.com/minecraft/mc-mods/xaeros-minimap)     | v22.13.2 (1.19.2)           | ✅ Supported |
| [Xaero's World Map](https://www.curseforge.com/minecraft/mc-mods/xaeros-world-map) | v22.13.2 (1.19.2)           | ✅ Supported |
| [JourneyMap](https://www.curseforge.com/minecraft/mc-mods/journeymap)              | 5.9.0beta2 (1.18.2, 1.19.2) | ✅ Supported |
| VoxelMap (Refresh-MC)                                                              | 1.11.10 (1.19.2)            | ✅ Supported |

## Installation
1. Download the latest release from [Releases](https://github.com/turikhay/MapModCompanion/releases) page
2. Put each of them into the corresponding plugins folder
3. That's it. No configuration required. You can restart your servers now.

⚠️ **NOTE** Spigot plugin can be used without BungeeCord counterpart, but it's highly recommended to install
plugins on both sides. On the contrary, BungeeCord plugin is useless if you don't install Spigot plugin on
downstream servers.

## Alternatives
- [worldnamepacket](https://github.com/kosma/worldnamepacket) (Velocity, Fabric, Spigot)
- [JourneyMap Server](https://www.curseforge.com/minecraft/mc-mods/journeymap-server) (Spigot)
- [Minimap server](https://github.com/Ewpratten/MinimapServer) (Spigot)