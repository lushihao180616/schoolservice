package com.lushihao.service.controller;

import com.lushihao.service.activity.ActivityBeautiful;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.ActivityBeautifulService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("beautiful")
@CrossOrigin
public class ActivityBeautifulController {

    @Resource
    private ActivityBeautifulService activityBeautifulService;

    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(@RequestBody ActivityBeautiful activityBeautiful) {
        if (activityBeautifulService.insertOne(activityBeautiful) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(@RequestBody ActivityBeautiful activityBeautiful) {
        if (activityBeautifulService.deleteOne(activityBeautiful) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("selectLimit")
    @ResponseBody
    public Result selectLimit() {
        return Result.success(activityBeautifulService.selectLimit(), "成功");
    }
}
