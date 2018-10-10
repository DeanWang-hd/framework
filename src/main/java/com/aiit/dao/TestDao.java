package com.aiit.dao;

import com.aiit.model.po.TestModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 王海东
 * @date 2018/1/7 2:58
 */
@Repository
public interface TestDao {

    /**
     * 获取用户信息
     *  @param dataBase 数据库
     * @param name 姓名
     * @return List<TestModel>
     */
    List<TestModel> getUser(@Param("dataBase")String dataBase, @Param("name") String name);
}
