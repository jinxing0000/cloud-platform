package com.bettem.platform.config;

import com.bettem.platform.customImpl.MyRedisTokenStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/12/5 09:43 <br>
 * @Author: 颜金星
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    //客户端详情信息在这里进行初始化，你能够把客户端详情信息写死在这里或者是通过数据库来存储调取详情信息
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        String finalSecret = "{bcrypt}" + new BCryptPasswordEncoder().encode("bettem");
        // 配置两个客户端，一个用于password认证一个用于client认证
        clients.inMemory()
                //第三方用户的id（可理解为账号）
                .withClient("system-web-server")
                .resourceIds(Utils.RESOURCEIDS.SYSTEM_WEB_SERVER)
                //认证方式：
                /*
                authorization_code：传统的授权码模式
                implicit：隐式授权模式
                password：资源所有者（即用户）密码模式
                client_credentials：客户端凭据（客户端ID以及Key）模式
                refresh_token：获取access token时附带的用于刷新新的token模式
                */
                .authorizedGrantTypes("password", "refresh_token")
                 //scopes的值就是all（全部权限），read，write等权限
                .scopes("all")
                .authorities("bettem")
                //第三方应用和授权服务器之间的安全凭证(可理解为密码)
                .secret(finalSecret)
                .and().withClient("system-server")
                .resourceIds(Utils.RESOURCEIDS.SYSTEM_SERVER)
                .authorizedGrantTypes("client_credentials", "refresh_token")
                .scopes("all")
                .authorities("bettem")
                .secret(finalSecret);
    }
    //用来配置授权（authorization）以及令牌（token）的访问端点和令牌服务(token services)，还有token的存储方式(tokenStore)；
    public void configure(AuthorizationServerEndpointsConfigurer endpoints){
        endpoints.tokenServices(tokenServices())
                .authenticationManager(authenticationManager)
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
    }

    @Primary
    @Bean
    public AuthorizationServerTokenServices tokenServices() {
        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        //access_token有效期
        defaultTokenServices.setAccessTokenValiditySeconds(7200);
        //refresh_token有效期
        defaultTokenServices.setRefreshTokenValiditySeconds(-1);
        defaultTokenServices.setSupportRefreshToken(true);
        defaultTokenServices.setReuseRefreshToken(false);
        defaultTokenServices.setTokenStore(new MyRedisTokenStore(redisConnectionFactory));
        defaultTokenServices.setAuthenticationManager(authenticationManager);
        return defaultTokenServices;
    }

    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        // 允许表单认证
        security.allowFormAuthenticationForClients();
    }


}
