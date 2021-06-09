package com.example.springbootmystore.service.impl;

import com.example.springbootmystore.dao.UserDao;
import com.example.springbootmystore.model.Rol;
import com.example.springbootmystore.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserService implements UserService {

    private final UserDao userDao;

    public DefaultUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Rol> getAllRol() {
        return userDao.findAll();
    }
}
