package com.lushihao.service.controller;

import com.lushihao.service.activity.ActivityBeautifulGreat;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.ActivityBeautifulGreatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("beautifulGreat")
@CrossOrigin
public class ActivityBeautifulGreatController {

    @Resource
    private ActivityBeautifulGreatService activityBeautifulGreatService;

    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(@RequestBody ActivityBeautifulGreat activityBeautifulGreat) {
        if (activityBeautifulGreatService.insertOne(activityBeautifulGreat) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(@RequestBody ActivityBeautifulGreat activityBeautifulGreat) {
        if (activityBeautifulGreatService.deleteOne(activityBeautifulGreat) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("selectMy")
    @ResponseBody
    public Result selectMy(@RequestBody ActivityBeautifulGreat activityBeautifulGreat) {
        return Result.success(activityBeautifulGreatService.selectMy(activityBeautifulGreat), "成功");
    }
}
