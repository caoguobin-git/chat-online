/***********************************************
 * File Name: UserServiceImpl
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 05 2019 16:30
 ***********************************************/

package com.wallhell.serviceImpl;

import com.wallhell.common.entity.UserEntity;
import com.wallhell.mapper.UserMapper;
import com.wallhell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
