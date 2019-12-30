package com.ayudantia.chat.Autentificacion.Controladores;

import com.ayudantia.chat.Autentificacion.Modelos.AuthenticationRequest;
import com.ayudantia.chat.Autentificacion.Modelos.AuthenticationResponse;
import com.ayudantia.chat.Autentificacion.Servicios.MyUserDetailsServicio;
import com.ayudantia.chat.Autentificacion.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthControlador{

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private MyUserDetailsServicio userServicio;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @PostMapping("/autentificar")
    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest request) throws Exception{
        try {
            authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Usuario o contraseña incorrecto", e);
        } 
        final UserDetails userDetails = userServicio.loadUserByUsername(request.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

    @PostMapping("/crear")
    public Boolean crearUsuario(@RequestBody AuthenticationRequest request){
        return userServicio.crear(request);
    }

}