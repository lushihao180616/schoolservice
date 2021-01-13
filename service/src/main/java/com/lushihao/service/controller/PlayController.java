package com.lushihao.service.controller;

import com.lushihao.service.bean.Play;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.PlayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("play")
@CrossOrigin
public class PlayController {

    @Resource
    private PlayService playService;

    /**
     * 创建一条约玩
     *
     * @param play
     * @return
     */
    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(Play play) {
        if (playService.insertOne(play) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 删除一条约玩
     *
     * @param play
     * @return
     */
    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(Play play) {
        if (playService.deleteOne(play) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 分页查询约玩
     *
     * @return
     */
    @RequestMapping("selectLimit")
    @ResponseBody
    public Result selectLimit() {
        return Result.success(playService.selectLimit(), "成功");
    }

}
