# Fabric模组库

这是一个由Sanluli36li整理的生电向辅助类的Mod  
以下所有的Mod全部使用Fabric-Loader加载, 其中部分Mod有Forge版本  
**懒人请移步[这里](https://www.mcbbs.net/thread-1211050-1-1.html)**
  
要下载的话，首选Curseforge，因为可以给原作者带来收入  
**CF**=[Curseforge](https://www.curseforge.com/minecraft) **MR**=[Modrinth](https://modrinth.com/)

### 运行环境解释  
- `通用` 指在客户端与服务器上分别生效
- `客户端` 指仅需要在客户端上安装的Mod  
- `服务端` 指仅需要在服务端上安装的Mod, 在客户端上安装时应用于单机游戏
- `同时安装` 指单机游戏可用，但在服务器需要服务端也安装Mod
- `专用服务器` 指仅能在服务端上安装的Mod

### 标记
- ⭐ 已更新至1.17，且稳定运行
- ❓ 已更新至1.17，但稳定性未知
- ❗ 不建议使用

## Mod列表
Mod | 作者 | 介绍 | 链接 | 环境 | 版本(Fabric)
-- | -- | -- | -- | -- | --
**Carpet 系列**
[**Carpet Mod**](https://github.com/gnembon/fabric-carpet/) | gnembon | 地毯 | [CF](https://www.curseforge.com/minecraft/mc-mods/carpet) | 服务端 | 1.14.2-1.17⭐
[**Carpet Extra**](https://github.com/gnembon/carpet-extra/) | gnembon | 地毯扩展<br>**需要Carpet Mod** | [CF](https://www.curseforge.com/minecraft/mc-mods/carpet-extra) | 服务端 | 1.14.4-1.17⭐
[**Carpet TIS Addition**](https://github.com/TISUnion/Carpet-TIS-Addition) | Fallen_Breath | TIS服的地毯扩展<br>**需要Carpet Mod** | [CF](https://www.curseforge.com/minecraft/mc-mods/carpet-tis-addition) | 服务端 | 1.14.4-1.17⭐
[**Carpet DGBCraft**](https://github.com/DGBCraft/Carpet-DGBCraft) | Sanluli36li | DGBCraft特供地毯扩展 (咕咕咕🕊)<br>**需要Carpet Mod** | - | 服务端 | 1.16-1.17⭐
**工具类**
[**AntiGhost**](https://github.com/gbl/AntiGhost) | Giselbaer | 按G键清除幽灵方块<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/antighost)/[MR](https://modrinth.com/mod/antighost) | 客户端 | 1.14.4-1.17⭐
[**Client Commands**](https://github.com/Earthcomputer/clientcommands) | Earthcomputer | 客户端实用命令集<br>**需要[FabricAPI](#fabric-api)** | - | 客户端 | 1.14-1.17⭐
**G4meSpeed** | G4me4u | 活塞动画优化与TPS调整 | [Youtube](https://www.youtube.com/watch?v=lRvNknl0QPM) | 同时安装 | 1.15.2-1.17⭐
[**Litematica**](https://github.com/maruohon/litematica) | masa | 原理图投影<br>**需要[MaLiLib](#malilib)** | [CF](https://www.curseforge.com/minecraft/mc-mods/litematica) | 客户端 | 1.14-1.17⭐
[**MultiConnect**](https://github.com/Earthcomputer/multiconnect) | Earthcomputer | 跨版本连接服务器 | [CF](https://www.curseforge.com/minecraft/mc-mods/multiconnect) | 客户端 | 1.14.4-1.17⭐
[**Replay Mod**](https://github.com/ReplayMod/ReplayMod) | CrushedPixel<br>johni0702 | 录像、回放、剪辑 | [官网](https://www.replaymod.com/) | 客户端 | 1.14.2-1.16.5
[**Tweakeroo**](https://github.com/maruohon/tweakeroo) | masa | 万能工具箱<br>**需要[MaLiLib](#malilib)** | [CF](https://www.curseforge.com/minecraft/mc-mods/tweakeroo) | 客户端 | 1.14-1.17⭐
[**WorldEdit**](https://github.com/EngineHub/WorldEdit) | *EngineHub* | 创世神插件<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/worldedit) | 服务端 | 1.14.4-**1.17(测试)** ❓
**信息显示类**
[**Mod Menu**](https://github.com/TerraformersMC/ModMenu) | Prospector | Mod管理菜单 | [CF](https://www.curseforge.com/minecraft/mc-mods/modmenu)/[MR](https://modrinth.com/mod/modmenu) | 客户端 | 1.14-1.17⭐
**Inventory HUD+** | DmitryLovin | 耐久/物品栏/药水显示HUD<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/inventory-hud-forge) | 客户端 | 1.14.4-1.17⭐
[**MiniHUD**](https://github.com/maruohon/minihud) | masa | 文字信息显示HUD与渲染信息显示<br>**需要[MaLiLib](#malilib)** | [CF](https://www.curseforge.com/minecraft/mc-mods/minihud) | 客户端 | 1.14-1.17⭐
[**Pistorder**](https://github.com/Fallen-Breath/pistorder) | Fallen_Breath | 活塞推动信息显示 | [CF](https://www.curseforge.com/minecraft/mc-mods/pistorder) | 客户端 | 1.14.4-1.17⭐
**VoxelMap** | MamiyaOtaru | 小地图和世界地图 | [CF](https://www.curseforge.com/minecraft/mc-mods/voxelmap) | 客户端 | 1.14-1.17⭐
[**WorldEditCUI**](https://github.com/mikroskeem/WorldEditCUI) | zmlaoeu<br>mikroskeem | WorldEdit操作可视化<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/worldeditcui-fabric) | 客户端 | 1.14.4-1.16.5
**便捷操作类**
[**ClickThrough**](https://github.com/gbl/ClickThrough) | Giselbaer | 右键穿透牌子和物品展示框<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/clickthrough)/[MR](https://modrinth.com/mod/clickthrough) | 客户端 | 1.15.2-1.17⭐
[**Easier Village Trading**](https://github.com/gbl/EasierVillagerTrading) | Giselbaer | 单击交易选项即进行交易, 按shift单击全部交易<br>**需要[FabricAPI](#fabric-api)**<br>[解决ItemSroller同时安装时该Mod无效果](#安装了item-scroller时easiervillagertrading无效) | [CF](https://www.curseforge.com/minecraft/mc-mods/easiervillagertrading)/[MR](https://modrinth.com/mod/easiervillagertrading) | 客户端 | 1.14.4-1.17⭐
[**IngameIME**](https://github.com/Windmill-City/IngameIME-Minecraft) | Windmill_City | 游戏内输入法<br>**需要[FabricAPI](#fabric-api) / [Fabric Kotlin](#fabric-kotlin) / [Cloth API](#cloth-api) /<br>[Cloth Config](#cloth-config)** | [CF](https://www.curseforge.com/minecraft/mc-mods/ingameime)/[Mcbbs](https://www.mcbbs.net/thread-1158421-1-1.html) | 客户端 | 1.14.4-1.17⭐
[**Item Scroller**](https://github.com/maruohon/itemscroller) | masa | 鼠标操作<br>**需要[MaLiLib](#malilib)** | [CF](https://www.curseforge.com/minecraft/mc-mods/item-scroller) | 客户端 | 1.14-1.17⭐
[**Mine Menu**](https://github.com/UltraBlackLinux/MineMenuFabric) | UltraBlackLinux | 快捷操作菜单<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/minemenufabric)/[MR](https://modrinth.com/mod/minemenufabric) | 客户端 | 1.16-1.17⭐
**优化类**
[**C2ME**](https://github.com/YatopiaMC/C2ME-fabric) | ishland | 多线程区块加载 ***仍在测试版本*** | - | 服务端 | 1.16.4-1.17❓
[**DimensionalThreading**](https://github.com/WearBlackAllDay/DimensionalThreading) | WearBlackAllDay | 每个维度分线程计算<br>*刷沙机失效* | - | 服务端 | 1.16.1-1.17⭐
[**Dynamic FPS**](https://github.com/juliand665/Dynamic-FPS) | juliand665 | 游戏处于后台时锁定帧率以降低性能消耗<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/dynamic-fps)/[MR](https://modrinth.com/mod/dynamic-fps) | 客户端 | 1.14-1.17⭐
[**FastChest**](https://github.com/FakeDomi/FastChest) | Domi | 箱子使用方块渲染降低卡顿, 但箱子没有动画<br>**需要[FabricAPI](#fabric-api)** | [CF](https://www.curseforge.com/minecraft/mc-mods/fastchest) | 客户端 | 1.15-1.17⭐
[**Hydrogen**](https://github.com/CaffeineMC/hydrogen-fabric) | JellySquid3 | 优化数据结构逻辑，降低内存消耗 | [MR](https://modrinth.com/mod/hydrogen) | 通用 | 1.16.2-1.17⭐
[**Krypton**](https://github.com/astei/krypton) | tuxed | 优化网络堆栈，降低网络交互的占用 | [CF](https://www.curseforge.com/minecraft/mc-mods/krypton)/[MR](https://modrinth.com/mod/krypton) | 通用 | 1.16.2-1.17⭐
[**LazyDFU**](https://github.com/astei/lazydfu) | tuxed | 数据修复器仅在需要时才会加载，加速游戏启动 | [CF](https://www.curseforge.com/minecraft/mc-mods/lazydfu)/[MR](https://modrinth.com/mod/lazydfu) | 通用 | 1.14-1.17⭐
[**Lithium**](https://github.com/CaffeineMC/lithium-fabric) | JellySquid3 | 通用游戏逻辑/服务端性能优化 | [CF](https://www.curseforge.com/minecraft/mc-mods/lithium)/[MR](https://modrinth.com/mod/lithium) | 服务端 | 1.15.2-1.17⭐
[OptiFabric](https://github.com/Chocohead/OptiFabric) | Modmuss50<br>Chocohead | [Optifine](https://www.optifine.net/home)加载器 **不兼容Lithium Sodium等<br>*[不使用Optifine的理由及替代方案](https://gist.github.com/modmuss50/deff1658c4550ca8b16cb5d40ceaa468#Sodium)***<br> | [CF](https://www.curseforge.com/minecraft/mc-mods/optifabric) | 客户端 | 1.14-1.17❗
[**Phosphor**](https://github.com/CaffeineMC/phosphor-fabric) | JellySquid3 | 光照性能优化 **不兼容Starlight** | [CF](https://www.curseforge.com/minecraft/mc-mods/phosphor)/[MR](https://modrinth.com/mod/phosphor) | 服务端 | 1.15.2-1.16.5⭐
[**Sodium**](https://github.com/CaffeineMC/sodium-fabric) | JellySquid3 | 现代化渲染引擎，客户端优化 | [CF](https://www.curseforge.com/minecraft/mc-mods/sodium)/[MR](https://modrinth.com/mod/sodium) | 客户端 | 1.16-**1.17(测试)** ❓
[**Sodium Extra**](https://github.com/FlashyReese/sodium-extra-fabric) | FlashyReese | Sodium扩展, 更多视频选项 **需要Sodium** | [CF](https://www.curseforge.com/minecraft/mc-mods/sodium-extra)/[MR](https://modrinth.com/mod/sodium-extra) | 客户端 | 1.16.2-1.16.5
[**Starlight**](https://github.com/Spottedleaf/Starlight) | Spottedleaf | 重写光照引擎<br>**不兼容Phosphor** ***仍在测试版本*** | - | 服务端 | 1.16-1.17❓
**其他**
[**Iris**](https://github.com/IrisShaders/Iris) | coderbot | 兼容Optifine光影的全新光影Mod | [CF](https://www.curseforge.com/minecraft/mc-mods/irisshaders)/[MR](https://modrinth.com/mod/iris) | 客户端 | 1.16.5-1.17⭐
[**Not Enough Craches**](https://github.com/natanfudge/not-enough-crashes) | Fudge<br>Runemoro | 崩溃时显示详细信息并且游戏不会直接退出 | [CF](https://www.curseforge.com/minecraft/mc-mods/not-enough-crashes) | 通用 | 1.14.4-1.17⭐
**服务器专用**
[**FabricProxy**](https://github.com/OKTW-Network/FabricProxy) | james58899 | 在服务端上支持[BungeeCord](https://www.spigotmc.org/go/bungeecord)和[Velocity](https://velocitypowered.com/)转发<br>**需要[FabricAPI](#fabric-api)** ***不再维护*** | [CF](https://www.curseforge.com/minecraft/mc-mods/fabricproxy)/[MR](https://modrinth.com/mod/fabricproxy) | 专用服务器 | 1.14-1.17⭐
[**FabricProxy-Lite**](https://github.com/OKTW-Network/FabricProxy-Lite) | james58899 | 在服务端上支持[Velocity](https://velocitypowered.com/) `modern`转发 | [CF](https://www.curseforge.com/minecraft/mc-mods/fabricproxy-lite)/[MR](https://modrinth.com/mod/fabricproxy-lite) | 专用服务器 | 1.16.4-1.17⭐
[**Servux**](https://github.com/maruohon/servux) | masa | 使MiniHUD结构渲染能在服务器上正常使用 | [CF](https://www.curseforge.com/minecraft/mc-mods/servux) | 专用服务器 | 1.14.4-1.17⭐

## 支持库 (前置模组)
Mod | 作者 | 链接 | 环境 | 版本(Fabric)
-- | -- | -- | -- | --
[**Fabric API**](https://github.com/FabricMC/fabric/)<span id="fabric-api"></span> | *FabricMC* | [CF](https://www.curseforge.com/minecraft/mc-mods/fabric-api)/[MR](https://modrinth.com/mod/fabric-api) | 通用 | 1.14-1.17⭐
[**Fabric Language Kotlin**](https://github.com/FabricMC/fabric-language-kotlin)<span id="fabric-kotlin"></span> | Nikky | [CF](https://www.curseforge.com/minecraft/mc-mods/fabric-language-kotlin) | 通用 | 1.14-1.17⭐
[**Cloth API**](https://github.com/shedaniel/cloth-api)<span id="cloth-api"></span> | shedaniel | [CF](https://www.curseforge.com/minecraft/mc-mods/cloth-api) | 通用 | 1.14-1.17⭐
[**Cloth Config**](https://github.com/shedaniel/cloth-config)<span id="cloth-config"></span> | shedaniel | [CF](https://www.curseforge.com/minecraft/mc-mods/cloth-config) | 通用 | 1.14-1.17⭐
[**MaLiLib**](https://github.com/maruohon/malilib)<span id="malilib"></span> | masa | [CF](https://www.curseforge.com/minecraft/mc-mods/malilib) | 客户端 | 1.14-1.17⭐
  
# 常见冲突解决方案

## 安装了Item Scroller时EasierVillagerTrading无效
关闭ItemScroller的`enableVillagerTradeFeatures`功能即可正常使用EasierVillagerTrading
