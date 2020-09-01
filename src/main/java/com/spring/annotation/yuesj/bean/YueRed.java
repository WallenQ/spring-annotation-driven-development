package com.spring.annotation.yuesj.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * 无实际意义
 * @author yuesj
 * @version 1.0
 * @date 2020/8/9 11:17
 */
@Component
public class YueRed implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的ioc:"+applicationContext);
        this.applicationContext = applicationContext;

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("当前bean的名字:"+s);

    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好${os.name},我是#{18*20}");
        System.out.println(s);
        System.out.println("解析的字符串："+resolver);
    }
}
