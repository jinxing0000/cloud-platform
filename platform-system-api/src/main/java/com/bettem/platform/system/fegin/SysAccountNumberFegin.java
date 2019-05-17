package com.bettem.platform.system.fegin;

import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.config.FeignConfig;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 11:44 <br>
 * @Author: 颜金星
 */
@FeignClient(name = "SYSTEM-SERVER",configuration = FeignConfig.class)
public interface SysAccountNumberFegin extends BaseFegin<SysAccountNumberModel> {

}
