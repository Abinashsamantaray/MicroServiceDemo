package com.user.user_service.Service;

import com.user.user_service.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserSerivce{

    // fake user list
    List<User> list = List.of(
            new User(1134L , "Abinash Samantaray" ,"987654321"),
            new User(1222L , "Bikash Kumar Samantaray" ,"9789876567"),
            new User(1000L , "Ram Gopal" ,"9000876567")
        );
    
    
    
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
