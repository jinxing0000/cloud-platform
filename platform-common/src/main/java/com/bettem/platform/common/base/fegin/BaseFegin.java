package com.bettem.platform.common.base.fegin;

import com.bettem.platform.common.base.model.BaseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 16:47 <br>
 * @Author: 颜金星
 */
public interface BaseFegin<T extends BaseModel> {
    /**
     * @Param [id]
     * @Return:
     * @Decription: 按照id查询账号信息
     * @CreateDate: Created in 2018/11/28 15:39
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getModelById")
    T getModelById(@RequestParam("id") String id);
}
