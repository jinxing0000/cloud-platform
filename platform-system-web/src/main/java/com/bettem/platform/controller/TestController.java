package com.bettem.platform.controller;

import com.bettem.platform.fegin.SchedualServiceHi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/23 15:18 <br>
 * @Author: 颜金星
 */
@RestController
@RequestMapping(value = "/system")
public class TestController {
    private static Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        log.debug("测试日志++++++++++++++++++++");
        return schedualServiceHi.home( name );
    }
}
