package com.spring.annotation.yuesj.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义返回需要导入的组件
 * @author yuesj
 * @version 1.0
 * @date 2020/8/12 21:53
 */
public class MyImportSelector implements ImportSelector {

	/**
	 * 重写selectImports 方法
	 * @param importingClassMetadata 当前标注@Import注解的类的所有注解信息
	 * @return 就是到导入到容器中的组件全类名
	 */
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//方法不要返回null
		return new String[]{"com.spring.annotation.yuesj.bean"};
	}

}
