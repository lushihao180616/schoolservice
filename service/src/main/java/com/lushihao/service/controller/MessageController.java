package com.lushihao.service.controller;

import com.lushihao.service.common.Message;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("message")
@CrossOrigin
public class MessageController {

    @Resource
    private MessageService messageService;

    /**
     * 分页查询消息
     *
     * @return
     */
    @RequestMapping("selectMyLimit")
    @ResponseBody
    public Result selectMyLimit(@RequestBody Message message) {
        return Result.success(messageService.selectMyLimit(message), "成功");
    }

}
