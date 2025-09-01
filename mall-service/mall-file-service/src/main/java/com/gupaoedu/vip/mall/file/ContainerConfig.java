package com.gupaoedu.vip.mall.file;


import lombok.Data;
import org.javaswift.joss.client.factory.AccountConfig;
import org.javaswift.joss.client.factory.AccountFactory;
import org.javaswift.joss.client.factory.AuthenticationMethod;
import org.javaswift.joss.model.Account;
import org.javaswift.joss.model.Container;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "ceph")
public class ContainerConfig {

    private String username;
    private String password;
    private String authUrl;
    private String defaultContainerName;

    /**
     * 创建并配置Ceph存储账户
     *
     * @return 配置好的Account对象，用于访问Ceph存储服务
     */
    @Bean
    public Account account() {
        // 创建账户配置对象
        AccountConfig config = new AccountConfig();

        // 设置账户认证信息
        config.setUsername(username);      // 设置用户名
        config.setPassword(password);      // 设置密码
        config.setAuthUrl(authUrl);        // 设置认证URL
        config.setAuthenticationMethod(AuthenticationMethod.BASIC); // 设置认证方式为基本认证

        // 使用配置创建并返回账户实例
        return new AccountFactory(config).createAccount();
    }

    /**
     * 创建容器对象
     *
     * @return Container对象，用于文件存储操作
     */
    @Bean
    public Container container(){
        // 通过账户获取指定名称的容器
        Container container = account().getContainer(defaultContainerName);

        // 检查容器是否存在，如果不存在则创建
        if (!container.exists()){
            return container.create();  // 创建并返回新容器
        }

        return container;  // 返回已存在的容器
    }
}
