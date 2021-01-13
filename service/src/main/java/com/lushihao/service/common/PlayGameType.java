package com.lushihao.service.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 约玩游戏类型
 */
public class PlayGameType {

    public static Map gameType = new HashMap();
    public static Map gameTypeReverse = new HashMap();

    static {
        gameType.put("0", "王者荣耀");
        gameType.put("1", "和平精英");

        for (Object key : gameType.keySet()) {
            gameTypeReverse.put(gameType.get((String) key), (String) key);
        }
    }

}
