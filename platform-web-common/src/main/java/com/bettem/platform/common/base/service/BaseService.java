package com.bettem.platform.common.base.service;

import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;
import com.bettem.platform.common.utils.Constant;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 17:42 <br>
 * @Author: 颜金星
 */
public abstract class BaseService<P extends BaseFegin<T>, T extends BaseModel> {

    protected P fegin;
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照id查询实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public T getInfoById(String id){
        return fegin.getModelById(id);
    }
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照条件分页查询
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public PageModel<T> getPageList(Map<String, Object> params){
        PageModel<T> pageModel=fegin.getPageList(params);
        return pageModel;
    }
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件查询列表
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public List<T> getList(Map<String, Object> params){
        return fegin.getList(params);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 新增实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void saveModel(T model){
        fegin.saveModel(model);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 修改实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void editModel(T model){
        fegin.editModel(model);
    }
    /**
     * @Param [id]
     * @Return:
     * @Decription: 按照id删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void deleteModel(T model){
        fegin.deleteModel(model);
    }
    /**
     * @Param [params]
     * @Return:
     * @Decription: 批量删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void deleteModelBatch(Map<String, Object> params){
        params.put("modifyUserId","1");
        fegin.deleteModelBatch(params);
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量新增实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void saveModelBatch(List<T> models){
        for(T model:models){
            model.setCreateDate(new Date());
            model.setDeleteState(Constant.DELETE_STATE_NO);
        }
        fegin.saveModelBatch(models);
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量修改实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void editModelBatch(List<T> models){
        for(T model:models){
            model.setModifyDate(new Date());
        }
        fegin.editModelBatch(models);
    }
}
