package com.aiit.service.impl;

import com.aiit.dao.TestDao;
import com.aiit.model.po.TestModel;
import com.aiit.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王海东
 * @date 2018/1/7 2:58
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Resource
    private TestDao testDao;

    @Override
    public List<TestModel> getUser(String dataBase, String name) {
        return testDao.getUser(dataBase, name);
    }
}
