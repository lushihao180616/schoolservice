package com.lushihao.service.controller;

import com.lushihao.service.common.Comment;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("comment")
@CrossOrigin
public class CommentController {

    @Resource
    private CommentService commentService;

    /**
     * 添加评论
     *
     * @param comment
     * @return
     */
    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(@RequestBody Comment comment) {
        if (commentService.insertOne(comment) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 删除评论
     *
     * @param comment
     * @return
     */
    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(@RequestBody Comment comment) {
        if (commentService.deleteOne(comment) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 查我评论的
     *
     * @param comment
     * @return
     */
    @RequestMapping("selectMyLimit")
    @ResponseBody
    public Result selectMyLimit(@RequestBody Comment comment) {
        return Result.success(commentService.selectMyLimit(comment), "成功");
    }
}
