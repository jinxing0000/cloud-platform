package com.bettem.platform.system.web.controller;

import com.bettem.platform.system.web.fegin.SchedualServiceHi;
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
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.home( name );
    }
}
