package com.bettem.platform.system.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.bettem.platform.common.base.model.BaseModel;

/**
 * 山西百得科技开发股份有限公司 版权所有 © Copyright 2018<br>
 *
 * @Description:
 * @Project: cloud-platform
 * @CreateDate: Created in 2018/11/28 10:56 <br>
 * @Author: 颜金星
 */
@TableName("SYS_ACCOUNT_NUMBER")
public class SysAccountNumberModel extends BaseModel {
    //用户名
    private String userName;
    //密码
    private String password;
    //昵称
    private String nickName;
    //手机号
    private String phone;
    //邮箱
    private String email;
    //状态
    private String state;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
