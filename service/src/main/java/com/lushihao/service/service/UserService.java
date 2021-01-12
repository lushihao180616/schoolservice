package com.lushihao.service.service;

import com.lushihao.service.bean.Result;
import com.lushihao.service.bean.User;
import com.lushihao.service.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 校验用户登录
     *
     * @param user
     * @return
     */
    public User checkLogin(User user) {
        User selectUser = userMapper.selectOne(user);
        if (selectUser.getPwd().equals(user.getPwd())) {
            return selectUser;
        } else {
            return null;
        }
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    public int reg(User user) {
        return userMapper.insertOne(user);
    }

    /**
     * 修改密码
     *
     * @param user
     * @return
     */
    public User mod(User user) {
        User selectUser = userMapper.selectOne(user);
        if (selectUser.getPwd().equals(user.getOldPwd())) {
            int count = userMapper.updatePwd(user);
            if (count > 0) {
                return userMapper.selectOne(user);
            } else {
                return null;
            }
        }
        return null;
    }

    /**
     * 修改信息
     *
     * @param user
     * @return
     */
    public User modifyInfo(User user) {
        int count = userMapper.updateOne(user);
        if (count > 0) {
            return userMapper.selectOne(user);
        } else {
            return null;
        }
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public Result selectManageUser() {
        return Result.success(userMapper.selectAllManage(), "成功");
    }

    public Result manageUser(User user) {
        int count = userMapper.manageUser(user);
        if (count > 0) {
            return Result.success(selectManageUser().getBean(), "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    public Result resetPwd(User user) {
        user.setPwd(user.getStuNum());
        int count = userMapper.updatePwd(user);
        if (count > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

}
