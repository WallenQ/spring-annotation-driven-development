package com.spring.annotation.yuesj.config;

import com.spring.annotation.yuesj.bean.YueColor;
import com.spring.annotation.yuesj.bean.YuePerson;
import com.spring.annotation.yuesj.condition.YueLinuxCondition;
import com.spring.annotation.yuesj.condition.YueMyImportBeanDefinitionRegistrar;
import com.spring.annotation.yuesj.condition.YueMyImportSelector;
import com.spring.annotation.yuesj.condition.YueWindowsCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * spring注解配置类 （等同于配置文件）
 * @author yuesj
 * @version 1.0
 * @date 2020/8/4 21:27
 */
@Configuration
@ComponentScan("com.spring.annotation.yuesj")
@Import({YueColor.class,YueMyImportSelector.class,YueMyImportBeanDefinitionRegistrar.class})
public class YueSpringConfiguration2 {


    /**
     * 默认是单实例的
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
     * @return\
     * @Scope:调整作用域
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 					每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 			以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     * 懒加载：
     * 		单实例bean：默认在容器启动的时候创建对象；
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     *
     */
    @Scope("prototype")
    @Bean()
    public YuePerson person(){
        System.out.println("给容器中添加Person... ");
        return new YuePerson("小蓝",28);
    }

    /**
     * @Conditional({Condition}) ： 按照一定的条件进行判断，满足条件给容器中注册bean
     *
     * 如果系统是windows，给容器中注册("bill")
     * 如果是linux系统，给容器中注册("linus")
     */
    @Conditional(YueWindowsCondition.class)
    @Bean("bill")
    public YuePerson person01(){
        return new YuePerson("Bill Gates",62);
    }

    @Conditional(YueLinuxCondition.class)
    @Bean("linus")
    public YuePerson person02(){
        return new YuePerson("linus", 48);
    }
}
