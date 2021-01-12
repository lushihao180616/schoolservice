package com.lushihao.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

    public static SimpleDateFormat formatter_yMd = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat formatter_yMdHms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 获取接下来一周的日期
     *
     * @return
     */
    public static List<String> getOneWeekDay() {
        String date = formatter_yMd.format(new Date());
        List<String> result = new ArrayList<>();
        result.add(date);
        for (int i = 0; i < 6; i++) {
            String temp = new String();
            temp = tomorrowDateStr(date);
            result.add(temp);
            date = temp;
        }
        return result;
    }

    /**
     * 获取明天
     *
     * @return
     */
    public static String tomorrowDateStr(String dateStr) {
        Date date = null;
        try {
            date = formatter_yMd.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        calendar.add(calendar.DATE, 1);

        //这个时间就是日期往后推一天的结果
        date = calendar.getTime();

        String tomorrowStr = formatter_yMd.format(date);
        return tomorrowStr;
    }

    /**
     * 获取昨天
     *
     * @return
     */
    public static String yesterdayDateStr(String dateStr) {
        Date date = null;
        try {
            date = formatter_yMd.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        calendar.add(calendar.DATE, -1);

        //这个时间就是日期往后推一天的结果
        date = calendar.getTime();

        String tomorrowStr = formatter_yMd.format(date);
        return tomorrowStr;
    }

    public static String nowyMd() {
        return formatter_yMd.format(new Date());
    }

    public static String nowyMdHms() {
        return formatter_yMdHms.format(new Date());
    }
}
