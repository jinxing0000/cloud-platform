package com.bettem.platform.common.base.provider;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.mapper.BaseDaoMapper;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;
import com.bettem.platform.common.base.model.QueryModel;
import com.bettem.platform.common.utils.Constant;
import com.bettem.platform.datasources.DataSourceNames;
import com.bettem.platform.datasources.annotation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
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
     * @Param [params]
     * @Return:
     * @Decription: 按照条件查询列表
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.READ)
    public List<T> getList(@RequestBody Map<String, Object> params){
        params.put("deleteState",Constant.DELETE_STATE_NO);
        return this.baseMapper.selectList(params);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 新增实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.WRITE)
    public void saveModel(@RequestBody T model){
        model.setDeleteState(Constant.DELETE_STATE_NO);
        model.setCreateDate(new Date());
        this.insert(model);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 修改实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.WRITE)
    public void editModel(@RequestBody T model){
        model.setModifyDate(new Date());
        this.updateById(model);
    }
    /**
     * @Param [id]
     * @Return:
     * @Decription: 按照id删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.WRITE)
    public void deleteModel(@RequestBody T model){
        model.setModifyDate(new Date());
        this.updateById(model);
    }
    /**
     * @Param [ids]
     * @Return:
     * @Decription: 批量删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.WRITE)
    public void deleteModelBatch(@RequestBody Map<String, Object> params){
        params.put("modifyDate",new Date());
        params.put("deleteState",Constant.DELETE_STATE_YES);
        this.baseMapper.deleteModelBatch(params);
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量新增实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.WRITE)
    public void saveModelBatch(@RequestBody List<T> models){
        for(T model:models){
            model.setCreateDate(new Date());
            model.setDeleteState(Constant.DELETE_STATE_NO);
        }
        this.insertBatch(models);
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量修改实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @DataSource(name = DataSourceNames.WRITE)
    public void editModelBatch(@RequestBody List<T> models){
        for(T model:models){
            model.setModifyDate(new Date());
        }
        this.updateBatchById(models);
    }
}
