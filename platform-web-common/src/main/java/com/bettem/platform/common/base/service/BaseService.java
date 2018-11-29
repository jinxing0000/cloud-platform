package com.bettem.platform.common.base.service;

import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;

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
    public PageModel getPageList(Map<String, Object> params){
        PageModel pageModel=fegin.getPageList(params);
        return pageModel;
    }
}
