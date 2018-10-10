package com.aiit.model.po;

import java.io.Serializable;

/**
 * @author 王海东
 * @date 2018/1/7 2:58
 */
public class TestModel implements Serializable {

    private static final long serialVersionUID = 7882968456176098794L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;

    public TestModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
