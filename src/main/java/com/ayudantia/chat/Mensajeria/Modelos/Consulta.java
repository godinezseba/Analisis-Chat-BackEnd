package com.ayudantia.chat.Mensajeria.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Consulta")
public class Consulta{
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_consulta")
    private long id;

    @Column(name="id_tecnico")
    private long tecnico;

    @Column(name="id_cliente")
    private long cliente;

    public Consulta(){
        
    }

    public Consulta(long id, long tecnico, long cliente) {
        this.id = id;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(long tecnico) {
        this.tecnico = tecnico;
    }

    public long getCliente() {
        return this.cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

}