package com.bdqn.mapper;

import com.bdqn.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    /**
     * 根据用户名和密码查询用户
     * @param user
     * @return
     */
    User selectTive(User user);
}