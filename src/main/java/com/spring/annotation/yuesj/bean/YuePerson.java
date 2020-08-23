package com.spring.annotation.yuesj.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * 无实际意义，用于测试
 * @author yuesj
 * @version 1.0
 * @date 2020/8/4 21:26
 */
public class YuePerson {
    /**
     *  使用value赋值
     *      1.基本数值
     *      2.可以写Spel,#{}
     *      3.可以写 ${},取出配置文件的值
     */
    @Value("zzc")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public YuePerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "YuePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
