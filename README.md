# 咕泡云商城 (Gupaoedu VIP Mall)

一个基于 Spring Cloud 微服务架构的电商平台项目。

## 🚀 项目简介

咕泡云商城是一个现代化的电商系统，采用微服务架构设计，提供商品管理、用户服务、订单处理等完整的电商功能。

## 🏗️ 项目架构

```
gupaoedu-vip-mall/
├── mall-gateway/          # 网关服务
├── mall-service/          # 业务服务层
│   └── mall-goods-service/ # 商品服务
├── mall-web/              # Web前端
├── mall-util/             # 工具模块
│   ├── mall-common/       # 公共组件
│   │   └── src/main/resources/sql/ # 数据库脚本
│   └── mall-service-dependency/ # 服务依赖
└── mail-api/              # API接口模块
    └── mall-goods-api/    # 商品API
```

## 🛠️ 技术栈

- **后端框架**: Spring Boot 2.7.18
- **微服务**: Spring Cloud Alibaba 2021.0.1.0
- **数据库**: MySQL 8.0
- **ORM框架**: MyBatis-Plus 3.5.4.1
- **服务注册与发现**: Nacos
- **网关**: Spring Cloud Gateway
- **开发工具**: Lombok, DevTools

## 📋 环境要求

- JDK 8+
- Maven 3.6+
- MySQL 8.0+
- Nacos 2.x

## 🚀 快速开始

### 1. 克隆项目
```bash
git clone [项目地址]
cd gupaoedu-vip-mall
```

### 2. 启动Nacos
```bash
# 确保Nacos服务已启动
# 默认地址: localhost:8848
```

### 3. 配置数据库
- 创建数据库 `mall_goods`
- 执行SQL脚本初始化数据库结构：
  ```bash
  # 进入SQL脚本目录
  cd mall-util/mall-common/src/main/resources/sql/
  
  # 执行建表脚本
  mysql -u root -p < mall_tables.sql
  
  # 插入示例数据（可选）
  mysql -u root -p mall_goods < insert_brand_data.sql
  ```
- 修改 `mall-goods-service/src/main/resources/application.yml` 中的数据库连接信息

### 4. 启动服务
```bash
# 启动商品服务
cd mall-service/mall-goods-service
mvn spring-boot:run

# 启动网关服务
cd mall-gateway
mvn spring-boot:run
```

### 5. 访问服务
- 商品服务: http://localhost:8089
- 网关服务: http://localhost:8080

## 📁 主要功能

- **商品管理**: 品牌管理、商品分类、商品信息维护
- **用户服务**: 用户注册、登录、权限管理
- **订单系统**: 购物车、订单处理、支付集成
- **微服务架构**: 服务注册发现、配置管理、负载均衡

## 🗄️ 数据库设计

项目包含完整的数据库设计，位于 `mall-util/mall-common/src/main/resources/sql/` 目录：

- **mall_tables.sql**: 完整的数据库建表脚本，包含：
  - 商品数据库 (mall_goods)
  - 订单数据库 (mall_order) 
  - 秒杀数据库 (mall_seckill)
  - 用户数据库 (mall_user)
- **insert_brand_data.sql**: 品牌示例数据
- **add_timestamp_fields.sql**: 时间戳字段添加脚本
- **update_timestamp_fields.sql**: 时间戳字段更新脚本

## 🔧 开发说明

### 项目结构
- 采用分层架构设计
- 使用MyBatis-Plus进行数据访问
- 集成Nacos进行服务治理
- 支持热重载开发

### 代码规范
- 遵循阿里巴巴Java开发手册
- 使用Lombok简化代码
- 统一的异常处理和日志记录

## 📝 注意事项

- 确保Nacos服务正常运行
- 数据库连接配置正确
- 端口号不冲突
- 开发环境建议启用DevTools热重载
- **数据库初始化**: 首次运行前必须执行SQL脚本创建数据库和表结构
- **示例数据**: 可选择执行 `insert_brand_data.sql` 插入测试数据

## 🤝 贡献指南

欢迎提交Issue和Pull Request来改进项目。

## 📄 许可证

本项目采用 [许可证类型] 许可证。

---

**咕泡教育** - 让技术改变世界
