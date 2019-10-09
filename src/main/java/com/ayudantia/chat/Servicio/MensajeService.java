package com.ayudantia.chat.Servicio;

import java.util.List;

import com.ayudantia.chat.Entidades.Mensaje;
import com.ayudantia.chat.Repositorio.MensajeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciomensaje")
public class MensajeService{
    @Autowired
    @Qualifier("repomensaje")
    MensajeRepo repositorio;

    public boolean crear(Mensaje mensaje){
        try{
            repositorio.save(mensaje);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean actualizar(Mensaje mensaje){
        try{
            repositorio.save(mensaje);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Mensaje mensaje = repositorio.findById(id);
            repositorio.delete(mensaje);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public List<Mensaje> obtenerMayorId(long id, String user){
        return repositorio.findByIdGreaterThanAndUser(id, user);
    }
}