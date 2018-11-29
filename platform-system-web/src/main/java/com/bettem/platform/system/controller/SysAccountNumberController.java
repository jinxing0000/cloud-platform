package com.bettem.platform.system.controller;

import com.bettem.platform.common.base.controller.BaseController;
import com.bettem.platform.common.base.model.PageModel;
import com.bettem.platform.system.model.SysAccountNumberModel;
import com.bettem.platform.system.service.SysAccountNumberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 14:22 <br>
 * @Author: 颜金星
 */
@RestController
@RequestMapping(value = "/sysAccountNumber")
public class SysAccountNumberController extends BaseController {

    @Autowired
    private SysAccountNumberService sysAccountNumberService;

    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照id查询账号信息
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(value = "/getInfoById" ,method = RequestMethod.GET)
    public SysAccountNumberModel getInfoById(@Param("id") String id){
        return sysAccountNumberService.getInfoById(id);
    }
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照条件分页查询账号信息
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(value = "/getPageList" ,method = RequestMethod.GET)
    public PageModel getPageList(@RequestParam Map<String, Object> params){
        PageModel pageModel=sysAccountNumberService.getPageList(params);
        return pageModel;
    }
}
