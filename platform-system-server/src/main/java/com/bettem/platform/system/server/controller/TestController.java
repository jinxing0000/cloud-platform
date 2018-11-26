package com.bettem.platform.system.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/23 15:36 <br>
 * @Author: 颜金星
 */
@RestController
public class TestController {

    private static Logger log = LoggerFactory.getLogger(TestController.class);
    @Value("${server.port}")
    String port;
    @Value("${url}")
    String url;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        log.debug("配置中心URL:"+url);
        return "hi " + name + " ,i am from port:" + port;
    }
}
