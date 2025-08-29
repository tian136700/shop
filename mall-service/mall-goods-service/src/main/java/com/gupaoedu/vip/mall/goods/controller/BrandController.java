package com.gupaoedu.vip.mall.goods.controller;

import com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.vip.mall.goods.entity.Brand;
import com.gupaoedu.vip.mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.util.List;

/**
 * @Description: 咕泡云商城 - 品牌控制器
 * @Author: gupaoedu
 * @Date: 2024
 * @Version: 1.0
 * 
 * 关于 @RestController 注解的说明：
 * - @RestController 是 @Controller 和 @ResponseBody 的组合注解
 * - 表示这个类是一个REST风格的控制器
 * - 所有方法的返回值都会自动转换为JSON格式返回给客户端
 * - 不需要在每个方法上单独添加 @ResponseBody 注解
 */
//接收前端请求
@RestController
@RequestMapping(value = "/brand")
public class BrandController {


    @Autowired
    private BrandService brandService;

    /**
     * 测试接口 - 检查服务是否正常运行
     * @return 成功响应
     */
    @GetMapping(value = "/test")
    public RespResult<String> test() {
        return RespResult.ok("品牌服务运行正常！");
    }
    
    /**
     * 简单测试接口 - 不需要请求体
     * @return 成功响应
     */
    @PostMapping(value = "/simple-test")
    public RespResult<String> simpleTest() {
        return RespResult.ok("简单POST测试成功！");
    }

    /**
     * 条件查询品牌列表
     * @param brand 查询条件（包含name、initial等字段）
     * @return 品牌列表
     */
    @PostMapping(value = "/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand) {
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }
}
