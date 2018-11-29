package com.bettem.platform.common.base.fegin.fallback;

import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 16:53 <br>
 * @Author: 颜金星
 */
public abstract class BaseHystrixFallback<T extends BaseModel> implements BaseFegin<T> {
    @Override
    public T getModelById(String id) {
        System.out.println("生产者断开+++++++++++");
        return null;
    }
    @Override
    public PageModel getPageList(Map<String, Object> params){
        System.out.println("生产者断开+++++++++++");
        return null;
    }
}
