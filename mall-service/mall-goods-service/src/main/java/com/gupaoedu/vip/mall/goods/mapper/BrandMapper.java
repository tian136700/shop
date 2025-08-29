package com.gupaoedu.vip.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gupaoedu.vip.mall.goods.entity.Brand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 品牌Mapper接口
 * @Author: gupaoedu
 * @Date: 2024
 * @Version: 1.0
 * 
 * 关于泛型尖括号 <> 的说明：
 * BaseMapper<Brand> 中的尖括号是Java泛型，表示：
 * - Brand 是具体的实体类型
 * - 这个Mapper专门处理 Brand 实体的数据库操作
 * - 框架会自动生成针对 Brand 表的SQL语句
 * - 提供了类型安全的增删改查方法
 */
//与数据库交互dao层
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {

//    public Brand queryById(Integer id);

}
