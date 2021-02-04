package com.lushihao.service.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;

public class ImageUtil {

    /**
     * 获得高宽比
     * @param src
     * @return
     */
    public static double getHeightDivideWidth(String src) {
        try {
            InputStream is = new URL(src).openStream();
            BufferedImage sourceImg = ImageIO.read(is);
            return new BigDecimal(sourceImg.getHeight()).divide(new BigDecimal(sourceImg.getHeight())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        } catch (Exception e) {
            return 0;
        }
    }
}
