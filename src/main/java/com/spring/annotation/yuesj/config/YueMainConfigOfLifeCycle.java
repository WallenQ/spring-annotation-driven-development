package com.spring.annotation.yuesj.config;

import com.spring.annotation.yuesj.bean.YueCar;
import com.spring.annotation.yuesj.bean.YueCat;
import com.spring.annotation.yuesj.bean.YueDog;
import com.spring.annotation.yuesj.bean.YueMyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * bean的生命周期：
 *      bean创建---初始化----销毁的过程
 * 容器管理bean的生命周期：
 *      我们可以自定义初始化和销毁方法；容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
 *      构造（对象创建）：
 *          单实例：在容器启动的时候创建对象
 *          多实例：在每次获取的时候创建对象
 *
 * BeanPostProcessor.postProcessBeforeInitialization
 * 初始化：创建对象完成，并赋值好，调用初始化方法
 * BeanPostProcessor.postProcessAfterInitialization
 * 销毁：
 *      单实例：容器关闭的时候
 *      多实例：容器不会管理这个bean；容器不会调用这个销毁方法
 *
 * 注意：
 * BeanPostProcessor原理
 * populateBean(beanName, mbd, instanceWrapper);给bean进行属性赋值
 * initializeBean
 *      {
 *          applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 *          invokeInitMethods(beanName, wrappedBean, mbd);执行自定义初始化
 *          applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 *      }
 *
 *      1）、指定初始化和销毁方法；
 *              通过@Bean指定init-method和destroy-method；
 *      2）、通过让Bean实现InitializingBean（定义初始化逻辑），
 *              DisposableBean（定义销毁逻辑）;
 *      3）、可以使用JSR250；
 *              @PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法
 *              @PreDestroy：在容器销毁bean之前通知我们进行清理工作
 *      4）、BeanPostProcessor【interface】：bean的后置处理器；
 *              在bean初始化前后进行一些处理工作；
 *              postProcessBeforeInitialization:在初始化之前工作;
 *              postProcessAfterInitialization:在初始化之后工作
 *
 * Spring底层对 BeanPostProcessor 的使用
 *      bean赋值，注入其他组件，@Autowired，生命周期注解功能，@Async,xxx BeanPostProcessor;
 *
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


    /**
     * 通过让Bean实现InitializingBean（定义初始化逻辑），DisposableBean（定义销毁逻辑）;
     * @return
     */
    @Bean
    public YueCat cat(){
        return new YueCat();
    }

    /**
     * 使用JSR250
     * @return
     */
    @Bean
    public YueDog dog(){
        return new YueDog();
    }


    @Bean
    public YueMyBeanPostProcessor beanPostProcessor(){
        return new YueMyBeanPostProcessor();
    }


}
