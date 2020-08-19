package com.spring.annotation.yuesj.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 无实际意义，用于测试bean的生命周期
 * @author yuesj
 * @version 1.0
 * @date 2020/8/18 19:21
 */
public class YueDog {

    public YueDog() {
        System.out.println("dog 构造器");
    }

    /**
     * 对象创建并赋值之后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("dog @PostConstruct ");
    }

    /**
     * 容器移除对象之前调用
     */
    @PreDestroy
    public void destroy(){
        System.out.println("dog @PreDestroy ");
    }
}
