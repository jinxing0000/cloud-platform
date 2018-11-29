package com.bettem.platform.common.base.mapper;



import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bettem.platform.common.base.model.BaseModel;

import java.util.List;
import java.util.Map;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 16:29 <br>
 * @Author: 颜金星
 */
public interface BaseDaoMapper<T extends BaseModel> extends BaseMapper<T> {
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件查询列表
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    List<T> selectList(Map<String, Object> params);
    /**
     * @Param [ids]
     * @Return:
     * @Decription: 批量删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
     void deleteModelBatch(Map<String, Object> params);
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照条件分页查询
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
     List<T> selectPageList(Map<String, Object> params);
}
