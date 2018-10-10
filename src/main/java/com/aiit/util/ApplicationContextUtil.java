package com.aiit.util;

import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.web.context.ContextLoader;

/**
 * @author jfjiang
 * @since 2016-10-14
 */
public class ApplicationContextUtil {
    private static org.springframework.context.ApplicationContext context;

    public static void setContext(org.springframework.context.ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        if (context == null)
            context = ContextLoader.getCurrentWebApplicationContext();
        T bean = context.getBean(clazz);
        if (bean instanceof Advised) {
            Advised advised = (Advised) bean;
            SingletonTargetSource singTarget = (SingletonTargetSource) advised.getTargetSource();
            Object target = singTarget.getTarget();
            return (T) target;
        }
        return bean;
    }
}
