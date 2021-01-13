package com.lushihao.service.controller;


import com.lushihao.service.bean.ConfessionWall;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.ConfessionWallService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("confession")
@CrossOrigin
public class ConfessionWallController {

    @Resource
    private ConfessionWallService confessionWallService;

    /**
     * 创建一条表白墙
     *
     * @param confessionWall
     * @return
     */
    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(ConfessionWall confessionWall) {
        if (confessionWallService.insertOne(confessionWall) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 删除一条表白墙
     *
     * @param confessionWall
     * @return
     */
    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(ConfessionWall confessionWall) {
        if (confessionWallService.deleteOne(confessionWall) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 分页查询表白墙
     *
     * @return
     */
    @RequestMapping("selectLimit")
    @ResponseBody
    public Result selectLimit() {
        return Result.success(confessionWallService.selectLimit(), "成功");
    }

}
