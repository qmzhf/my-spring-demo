package com.testlearn;

import com.spring.MyApplicationContext;
import com.testlearn.service.UserInterface;
import com.testlearn.service.UserService;

public class Test {
    public static void main(String[] args) {
//       扫描-> 创建单例bean
        MyApplicationContext context = new MyApplicationContext(AppConfig.class);
        UserInterface userService = (UserInterface) context.getBean("userService");
        userService.test();
    }
}
