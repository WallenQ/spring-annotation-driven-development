# spring-annotation-driven-development
Spring注解驱动开发学习笔记

目录结构
```
com.spring.annotation.result---功能完善、有意义的（总结设计模式、算法、代码思维、工具类、抽象逻辑等）文件目录
com.spring.annotation.wallen---钱文龙文件目录
com.spring.annotation.yuesj---岳少俊文件目录
```

技术难点
-----------------------------------
- 请输入技术难点。。。``

注解解析
-----------------------------------
1.@Configuration 用于标注配置类  
2.@Bean  
    生命周期：
3.@Scope 设置作用域   
    ①.prototype(多例)：在每次获取的时候创建对象
    ②.single(单例，默认)：在容器启动的时候创建对象
4.@Lazy 懒加载  
5.@Conditional 按照一定条件进行判断，满足条件给容器中注册Bean  
6.@Import 快速给容器导入一个容器  
    ①.Import(类名)，容器中就会自动注册这个组件，id默认时组件的全名  
    ②.ImportSelector 返回需要导入的组件的全类名的数组  
    ③.ImportBeanDefinitionRegistrar 手动注册Bean
    
        