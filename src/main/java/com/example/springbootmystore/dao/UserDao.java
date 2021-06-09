package com.example.springbootmystore.dao;

import com.example.springbootmystore.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<Rol, Long> {

    List<Rol> findAll();
}
