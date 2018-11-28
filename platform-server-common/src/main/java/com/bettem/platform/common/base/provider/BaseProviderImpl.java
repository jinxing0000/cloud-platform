package com.bettem.platform.common.base.provider;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.mapper.BaseDaoMapper;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.datasources.DataSourceNames;
import com.bettem.platform.datasources.annotation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 16:55 <br>
 * @Author: 颜金星
 */
public abstract class BaseProviderImpl<M extends BaseDaoMapper<T>, T extends BaseModel> implements BaseFegin<T> {
    @Autowired
    protected M baseMapper;

    @DataSource(name = DataSourceNames.READ)
    public T getModelById(@RequestParam("id") String id){
        return this.baseMapper.selectById(id);
    }
}
