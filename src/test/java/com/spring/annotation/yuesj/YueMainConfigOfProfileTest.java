package com.spring.annotation.yuesj;

import com.spring.annotation.yuesj.bean.YueBoos;
import com.spring.annotation.yuesj.bean.YueCar;
import com.spring.annotation.yuesj.bean.YueRed;
import com.spring.annotation.yuesj.config.YueMainConfigOfProfile;
import com.spring.annotation.yuesj.dao.YueBookDao;
import com.spring.annotation.yuesj.service.YueBookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yuesj
 * @version 1.0
 * @date 2020/8/24 21:25
 */
public class YueMainConfigOfProfileTest {

    /*
     * 采用新注解需要用这个方式进行applicationContext容器获取:
     *      注意区别xml:ClassPathXmlApplicationContext
     */
    AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(YueMainConfigOfProfile.class);


    @Test
    public void test01(){
        //1.创建一个applicationContext
        //2.设置一个需要激活的环境
        context.getEnvironment().setActiveProfiles("dev");
        //3.注册配置类
        context.register(YueMainConfigOfProfile.class);
        //4.启动刷新容器
        //context.refresh();
        String[] beanNamesForType = context.getBeanDefinitionNames();
        for(String name:beanNamesForType){
            System.out.println(name);
    }



    }


}
