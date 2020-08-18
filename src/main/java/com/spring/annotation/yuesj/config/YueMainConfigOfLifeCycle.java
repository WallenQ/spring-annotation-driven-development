package com.spring.annotation.yuesj.config;

import com.spring.annotation.yuesj.bean.YueCar;
import com.spring.annotation.yuesj.bean.YueCat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * bean的生命周期：
 *      bean创建---初始化----销毁的过程
 *      构造（对象创建）：
 *          单实例：在容器启动的时候创建对象
 *          多实例：在每次获取的时候创建对象
 *
 *      1）、指定初始化和销毁方法；
 *              通过@Bean指定init-method和destroy-method；
 *      2）、通过让Bean实现InitializingBean（定义初始化逻辑），
 *              DisposableBean（定义销毁逻辑）;
 *
 * @author yuesj
 * @version 1.0
 * @date 2020/8/16 15:42
 */

@Configuration
public class YueMainConfigOfLifeCycle {


    /**
     * 指定初始化，销毁方法
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destory")
    public YueCar car(){
        return new YueCar();
    }


    @Bean
    public YueCat cat(){
        return new YueCat();
    }


}
