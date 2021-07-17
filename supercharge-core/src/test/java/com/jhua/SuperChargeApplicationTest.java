package com.jhua;

import com.jhua.dao.UserMapper;
import com.jhua.model.User;
import com.jhua.service.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author linjian
 * @date 2018/9/29
 */
@SpringBootTest
class SuperChargeApplicationTest {

    public static void main(String[] args) {

    }

    @Autowired
    UserMapper userMapper;

    void test_00() {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SuperChargeApplication.class);
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(UserMapper.class);
        beanFactory.registerBeanDefinition("UserMapper", beanDefinition);
        UserMapper userMapper = (UserMapper) applicationContext.getBean("UserMapper");
        System.out.println(userMapper);
    }

    @Test
    void test_01() {
        System.out.println(userMapper);
        UserDto admin = userMapper.selectDtoByUsername("admin");
        System.out.println(admin.toString());
    }
}