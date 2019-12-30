package com.ayudantia.chat.Mensajeria.Repositorio;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.chat.Mensajeria.Modelos.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepo extends JpaRepository<Consulta, Serializable>{

    public abstract List<Consulta> findByTecnicoOrCliente(long tecnico, long cliente);

}