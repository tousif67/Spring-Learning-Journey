package com.user.service;

import com.user.model.Alien;

import java.util.List;

public interface IAlienService {

    public Alien registerAlien(Alien alien);
    public List<Alien> getAllAliensInfo();
}
