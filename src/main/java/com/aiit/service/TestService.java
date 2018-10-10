package com.aiit.service;

import com.aiit.model.po.TestModel;

import java.util.List;

/**
 * @author 王海东
 * @date 2018/1/7 2:58
 */
public interface TestService {

    /**
     * 获取用户信息
     * @param dataBase 数据库
     * @param name 姓名
     * @return List<TestModel>
     */
    List<TestModel> getUser(String dataBase, String name);
}
