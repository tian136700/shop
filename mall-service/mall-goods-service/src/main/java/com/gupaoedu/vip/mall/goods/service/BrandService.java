package com.gupaoedu.vip.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.vip.mall.goods.entity.Brand;


import java.util.List;

/**
 * @Description: 咕泡云商城 - 品牌服务接口
 * @Author: gupaoedu
 * @Date: 2024
 * @Version: 1.0
 * <p>
 * 关于泛型尖括号 <> 的说明：
 * IService<Brand> 中的尖括号是Java泛型，表示：
 * - Brand 是具体的类型参数
 * - 这个服务接口专门处理 Brand 类型的实体
 * - 框架会自动提供针对 Brand 类型的CRUD操作方法
 * - 避免了类型转换，提高了代码的类型安全性
 */
//定义增删差改-必须
//
public interface BrandService extends IService<Brand> {

    /**
     * 条件查询
     *
     * @param brand
     * @return
     */
    List<Brand> queryList(Brand brand);

    Page<Brand> queryPageList(Brand brand, Long page, Long size);
}
//开发流程1.先写接口2.impl文件去实现接口