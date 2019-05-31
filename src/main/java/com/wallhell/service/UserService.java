/***********************************************
 * File Name: UserService
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 05 2019 16:29
 ***********************************************/
package com.wallhell.service;

import com.wallhell.common.entity.UserEntity;

public interface UserService {
    UserEntity findByUsername(String username);
}
