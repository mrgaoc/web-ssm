package org.gaoc.ssm.mapper;


import org.gaoc.ssm.entity.User;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper {

    List<User> getUserList();
}
