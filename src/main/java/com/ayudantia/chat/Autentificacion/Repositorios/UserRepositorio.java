package com.ayudantia.chat.Autentificacion.Repositorios;

import java.io.Serializable;
import java.util.Optional;

import com.ayudantia.chat.Autentificacion.Modelos.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorio extends JpaRepository<User, Serializable>{
    Optional<User> findByUserName(String userName);
}