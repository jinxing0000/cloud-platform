package com.bettem.platform.system.mapper;

import com.bettem.platform.common.base.mapper.BaseDaoMapper;
import com.bettem.platform.system.model.SysAccountNumberModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 11:42 <br>
 * @Author: 颜金星
 */
@Mapper
public interface SysAccountNumberMapper extends BaseDaoMapper<SysAccountNumberModel> {
    /**
     * @Param
     * @Return: 
     * @Decription: 按照id查询账号信息
     * @CreateDate: Created in 2018/11/28 15:04
     * @Author: 颜金星
     */

    SysAccountNumberModel selectModelById(String id);
}
