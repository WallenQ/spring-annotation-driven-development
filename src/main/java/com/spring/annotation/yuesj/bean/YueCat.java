package com.spring.annotation.yuesj.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 无实际意义，用于测试bean的生命周期
 * @author yuesj
 * @version 1.0
 * @date 2020/8/17 19:30
 */
public class YueCat implements InitializingBean,DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet()...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy()...");
    }
}
