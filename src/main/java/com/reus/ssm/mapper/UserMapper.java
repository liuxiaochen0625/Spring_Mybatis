package com.reus.ssm.mapper;

import com.reus.ssm.model.User;


/**
 * Created by 言曌 on 2017/8/10.
 */
public interface UserMapper {
	//根据id查询用户信息
	User findUserById(int id) throws Exception;
	
}
