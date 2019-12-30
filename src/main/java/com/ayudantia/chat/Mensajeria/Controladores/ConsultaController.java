package com.ayudantia.chat.Mensajeria.Controladores;

import java.util.List;

import javax.validation.Valid;

import com.ayudantia.chat.Autentificacion.Servicios.UserServicio;
import com.ayudantia.chat.Autentificacion.util.JwtUtil;
import com.ayudantia.chat.Mensajeria.Modelos.Consulta;
import com.ayudantia.chat.Mensajeria.Servicio.ConsultaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/consulta")
public class ConsultaController{
    @Autowired
    ConsultaService servicio;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/consulta")
    public boolean crear(@RequestBody @Valid Consulta consulta){
        return servicio.crear(consulta);
    }

    @GetMapping("/consultas")
    public List<Consulta> obtenerId(@RequestHeader("Authorization") String jwt){
        // extraigo el usuario
        jwt = jwt.substring(7);
        final long id = jwtUtil.extractId(jwt);

        return servicio.obtenerAllId(id);
    }
}