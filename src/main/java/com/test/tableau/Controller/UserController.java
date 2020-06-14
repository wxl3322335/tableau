package com.test.tableau.Controller;
import com.test.tableau.Bean.User;
import com.test.tableau.Bean.User2;
import com.test.tableau.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //1.查询所有
    @RequestMapping("/query")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    //根据sex查询学生
    @RequestMapping("/queryByUserName/{sex}")
    public List<User> getUserByName(@PathVariable("sex") Long sex){
        return userService.getUserByName(sex);
    }


}
