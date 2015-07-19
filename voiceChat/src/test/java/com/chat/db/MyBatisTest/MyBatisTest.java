package com.chat.db.MyBatisTest;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.chat.sys.entity.User;
import com.chat.sys.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class MyBatisTest {
    private static Logger logger = Logger.getLogger(MyBatisTest.class);
    //  private ApplicationContext ac = null;
    @Resource
    private UserService userService = null;

//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  

    @Test
    public void test() {
        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));
    }
} 