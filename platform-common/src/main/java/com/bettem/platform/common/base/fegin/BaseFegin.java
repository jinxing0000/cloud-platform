package com.bettem.platform.common.base.fegin;

import com.bettem.platform.common.base.model.BaseModel;
import com.bettem.platform.common.base.model.PageModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

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
     * @Decription: 按照id查询实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getModelById")
    T getModelById(@RequestParam("id") String id);
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件分页查询
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.POST, value = "/getPageList")
    PageModel<T> getPageList(@RequestBody Map<String, Object> params);
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件查询列表
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.POST, value = "/getList")
    List<T> getList(@RequestBody Map<String, Object> params);
    /**
     * @Param [model]
     * @Return:
     * @Decription: 新增实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    void saveModel(@RequestBody T model);
    /**
     * @Param [model]
     * @Return:
     * @Decription: 修改实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/edit")
    void editModel(@RequestBody T model);
    /**
     * @Param [model]
     * @Return:
     * @Decription: 按照id删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    void deleteModel(@RequestBody T model);
    /**
     * @Param [params]
     * @Return:
     * @Decription: 批量删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteBatch")
    void deleteModelBatch(@RequestBody Map<String, Object> params);
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量新增实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.POST, value = "/saveBatch")
    void saveModelBatch(@RequestBody List<T> models);
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量修改实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/editBatch")
    void editModelBatch(@RequestBody List<T> models);
}
