package com.bettem.platform.system.service;

import com.bettem.platform.common.base.service.BaseService;
import com.bettem.platform.system.fegin.SysAccountNumberFegin;
import com.bettem.platform.system.model.SysAccountNumberModel;
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
public class SysAccountNumberService extends BaseService<SysAccountNumberFegin,SysAccountNumberModel> {
    @Autowired
    public void setFegin(SysAccountNumberFegin sysAccountNumberFegin) {
        this.fegin=sysAccountNumberFegin;
    }
}
