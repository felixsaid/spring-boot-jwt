package com.springbootjwt.repository;

import com.springbootjwt.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;


public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
