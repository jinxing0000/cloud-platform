package com.bettem.platform.common.base.fegin.fallback;

import com.bettem.platform.common.base.fegin.BaseFegin;
import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
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

    private static Logger logger = LoggerFactory.getLogger(BaseHystrixFallback.class);
    /**
     * @Param [id]
     * @Return:
     * @Decription: 按照id查询实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @Override
    public T getModelById(String id) {
        logger.debug("按照id查询实体发生错误，请仔细查看！");
        return null;
    }
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件分页查询
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @Override
    public PageModel<T> getPageList(Map<String, Object> params){
        logger.debug("按照分页条件查询实体发生错误，请仔细查看！");
        return null;
    }
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件查询列表
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public List<T> getList(Map<String, Object> params){
        logger.debug("按照条件查询列表发生错误，请仔细查看！");
        return null;
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 新增实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void saveModel(T model){
        logger.debug("新增实体数据发生错误，请仔细查看！");
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 修改实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void editModel(T model){
        logger.debug("修改实体数据发生错误，请仔细查看！");
    }
    /**
     * @Param [id]
     * @Return:
     * @Decription: 按照id删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void deleteModel(T model){
        logger.debug("按照id删除实体发生错误，请仔细查看！");
    }
    /**
     * @Param [ids]
     * @Return:
     * @Decription: 批量删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void deleteModelBatch(Map<String, Object> params){
        logger.debug("批量删除实体发生错误，请仔细查看！");
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量新增实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void saveModelBatch(List<T> models){
        logger.debug("批量新增实体发生错误，请仔细查看！");
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量修改实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    public void editModelBatch(List<T> models){
        logger.debug("批量修改实体发生错误，请仔细查看！");
    }
}
