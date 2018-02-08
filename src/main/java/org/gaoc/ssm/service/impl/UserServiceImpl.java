package org.gaoc.ssm.service.impl;

import org.gaoc.ssm.entity.User;
import org.gaoc.ssm.mapper.UserMapper;
import org.gaoc.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
