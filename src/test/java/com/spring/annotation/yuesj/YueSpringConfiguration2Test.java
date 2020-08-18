package com.spring.annotation.yuesj;

import com.spring.annotation.yuesj.bean.YuePerson;
import com.spring.annotation.yuesj.config.YueSpringConfiguration2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 测试 YueSpringConfiguration2
 * @author yuesj
 * @version 1.0
 * @date 2020/8/17 15:56
 */
public class YueSpringConfiguration2Test {

    /*
     * 采用新注解需要用这个方式进行applicationContext容器获取:
     *      注意区别xml:ClassPathXmlApplicationContext
     */
    AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(YueSpringConfiguration2.class);

    /**
     * @Scope 测试
     */
    @Test
    public void test1(){
        System.out.println("ioc容器创建完成");
        YuePerson person1 = context.getBean(YuePerson.class);
        YuePerson person2 = context.getBean(YuePerson.class);
        System.out.println(person1 == person2);
    }

    /**
     * @Conditional 测试
     *      如果系统是windows，给容器中注册("bill")
     *      如果是linux系统，给容器中注册("linus")
     *      注意演示效果：可配置
     */
    @Test
    public void test2(){
        //获取环境
        ConfigurableEnvironment environment = context.getEnvironment();
        //动态获取环境变量的值 Windows 10
        String property = environment.getProperty("os.name");
        System.out.println("property:"+property);
        String[] beanNamesForType = context.getBeanNamesForType(YuePerson.class);
        for(String name:beanNamesForType){
            System.out.println(name);
        }
    }

    /**
     * @Import 测试
     *      注意:①ImportBeanDefinitionRegistrar
     *           ②ImportSelector
     */
    @Test
    public void test3(){
        String[] beanNamesForType = context.getBeanDefinitionNames();
        for(String name:beanNamesForType){
            System.out.println("name："+name);
        }
    }


}
