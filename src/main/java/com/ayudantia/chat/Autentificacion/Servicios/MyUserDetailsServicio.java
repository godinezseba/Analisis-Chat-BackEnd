package com.ayudantia.chat.Autentificacion.Servicios;

import java.util.Optional;

import com.ayudantia.chat.Autentificacion.Modelos.AuthenticationRequest;
import com.ayudantia.chat.Autentificacion.Modelos.MyUserDetails;
import com.ayudantia.chat.Autentificacion.Modelos.User;
import com.ayudantia.chat.Autentificacion.Repositorios.UserRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServicio implements UserDetailsService{
    
    @Autowired
    UserRepositorio repositorio;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        Optional<User> user = repositorio.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("No se encontro a: " + userName));

        return user.map(MyUserDetails::new).get();
    }

    public Boolean crear(AuthenticationRequest request){
        User usuario = new User();
        usuario.setUserName(request.getUsername());
        usuario.setPassword(request.getPassword());
        try{
            repositorio.save(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}