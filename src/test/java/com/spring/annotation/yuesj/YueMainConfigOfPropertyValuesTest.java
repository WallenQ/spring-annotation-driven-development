package com.spring.annotation.yuesj;

import com.spring.annotation.yuesj.bean.YuePerson;
import com.spring.annotation.yuesj.config.YueMainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 测试 YueMainConfigOfPropertyValues
 * @author yuesj
 * @version 1.0
 * @date 2020/8/23 13:37
 */
public class YueMainConfigOfPropertyValuesTest {
    /*
     * 采用新注解需要用这个方式进行applicationContext容器获取:
     *      注意区别xml:ClassPathXmlApplicationContext
     */
    AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(YueMainConfigOfPropertyValues.class);

    @Test
    public void test1(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test2(){
        YuePerson person = context.getBean(YuePerson.class);
        System.out.println(person);

        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);

    }

}
