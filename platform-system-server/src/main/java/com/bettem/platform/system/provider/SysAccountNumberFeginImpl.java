package com.bettem.platform.system.provider;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bettem.platform.common.base.provider.BaseProviderImpl;
import com.bettem.platform.datasources.DataSourceNames;
import com.bettem.platform.datasources.annotation.DataSource;
import com.bettem.platform.system.fegin.SysAccountNumberFegin;
import com.bettem.platform.system.mapper.SysAccountNumberMapper;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 11:41 <br>
 * @Author: 颜金星
 */
@RestController
@RefreshScope
public class SysAccountNumberFeginImpl extends BaseProviderImpl<SysAccountNumberMapper, SysAccountNumberModel> implements SysAccountNumberFegin {

}
