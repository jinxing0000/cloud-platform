package com.bettem.platform.fegin;

import com.bettem.platform.common.config.FeignConfig;
import com.bettem.platform.fegin.fallback.SchedualServiceHiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/23 15:54 <br>
 * @Author: 颜金星
 */
@FeignClient(value = "system-server",fallback=SchedualServiceHiFallback.class,configuration=FeignConfig.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String home(@RequestParam(value = "name", defaultValue = "forezp") String name);
}
