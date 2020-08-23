package com.spring.annotation.yuesj.config;

import com.spring.annotation.yuesj.bean.YuePerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 *
 * @author yuesj
 * @version 1.0
 * @date 2020/8/16 15:42
 */

@PropertySource(value = "classpath:/yuesj/YuePerson.properties")
@Configuration
public class YueMainConfigOfPropertyValues {

    @Bean
    public YuePerson person(){
        return new YuePerson("77", 23);
    }



}
