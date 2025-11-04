package com.user.repo;

import com.user.entity.Alien;
import org.springframework.data.repository.CrudRepository;

public interface IAlien extends CrudRepository<Alien, Integer> {


}
