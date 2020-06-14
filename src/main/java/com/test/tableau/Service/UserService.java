package com.test.tableau.Service;
import com.test.tableau.Bean.User;
import com.test.tableau.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

    public List<User> getUserByName(Long sex){
        return userMapper.getUserByName(sex);
    }


}
