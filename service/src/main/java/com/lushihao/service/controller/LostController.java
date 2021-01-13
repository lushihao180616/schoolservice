package com.lushihao.service.controller;

import com.lushihao.service.bean.Lost;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.LostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    public Result insertOne(Lost lost) {
        if (lostService.insertOne(lost) > 0) {
            return Result.success("成功", "成功");
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
    public Result deleteOne(Lost lost) {
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
    @RequestMapping("selectAll")
    @ResponseBody
    public Result selectAll() {
        return Result.success(lostService.selectAll(), "成功");
    }

}
