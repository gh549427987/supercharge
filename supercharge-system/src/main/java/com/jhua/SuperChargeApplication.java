package com.jhua;

import com.jhua.dao.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com")
public class SuperChargeApplication
{
    @Autowired
    UserMapper userMapper;

    public static void main( String[] args )
    {
        SpringApplication.run(SuperChargeApplication.class, args);
    }
}
