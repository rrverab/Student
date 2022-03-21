package com.mycompany.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repor;

    public List<User> ListAll(){
       return (List<User>) repor.findAll();

    }

    public void save(User user){
        repor.save(user);

    }


}
