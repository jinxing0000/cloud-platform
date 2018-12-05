package com.bettem.platform.system.controller;

import com.bettem.platform.common.base.controller.BaseController;
import com.bettem.platform.common.base.model.PageModel;
import com.bettem.platform.system.model.SysAccountNumberModel;
import com.bettem.platform.system.service.SysAccountNumberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 14:22 <br>
 * @Author: 颜金星
 */
@RestController
@RequestMapping(value = "/sysAccountNumber")
public class SysAccountNumberController extends BaseController {

    @Autowired
    private SysAccountNumberService sysAccountNumberService;

    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照id查询账号信息
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(value = "/getInfoById" ,method = RequestMethod.GET)
    public SysAccountNumberModel getInfoById(@Param("id") String id){
        return sysAccountNumberService.getInfoById(id);
    }
    /**
     * @Param [id]
     * @Return: com.bettem.platform.system.model.SysAccountNumberModel
     * @Decription: 按照条件分页查询账号信息
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(value = "/getPageList" ,method = RequestMethod.GET)
    public PageModel<SysAccountNumberModel> getPageList(@RequestParam Map<String, Object> params){
        PageModel<SysAccountNumberModel> pageModel=sysAccountNumberService.getPageList(params);
        return pageModel;
    }
    /**
     * @Param [params]
     * @Return:
     * @Decription: 按照条件查询列表
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getList")
    List<SysAccountNumberModel> getList(@RequestParam Map<String, Object> params){
        return sysAccountNumberService.getList(params);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 新增实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    void saveModel(@RequestBody SysAccountNumberModel model){
        sysAccountNumberService.saveModel(model);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 修改实体数据
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/edit")
    void editModel(@RequestBody SysAccountNumberModel model){
        sysAccountNumberService.editModel(model);
    }
    /**
     * @Param [model]
     * @Return:
     * @Decription: 按照id删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    void deleteModel(@RequestBody SysAccountNumberModel model){
        sysAccountNumberService.deleteModel(model);
    }
    /**
     * @Param [ids]
     * @Return:
     * @Decription: 批量删除实体(逻辑删除)
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteBatch")
    void deleteModelBatch(@RequestBody Map<String, Object> params){
        sysAccountNumberService.deleteModelBatch(params);
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量新增实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.POST, value = "/saveBatch")
    void saveModelBatch(@RequestBody List<SysAccountNumberModel> models){
        sysAccountNumberService.saveModelBatch(models);
    }
    /**
     * @Param [models]
     * @Return:
     * @Decription: 批量修改实体
     * @CreateDate: Created in 2018/11/28 14:27
     * @Author: 颜金星
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/editBatch")
    void editModelBatch(@RequestBody List<SysAccountNumberModel> models){
        sysAccountNumberService.editModelBatch(models);
    }
}
