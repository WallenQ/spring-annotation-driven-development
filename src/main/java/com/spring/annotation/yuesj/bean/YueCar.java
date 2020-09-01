package com.spring.annotation.yuesj.bean;

import org.springframework.stereotype.Component;

/**
 * 无实际意义，用于测试bean的生命周期
 * @author yuesj
 * @version 1.0
 * @date 2020/8/17 19:30
 */
@Component
public class YueCar {
    public YueCar(){
        System.out.println("Car的构造器");
    }

    public void init(){
        System.out.println("car...init...");
    }

    public void destory(){
        System.out.println("car...destory...");
    }
}
