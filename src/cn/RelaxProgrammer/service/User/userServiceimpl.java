package cn.RelaxProgrammer.service.User;

import cn.RelaxProgrammer.dao.User.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceimpl implements  userService{
    @Resource
    private UserMapper userMapper;
    @Override
    public String CheckPasswordByu(String user_code) {
        return userMapper.CheckPasswordByu(user_code);
    }
}
