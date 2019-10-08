package com.ayudantia.chat.Controladores;

import java.util.List;

import javax.validation.Valid;

import com.ayudantia.chat.Entidades.Mensaje;
import com.ayudantia.chat.Servicio.MensajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/mensaje")
public class MensajeController{
    @Autowired
    @Qualifier("serviciomensaje")
    MensajeService servicio;

    @GetMapping("/{id}")
    public List<Mensaje> obtenerMayorId(@PathVariable("id") long id, @RequestParam(name="user", required = true) long user){
        return servicio.obtenerMayorId(id, user);
    }

    @PostMapping("/mensaje")
    public boolean agregarMensaje(@RequestBody @Valid Mensaje mensaje){
        return servicio.crear(mensaje);
    }

}