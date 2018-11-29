package com.bettem.platform.system.provider;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bettem.platform.common.base.model.PageModel;
import com.bettem.platform.common.base.model.QueryModel;
import com.bettem.platform.common.base.provider.BaseProviderImpl;
import com.bettem.platform.common.utils.Constant;
import com.bettem.platform.datasources.DataSourceNames;
import com.bettem.platform.datasources.annotation.DataSource;
import com.bettem.platform.system.fegin.SysAccountNumberFegin;
import com.bettem.platform.system.mapper.SysAccountNumberMapper;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照条件分页查询
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.READ)
    public PageModel<SysAccountNumberModel> getPageList(@RequestBody Map<String, Object> params){
        Page<SysAccountNumberModel> page = this.selectPage(
                new QueryModel<SysAccountNumberModel>(params).getPage(),
                new EntityWrapper<SysAccountNumberModel>().eq("delete_state",Constant.DELETE_STATE_NO).orderBy("create_date desc ")
        );
        return new PageModel<SysAccountNumberModel>(page);
    }
}
