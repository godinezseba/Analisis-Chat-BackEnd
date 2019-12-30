package com.ayudantia.chat.Mensajeria.Repositorio;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.chat.Mensajeria.Modelos.Mensaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repomensaje")
public interface  MensajeRepo extends JpaRepository<Mensaje, Serializable>{

    public abstract Mensaje findById(long id);

    public abstract List<Mensaje> findByIdGreaterThanAndConsulta(long id, long consulta);

}