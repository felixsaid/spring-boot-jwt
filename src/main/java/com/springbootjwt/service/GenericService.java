package com.springbootjwt.service;

import com.springbootjwt.domain.RandomCity;
import com.springbootjwt.domain.User;
import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
