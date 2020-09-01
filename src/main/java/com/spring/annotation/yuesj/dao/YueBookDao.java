package com.spring.annotation.yuesj.dao;

import org.springframework.stereotype.Repository;

/**
 * 用于测试，无实际意义
 * @author yuesj
 * @version 1.0
 * @date 2020/8/5 18:32
 */
@Repository
public class YueBookDao {
    private String label = "0";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "YueBookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
