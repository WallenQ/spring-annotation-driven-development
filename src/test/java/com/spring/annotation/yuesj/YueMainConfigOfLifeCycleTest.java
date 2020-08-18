package com.spring.annotation.yuesj;

import com.spring.annotation.yuesj.bean.YueCar;
import com.spring.annotation.yuesj.bean.YueCat;
import com.spring.annotation.yuesj.config.YueMainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试 MainConfigOfLifeCycleTest
 * @author yuesj
 * @version 1.0
 * @date 2020/8/17 19:32
 */
public class YueMainConfigOfLifeCycleTest {

    /*
     * 采用新注解需要用这个方式进行applicationContext容器获取:
     *      注意区别xml:ClassPathXmlApplicationContext
     */
    AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(YueMainConfigOfLifeCycle.class);

    /**
     * 测试bean的生命周期:
     *          指定初始化和销毁方法
     *          注意：当为多例时没有调用销毁方法
     */
    @Test
    public void test1(){
        //创建容器
        context.getBean(YueCar.class);
        System.out.println("容器创建完成");
        //关闭容器
        context.close();
    }

    /**
     * 测试bean的生命周期:
     *          通过让Bean实现InitializingBean（定义初始化逻辑），DisposableBean（定义销毁逻辑）;
     *
     */
    @Test
    public void test2(){
        //创建容器
        context.getBean(YueCat.class);
        System.out.println("cat 容器创建完成");
        //关闭容器
        context.close();
    }
}
