package com.lushihao.service.controller;

import com.lushihao.service.bean.Market;
import com.lushihao.service.common.Result;
import com.lushihao.service.service.MarketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("market")
@CrossOrigin
public class MarketController {

    @Resource
    private MarketService marketService;

    /**
     * 创建一条二手信息
     *
     * @param market
     * @return
     */
    @RequestMapping("insertOne")
    @ResponseBody
    public Result insertOne(Market market) {
        if (marketService.insertOne(market) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 删除一条二手信息
     *
     * @param market
     * @return
     */
    @RequestMapping("deleteOne")
    @ResponseBody
    public Result deleteOne(Market market) {
        if (marketService.deleteOne(market) > 0) {
            return Result.success("成功", "成功");
        } else {
            return Result.fail("失败", "失败");
        }
    }

    /**
     * 分页查询二手信息
     *
     * @return
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public Result selectAll() {
        return Result.success(marketService.selectAll(), "成功");
    }

}
