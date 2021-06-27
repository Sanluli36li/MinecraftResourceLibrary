
__config() -> {'stay_loaded' -> true};

global_glowing_ticks = 10;

__command() ->
(
    p = player();
    position = pos(p);
    run('tellraw @a [{"text":"'+ p~'name' +'", "color":"yellow"},{"text": " @ ", "color":"white"},{"text":"' + p~'dimension' + '", "color": "gold"},{"text":" x:' + floor(position:0) + ', y:' + floor(position:1)+ ', z:' + floor(position:2) + '", "color":"aqua"}]');
    if (global_glowing_ticks > 0,
        modify(p, 'effect', 'glowing', global_glowing_ticks * 20);
    );
    null
);

__on_player_dies(p) ->
(
    position = pos(p);
    run('tellraw @a [{"text":"'+ p~'name' +'", "color":"yellow"},{"text": " Died @ ", "color":"white"},{"text":"' + p~'dimension' + '", "color": "gold"},{"text":" x:' + floor(position:0) + ', y:' + floor(position:1)+ ', z:' + floor(position:2) + '", "color":"aqua"}]');
);