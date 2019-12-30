package com.ayudantia.chat.Mensajeria.Servicio;

import java.util.List;

import com.ayudantia.chat.Mensajeria.Modelos.Consulta;
import com.ayudantia.chat.Mensajeria.Repositorio.ConsultaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService{
    @Autowired
    ConsultaRepo repositorio;

    public boolean crear(Consulta mensaje){
        try{
            repositorio.save(mensaje);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean actualizar(Consulta mensaje){
        try{
            repositorio.save(mensaje);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public List<Consulta> obtenerAllId(long id){
        return repositorio.findByTecnicoOrCliente(id, id);
    }
}