package com.lushihao.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.lushihao.service.bean.Express;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.ExpressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("express")
@CrossOrigin
public class ExpressController {

    @Resource
    private ExpressService expressService;

    /**
     * 创建一条快递
     *
     * @param express
     * @return
     */
    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(@RequestBody Express express) {
        if (expressService.insertOne(express) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 删除一条快递
     *
     * @param express
     * @return
     */
    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(@RequestBody Express express) {
        if (expressService.deleteOne(express) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 分页查询快递
     *
     * @return
     */
    @RequestMapping("selectMyLimit")
    @ResponseBody
    public Result selectMyLimit(@RequestBody String data) {
        JSONObject dataJson = JSONObject.parseObject(data);
        return Result.success(expressService.selectMyLimit(dataJson.getString("stuNum"), dataJson.getInteger("id")), "成功");
    }

}
