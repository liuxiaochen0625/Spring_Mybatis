package com.reus.ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reus.ssm.mapper.UserMapper;
import com.reus.ssm.model.User;

/**
 * @author reus
 * @version $Id: UserMapperTest.java, v 0.1 2017-12-14 reus Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserById() throws Exception {
        //调用userMapper的方法
        User user = userMapper.findUserById(1);
        System.out.println(user);

    }

}
