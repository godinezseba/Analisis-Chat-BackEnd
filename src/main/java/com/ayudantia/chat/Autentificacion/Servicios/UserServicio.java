package com.ayudantia.chat.Autentificacion.Servicios;

import java.util.Optional;

import com.ayudantia.chat.Autentificacion.Modelos.User;
import com.ayudantia.chat.Autentificacion.Repositorios.UserRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicio{

    @Autowired
    UserRepositorio repositorio;

    public User obtenerNombre(String nombre){
        Optional<User> user = repositorio.findByUserName(nombre);

        user.orElse(null);
        return user.get();
    }


}