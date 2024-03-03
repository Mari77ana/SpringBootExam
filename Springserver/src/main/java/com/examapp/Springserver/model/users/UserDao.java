package com.examapp.Springserver.model.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

// Dao = Data Access Object
// This class will do all database operations


@Service  // This class can serve us this functions
public class UserDao {

    // This is dependencies Injection
    @Autowired
    private UserRepository repository; // no need new to instantiate

    public void save(User user) {
        repository.save(user);
    }


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll())
        .forEach(users::add);
        return users;
    }


    public long getUserCount() {
      return repository.count();

    }




    public void delete(User user) {
        repository.delete(user);
    }
}
