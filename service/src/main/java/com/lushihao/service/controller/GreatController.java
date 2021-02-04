package com.lushihao.service.controller;

import com.lushihao.service.common.Great;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.GreatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("great")
@CrossOrigin
public class GreatController {

    @Resource
    private GreatService greatService;

    /**
     * 添加点赞
     *
     * @param greatList
     * @return
     */
    @RequestMapping("insertAll")
    @ResponseBody
    public Result insertAll(@RequestBody List<Great> greatList) {
        if (greatService.insertAll(greatList) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 查我点赞的
     *
     * @param great
     * @return
     */
    @RequestMapping("selectMyLimit")
    @ResponseBody
    public Result selectMyLimit(@RequestBody Great great) {
        return Result.success(greatService.selectMyLimit(great), "成功");
    }
}
