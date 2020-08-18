package com.spring.annotation.yuesj.config;

import com.spring.annotation.yuesj.bean.YuePerson;
import org.springframework.context.annotation.*;

/**
 * spring注解配置类 （等同于配置文件）
 * @author yuesj
 * @version 1.0
 * @date 2020/8/4 21:27
 *
 * @Configuration 告诉spring这是一个配置类
 *
 * @ComponentScan  value:指定要扫描的包
 * excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
 * includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
 * FilterType.ANNOTATION：按照注解
 * FilterType.ASSIGNABLE_TYPE：按照给定的类型；
 * FilterType.ASPECTJ：使用ASPECTJ表达式；
 * FilterType.REGEX：使用正则指定
 * FilterType.CUSTOM：使用自定义规则
 */
public class YueSpringConfiguration1 {

    /**
     * 给容器注册一个bean,id默认是方法名
     * @return
     */
    @Bean(value = "person")
    public YuePerson person01(){
        return new YuePerson("小明",24);
    }
}
