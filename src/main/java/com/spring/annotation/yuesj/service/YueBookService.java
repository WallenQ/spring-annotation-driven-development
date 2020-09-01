package com.spring.annotation.yuesj.service;

import com.spring.annotation.yuesj.dao.YueBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuesj
 * @version 1.0
 * @date 2020/8/25 21:32
 */
@Service
public class YueBookService {

    //@Qualifier("yueBookDao")
    //@Autowired(required = false)
    @Resource
    private YueBookDao yueBookDao;


    @Override
    public String toString() {
        return "YueBookService{" +
                "bookDao=" + yueBookDao +
                '}';
    }
}
