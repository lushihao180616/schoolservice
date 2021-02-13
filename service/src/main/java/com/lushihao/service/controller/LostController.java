package com.lushihao.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.lushihao.service.bean.Lost;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.LostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("lost")
@CrossOrigin
public class LostController {

    @Resource
    private LostService lostService;

    /**
     * 创建一条寻物启事
     *
     * @param lost
     * @return
     */
    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(@RequestBody Lost lost) {
        int id = lostService.insertOne(lost);
        if (id > 0) {
            return Result.success(id, "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 删除一条寻物启事
     *
     * @param lost
     * @return
     */
    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(@RequestBody Lost lost) {
        if (lostService.deleteOne(lost) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 分页查询寻物启事
     *
     * @return
     */
    @RequestMapping("selectLimit")
    @ResponseBody
    public Result selectLimit(@RequestBody String data) {
        JSONObject dataJson = JSONObject.parseObject(data);
        return Result.success(lostService.selectLimit(dataJson.getString("stuNum"), dataJson.getInteger("id")), "成功");
    }

    /**
     * 分页查询寻物启事
     *
     * @return
     */
    @RequestMapping("selectMyLimit")
    @ResponseBody
    public Result selectMyLimit(@RequestBody String data) {
        JSONObject dataJson = JSONObject.parseObject(data);
        return Result.success(lostService.selectMyLimit(dataJson.getString("stuNum"), dataJson.getInteger("id")), "成功");
    }

}
