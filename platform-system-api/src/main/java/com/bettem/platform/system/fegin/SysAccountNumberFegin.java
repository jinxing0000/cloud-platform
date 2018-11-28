package com.bettem.platform.system.fegin;

import com.bettem.platform.common.config.FeignConfig;
import com.bettem.platform.system.fegin.fallback.SysAccountNumberFallback;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 11:44 <br>
 * @Author: 颜金星
 */
@FeignClient(name = "system-server",configuration = FeignConfig.class)
public interface SysAccountNumberFegin {
    /**
     * @Param [id]
     * @Return: 
     * @Decription: 按照id查询账号信息
     * @CreateDate: Created in 2018/11/28 15:39
     * @Author: 颜金星
     */
    
    @RequestMapping(method = RequestMethod.GET, value = "/getModelById")
    SysAccountNumberModel getModelById(@RequestParam("id") String id);
}
