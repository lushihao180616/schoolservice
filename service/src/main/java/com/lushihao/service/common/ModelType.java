package com.lushihao.service.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 模块类型
 */
public class ModelType {
    /**
     * 告白墙
     */
    public static final String MODEL_CONFESSIONWALL = "00";
    /**
     * 跳蚤市场
     */
    public static final String MODEL_MARKET = "01";
    /**
     * 失物招领
     */
    public static final String MODEL_LOST = "02";
    /**
     * 游戏约玩
     */
    public static final String MODEL_PLAY = "03";
    /**
     * 快递服务
     */
    public static final String MODEL_EXPRESS = "04";

    public static Map<String, String> modelType = new HashMap();
    public static Map<String, String> modelTypeReverse = new HashMap();

    static {
        modelType.put(MODEL_CONFESSIONWALL, "告白墙");
        modelType.put(MODEL_MARKET, "跳蚤市场");
        modelType.put(MODEL_LOST, "失物招领");
        modelType.put(MODEL_PLAY, "游戏约玩");
        modelType.put(MODEL_EXPRESS, "快递服务");

        for (Object key : modelType.keySet()) {
            modelTypeReverse.put(modelType.get((String) key), (String) key);
        }
    }
}
