package com.lushihao.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.lushihao.service.bean.Play;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.PlayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Result insertOne(@RequestBody Play play) {
        int id = playService.insertOne(play);
        if (id > 0) {
            return Result.success(id, "成功");
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
    public Result deleteOne(@RequestBody Play play) {
        if (playService.deleteOne(play) > 0) {
            return Result.success(play.getId(), "成功");
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
    public Result selectLimit(@RequestBody String data) {
        JSONObject dataJson = JSONObject.parseObject(data);
        return Result.success(playService.selectLimit(dataJson.getString("stuNum"), dataJson.getInteger("id")), "成功");
    }

    /**
     * 分页查询约玩
     *
     * @return
     */
    @RequestMapping("selectMyLimit")
    @ResponseBody
    public Result selectMyLimit(@RequestBody String data) {
        JSONObject dataJson = JSONObject.parseObject(data);
        return Result.success(playService.selectMyLimit(dataJson.getString("stuNum"), dataJson.getInteger("id")), "成功");
    }

}
