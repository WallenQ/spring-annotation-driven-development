package com.spring.annotation.yuesj.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 无实际意义
 * @author yuesj
 * @version 1.0
 * @date 2020/8/17 19:30
 */
@Component
public class YueBoos {

    private YueCar car;

    public YueCar getCar() {
        return car;
    }

    /**
     * 标注在方法上，Spring容器创建当前对象，就会调用方法，完成赋值；
     * 方法使用的参数，自定义类型的值从ioc取
     * @param car
     */
    @Autowired
    public void setCar(YueCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "YueBoos{" +
                "car=" + car +
                '}';
    }
}
