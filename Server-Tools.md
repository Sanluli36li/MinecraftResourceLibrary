# 服务器工具

这是一个由Sanluli36li整理的服务器工具列表。

## Velocity插件

[Velocity](https://velocitypowered.com/)是一个高效的Minecraft代理服务器  
相比于[BungeeCord](https://www.spigotmc.org/go/bungeecord)，Velocity更安全、高效。  
这里整理了一些Velocity插件
插件 | 作者 | 介绍 | 链接
-- | -- | -- | --
**玩家管理**
VPlayerManager | Sanluli36li | 身份组和封禁管理 (做了一半，等我做完再发)
[**Floodgate**](https://github.com/GeyserMC/Floodgate/) | *GeyserMC* | 基岩版和Java版账号链接<br>**需要Geyser** | [Jenkins](https://ci.opencollab.dev/job/GeyserMC/job/Floodgate/job/master/)
**协议转换**
[**ViaVersion**](https://github.com/ViaVersion/ViaVersion) | _MylesC<br>KennyTV | 服务器跨版本支持(支持新版本) | [Spigot](https://www.spigotmc.org/resources/viaversion.19254/)/[Jenkins](https://ci.viaversion.com/)
[**ViaBackwards**](https://github.com/ViaVersion/ViaBackwards) | Matsv<br>KennyTV | 服务器跨版本支持(支持1.9+旧版本) | [Spigot](https://www.spigotmc.org/resources/viabackwards.27448/)/[Jenkins](https://ci.viaversion.com/view/ViaBackwards/)
[**ViaRewind**](https://github.com/ViaVersion/ViaRewind) | Gerrygames | 服务器跨版本支持(支持1.7+旧版本) | [Spigot](https://www.spigotmc.org/resources/viarewind.52109/)/[Jenkins](https://ci.viaversion.com/view/ViaRewind/)
[**Geyser**](https://github.com/GeyserMC/Geyser) | *GeyserMC* | 基岩版支持 | [官网](https://geysermc.org/)/[Jenkins](https://ci.opencollab.dev//job/GeyserMC/job/Geyser/job/master/)
**其他**
[**CarpetBridge**](https://github.com/Sanluli36li/CarpetBridge) | Sanluli36li | 使地毯通信频道能通过Velocity | 
VAdvancedPing | Sanluli36li | 自定义Ping信息 (做了一半，等我做完再发)
VChatBridge | Sanluli36li | 跨服聊天、进服信息 (做了一半，等我做完再发)

### 玩家信息转发
**如果开启Velocity玩家信息转发，需要在服务器开启相关功能** [**Velocity官方文档**](https://velocitypowered.com/wiki/users/forwarding/)  
如果你是原版服务端，需要使用[**VanillaCord**](https://github.com/ME1312/VanillaCord) (支持`legacy`和`modern`转发)  
如果你是Fabric服务端，需要安装[**FabricProxy-Lite**](https://github.com/OKTW-Network/FabricProxy-Lite) Mod (支持`modern`转发)  
其他服务端看[Velocity官方文档](https://velocitypowered.com/wiki/users/forwarding/) 

## MCDReforged插件

[MCDReforged](https://github.com/Fallen-Breath/MCDReforged)是一个基于Python的Minecraft服务端控制工具  
相比于[官方插件库](https://github.com/MCDReforged/PluginCatalogue)里面五花八门的插件，我更倾向于只使用对游戏外内容进行操作的插件  
~~从里面挑出了DGBCraft用的~~，其他的用[Scarpet](Scripts-and-Datapacks.md#Scarpet)做。
插件 | 作者 | 介绍
-- | -- | --
**服务器管理**
[**CrashRestart**](https://github.com/MCDReforged/CrashRestart) | Fallen_Breath | 一个检测崩服后自动重启服务器的插件，可调整最大崩溃容忍度
[**SimpleOP**](https://github.com/MCDReforged/SimpleOP) | Fallen_Breath | 使用 `!!op` 来获得 op，`!!restart` 来重启服务器。适用于创造服
[**StartStopHelper**](https://github.com/MCDReforged/StartStopHelper) | Fallen_Breath | 帮助管理员启动 / 停止 / 重启服务器，自定义执行前延迟
**数据备份**
[**AutoZipBackup**](https://github.com/DGBCraft/AutoZipBackup) | Sanluli36li | 基于PermanentBackup的每日自动备份与新玩家登录备份<br>**需要PermanentBackup**
[**PermanentBackup**](https://github.com/MCDReforged/PermanentBackup) | Fallen_Breath | 创建永久的用 zip 压缩的备份
[**QuickBackupM**](https://github.com/TISUnion/QuickBackupM) | Fallen_Breath | 多槽位备份/回档插件
[**RegionFileUpdater**](https://github.com/TISUnion/RegionFileUpdater) | Fallen_Breath | 用于镜像服的 region 文件更新
**API**
[**MinecraftDataAPI**](https://github.com/MCDReforged/MinecraftDataAPI) | Fallen_Breath | 一个用获得玩家信息等数据的的 API