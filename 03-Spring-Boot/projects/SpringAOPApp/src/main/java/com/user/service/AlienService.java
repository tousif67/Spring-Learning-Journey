package com.user.service;

import com.user.dao.IAlienRepo;
import com.user.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlienService implements IAlienService{

    @Autowired
    private IAlienRepo repo;
    @Override
    public Alien registerAlien(Alien alien) {
        return repo.save(alien);
    }

    @Override
    public List<Alien> getAllAliensInfo() {
        return repo.findAll();
    }
}
