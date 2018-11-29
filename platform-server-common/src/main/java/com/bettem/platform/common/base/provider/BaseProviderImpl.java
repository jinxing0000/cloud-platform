package com.bettem.platform.common.base.provider;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.mapper.BaseDaoMapper;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;
import com.bettem.platform.common.base.model.QueryModel;
import com.bettem.platform.datasources.DataSourceNames;
import com.bettem.platform.datasources.annotation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 16:55 <br>
 * @Author: 颜金星
 */
public abstract class BaseProviderImpl<M extends BaseDaoMapper<T>, T extends BaseModel> extends ServiceImpl<M , T > implements BaseFegin<T> {
    @Autowired
    protected M baseMapper;
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照id查询实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.READ)
    public T getModelById(@RequestParam("id") String id){
        return this.selectById(id);
    }
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照条件分页查询
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.READ)
    public PageModel getPageList(@RequestBody Map<String, Object> params){
        Page<T> page = this.selectPage(
                new QueryModel<T>(params).getPage(),
                new EntityWrapper<T>()
        );
        return new PageModel(page);
    }
}
