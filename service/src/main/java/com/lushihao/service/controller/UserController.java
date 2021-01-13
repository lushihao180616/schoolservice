package com.lushihao.service.controller;

import com.lushihao.service.common.Result;
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

    /**
     * 校验用户登录
     *
     * @param user
     * @return
     */
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

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @RequestMapping("reg")
    @ResponseBody
    public Result reg(@RequestBody User user) {
        if (userService.reg(user) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 修改密码
     *
     * @param user
     * @return
     */
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

    /**
     * 修改信息
     *
     * @param user
     * @return
     */
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

    /**
     * 查所有用户
     *
     * @return
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public Result selectAll() {
        return Result.success(userService.selectAll(), "成功");
    }

    /**
     * 查找可修改权限的用户
     *
     * @return
     */
    @RequestMapping("selectManageUser")
    @ResponseBody
    public Result selectManageUser() {
        return userService.selectManageUser();
    }

    /**
     * 修改用户权限
     *
     * @param user
     * @return
     */
    @RequestMapping("manageUser")
    @ResponseBody
    public Result manageUser(@RequestBody User user) {
        return userService.manageUser(user);
    }

    /**
     * 管理员重置密码
     *
     * @param user
     * @return
     */
    @RequestMapping("resetPwd")
    @ResponseBody
    public Result resetPwd(@RequestBody User user) {
        return userService.resetPwd(user);
    }

}
