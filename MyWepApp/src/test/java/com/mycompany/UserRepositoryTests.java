package com.mycompany;


import com.mycompany.user.User;
import com.mycompany.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private UserRepository repor;

    @Test
    public void testAddNew() {

        User user = new User();
        user.setEmail("roman@gmail.com");
        user.setPassword("sofia.39");
        user.setFirtsname("romamn");
        user.setLastname("ver");

        User savedUser = repor.save(user);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);

    }
    @Test
    public void testListAll(){
       Iterable<User> users = repor.findAll();
       Assertions.assertThat(users).hasSizeGreaterThan(0);
        for(User user : users){
            System.out.println(user);

        }
    }

    @Test
    public void testUpdate(){
        Integer userId = 1;
        Optional<User> optionalUser = repor.findById(userId);
        User user = optionalUser.get();
        user.setPassword("ceci.40");
        repor.save(user);
        User updatedUser = repor.findById(userId).get();
        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("ceci.40");

    }
    @Test
    public void testGet(){
        Integer userId = 2;
        Optional<User> optionalUser = repor.findById(userId);
        Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());

    }

    @Test
    public void testDeleted(){
        Integer userId = 1;
         repor.deleteById(1);
        Optional<User> optionalUser = repor.findById(1);
        Assertions.assertThat(optionalUser).isNotPresent();



    }



}