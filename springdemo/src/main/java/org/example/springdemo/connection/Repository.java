package org.example.springdemo.connection;

import org.example.springdemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<User,Integer> {
}
