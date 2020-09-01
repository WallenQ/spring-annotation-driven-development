package com.spring.annotation.yuesj;

import com.spring.annotation.yuesj.bean.YueBoos;
import com.spring.annotation.yuesj.bean.YueCar;
import com.spring.annotation.yuesj.bean.YueRed;
import com.spring.annotation.yuesj.config.YueMainConfigOfAutowired;
import com.spring.annotation.yuesj.dao.YueBookDao;
import com.spring.annotation.yuesj.service.YueBookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yuesj
 * @version 1.0
 * @date 2020/8/24 21:25
 */
public class YueMainConfigOfAutowiredTest {

    /*
     * 采用新注解需要用这个方式进行applicationContext容器获取:
     *      注意区别xml:ClassPathXmlApplicationContext
     */
    AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(YueMainConfigOfAutowired.class);

    /**
     * 比较 @Autowired 注解的注入的YueBookDao 是否与 YueBookDao一致
     */
    @Test
    public void test01(){
        YueBookService bookService = context.getBean(YueBookService.class);
        System.out.println(bookService);

        YueBookDao bookDao = context.getBean(YueBookDao.class);
        System.out.println(bookDao);
    }


    @Test
    public void test02(){
        YueBookService bookService = context.getBean(YueBookService.class);
        System.out.println(bookService);
    }


    @Test
    public void test03(){
        YueBoos boos = context.getBean(YueBoos.class);
        System.out.println(boos);

        YueCar car = context.getBean(YueCar.class);
        System.out.println(car);
    }

    @Test
    public void test04(){
        YueRed red = context.getBean(YueRed.class);
        System.out.println(red);
    }


}
