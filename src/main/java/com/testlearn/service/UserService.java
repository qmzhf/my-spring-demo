package com.testlearn.service;

import com.spring.*;

@Component("userService")
@Scope("prototype")
public class UserService implements InitializingBean,UserInterface, BeanNameAware {

    @Autowired
    private OrderService orderService;

    @LearnTestValue("xxx")
    private String test;

    private String beanName;


    public void test() {
        System.out.println(test);
        System.out.println(beanName);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("初始化");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
