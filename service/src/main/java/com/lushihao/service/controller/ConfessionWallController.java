package com.lushihao.service.controller;


import com.lushihao.service.bean.Result;
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

    @RequestMapping("selectAll")
    @ResponseBody
    public Result selectAll() {
        return null;
    }

}
