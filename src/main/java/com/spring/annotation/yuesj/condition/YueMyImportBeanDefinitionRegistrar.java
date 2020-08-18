package com.spring.annotation.yuesj.condition;

import com.spring.annotation.yuesj.bean.YueRainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义导入Bean定义注册器
 * @author yuesj
 * @version 1.0
 * @date 2020/8/16 11:47
 */
public class YueMyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 
     * @param importingClassMetadata AnnotationMetadata 当前类的注解信息
     * @param registry BeanDefinition注册类
     *                 把所有需要添加到容器中的bean；调用BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        boolean definition1 = registry.containsBeanDefinition("com.spring.annotation.yuesj.bean.YueRed");
        boolean definition2 = registry.containsBeanDefinition("com.spring.annotation.yuesj.bean.YueYellow");
        if(definition1 && definition2){
            //指定Bean定义信息；（Bean的类型，Bean）
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(YueRainBow.class);
            //注册一个Bean 指定bean名
            registry.registerBeanDefinition("rainBow", rootBeanDefinition);
        }
    }
}
