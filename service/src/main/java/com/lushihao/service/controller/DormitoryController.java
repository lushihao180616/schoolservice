package com.lushihao.service.controller;

import com.lushihao.service.common.Result;
import com.lushihao.service.service.DormitoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("dormitory")
@CrossOrigin
public class DormitoryController {

    @Resource
    private DormitoryService dormitoryService;

    /**
     * 查询所有宿舍
     *
     * @return
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public Result selectAll() {
        return Result.success(dormitoryService.selectAll(), "成功");
    }

}
