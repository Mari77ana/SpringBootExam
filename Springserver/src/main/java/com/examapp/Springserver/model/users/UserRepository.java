package com.examapp.Springserver.model.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



// Repository is a middle hand and is going to talk with database
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}

