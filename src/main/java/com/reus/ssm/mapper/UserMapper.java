package com.reus.ssm.mapper;

import com.reus.ssm.model.User;

/**
 * @author reus
 * @version $Id: UserMapper.java, v 0.1 2017-12-14 reus Exp $
 */
public interface UserMapper {
    //根据id查询用户信息
    User findUserById(int id) throws Exception;

}
