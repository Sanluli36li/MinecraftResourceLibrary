
__config() -> {'stay_loaded' -> true};

__on_player_connects(player) ->
(
    // 当玩家加入游戏时，如果玩家名满足格式 bot.* 且非真实玩家，将其队伍设置为bot（显示绿名）
    if (player~'name'~'^bot\.' && player~'player_type' == 'fake',
        run('team join bot ' + player~'name');
    );
);
