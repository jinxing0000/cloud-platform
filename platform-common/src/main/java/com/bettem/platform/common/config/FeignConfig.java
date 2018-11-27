package com.bettem.platform.common.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/27 11:11 <br>
 * @Author: 颜金星
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }

    @Bean
    public Retryer feginRetryer(){
        Retryer retryer = new Retryer.Default(700, 10, 3);
        return retryer;
    }
    @Bean
    public Request.Options feginOption(){
        Request.Options option = new Request.Options(7000,7000);
        return option;
    }
}
