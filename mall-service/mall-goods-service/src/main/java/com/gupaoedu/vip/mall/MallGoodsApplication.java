package com.gupaoedu.vip.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡云商城 - 商品服务启动类
 * 
 * @Description: 商品服务模块的主启动类，负责启动商品相关的微服务
 * @Author: gupaoedu
 * @Date: 2024
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.gupaoedu.vip.mall")
@MapperScan("com.gupaoedu.vip.mall.goods.mapper")
@RestController
public class MallGoodsApplication {

    /**
     * 应用程序主入口方法
     * 
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 启动Spring Boot应用程序
        System.out.println("测试 ：11111111111111111111");
        org.springframework.boot.SpringApplication.run(MallGoodsApplication.class, args);
    }

    /**
     * 测试接口 - 检查应用程序是否正常启动
     * @return 成功响应
     */
    @GetMapping("/")
    public String home() {
        return "咕泡云商城 - 商品服务启动成功！";
    }
    
    /**
     * 测试品牌接口是否可访问
     * @return 成功响应
     */
    @GetMapping("/test-brand")
    public String testBrand() {
        return "品牌接口测试成功！";
    }
}
