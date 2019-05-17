package com.bettem.platform.common.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/12/5 16:18 <br>
 * @Author: 颜金星
 */
@Configuration
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private static final String BEARER_TOKEN_TYPE = "Bearer";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String accessToken = "cbf8449f-c836-49f7-9621-58a87ba3adf0";
        logger.debug("RequestInterceptorConfig accessToken :" +accessToken);
        requestTemplate.header(AUTHORIZATION_HEADER,
                String.format("%s %s",
                        BEARER_TOKEN_TYPE,
                        accessToken));
        logger.debug(requestTemplate.headers().toString());
    }
}
