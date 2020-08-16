package com.spring.annotation.yuesj.config;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义MyTypeFilter
 * @author yuesj
 * @version 1.0
 * @date 2020/8/5 19:43
 */
public class MyTypeFilter implements TypeFilter {

    public boolean match(MetadataReader metadataReader,
                         MetadataReaderFactory metadataReaderFactory) throws IOException {
        return false;
    }
}
