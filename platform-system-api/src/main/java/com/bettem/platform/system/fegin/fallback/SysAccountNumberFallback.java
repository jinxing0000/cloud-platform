package com.bettem.platform.system.fegin.fallback;

import com.bettem.platform.common.base.fegin.fallback.BaseHystrixFallback;
import com.bettem.platform.system.fegin.SysAccountNumberFegin;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.springframework.stereotype.Component;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 11:51 <br>
 * @Author: 颜金星
 */
@Component
public class SysAccountNumberFallback extends BaseHystrixFallback<SysAccountNumberModel> implements SysAccountNumberFegin {

    @Override
    public SysAccountNumberModel getById(String id) {
        return null;
    }
}
