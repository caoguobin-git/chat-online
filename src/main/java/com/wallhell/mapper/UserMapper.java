/***********************************************
 * File Name: UserMapper
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 05 2019 15:15
 ***********************************************/
package com.wallhell.mapper;

import com.wallhell.common.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserEntity findByUsername(String username);

}
