package com.bettem.platform.system.service;

import com.bettem.platform.system.fegin.SysAccountNumberFegin;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 14:29 <br>
 * @Author: 颜金星
 */
@Service("sysAccountNumberService")
public class SysAccountNumberService {
    @Autowired
    private SysAccountNumberFegin sysAccountNumberFegin;
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照id查询账号信息
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public SysAccountNumberModel getInfoById(String id){
        return sysAccountNumberFegin.getModelById(id);
    }
}
