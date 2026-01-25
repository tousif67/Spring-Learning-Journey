package com.user.service.Service;

import com.user.service.Entity.User;

import java.util.List;

public interface UserService {

    public User saveUser (User user) ;

    public List<User> getAllUser() ;

    public User getUser (String userId);
}
