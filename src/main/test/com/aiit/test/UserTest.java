package com.aiit.test;

import com.aiit.model.po.TestModel;
import com.aiit.service.TestService;
import com.aiit.util.ApplicationContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 王海东
 * @date 2018/1/7 2:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class UserTest implements ApplicationContextAware {
    // 日志
    private final static Logger logger = LoggerFactory.getLogger(UserTest.class);

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        ApplicationContextUtil.setContext(applicationContext);
    }

    @Test
    public void getUser() {
        /*TestService service = applicationContext.getBean(TestService.class);*/
        TestService service = ApplicationContextUtil.getBean(TestService.class);
        List<TestModel> users = service.getUser("tourism", "jfjiang");
        logger.info("userName: " + users.get(0).getName() + " ---- password: " + users.get(0).getPassword());
    }

}
