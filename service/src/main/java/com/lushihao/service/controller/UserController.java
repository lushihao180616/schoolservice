package com.lushihao.service.controller;

import com.lushihao.service.bean.Result;
import com.lushihao.service.bean.User;
import com.lushihao.service.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("checkLogin")
    @ResponseBody
    public Result checkLogin(@RequestBody User user) {
        User selectUser = userService.checkLogin(user);
        if (selectUser != null) {
            return Result.success(selectUser, "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("reg")
    @ResponseBody
    public Result reg(@RequestBody User user) {
        if (userService.reg(user) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("mod")
    @ResponseBody
    public Result mod(@RequestBody User user) {
        User selectUser = userService.mod(user);
        if (selectUser != null) {
            return Result.success(selectUser, "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("modifyInfo")
    @ResponseBody
    public Result modifyInfo(@RequestBody User user) {
        User selectUser = userService.modifyInfo(user);
        if (selectUser != null) {
            return Result.success(selectUser, "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public Result selectAll() {
        return Result.success(userService.selectAll(), "成功");
    }

    @RequestMapping("selectManageUser")
    @ResponseBody
    public Result selectManageUser() {
        return userService.selectManageUser();
    }

    @RequestMapping("manageUser")
    @ResponseBody
    public Result manageUser(@RequestBody User user) {
        return userService.manageUser(user);
    }

    @RequestMapping("resetPwd")
    @ResponseBody
    public Result resetPwd(@RequestBody User user) {
        return userService.resetPwd(user);
    }

}
