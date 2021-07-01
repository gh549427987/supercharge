package com.jhua;

import static org.junit.Assert.assertTrue;

import com.jhua.dao.UserMapper;
import com.jhua.model.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest
{

    @Autowired
    UserMapper userMapper;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1() {
        System.out.println(userMapper);
//        User user = userMapper.selectByPrimaryKey(1L);
//        System.out.println(user);
    }
}
