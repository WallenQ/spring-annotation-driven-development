package com.spring.annotation.yuesj;

import com.spring.annotation.yuesj.bean.YuePerson;
import com.spring.annotation.yuesj.config.YueSpringConfiguration1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试 YueSpringConfiguration1
 * @author yuesj
 * @version 1.0
 * @date 2020/8/17 15:56
 */
public class YueSpringConfiguration1Test {

    /*
     * 采用新注解需要用这个方式进行applicationContext容器获取:
     *      注意区别xml:ClassPathXmlApplicationContext
     */
    AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(YueSpringConfiguration1.class);

    /**
     * @Bean 测试
     */
    @Test
    public void test1(){
        YuePerson person = context.getBean(YuePerson.class);
        System.out.println(person);
    }

    /**
     * 注解测试：
     *      @Controller @Service @@Repository @Configuration @Bean
     */
    @Test
    public void test2(){
        String[] beanNamesForType = context.getBeanDefinitionNames();
        for(String name:beanNamesForType){
            System.out.println("class："+name);
        }
    }
}
