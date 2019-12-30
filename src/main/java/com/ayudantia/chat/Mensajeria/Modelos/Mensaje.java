package com.ayudantia.chat.Mensajeria.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Mensaje")
public class Mensaje{

    @Id
    @GenericGenerator(name="incrementmensaje", strategy="increment")
    @GeneratedValue(generator="incrementmensaje")
    @Column(name="id_mensaje")
    private long id;

    @Column(name="mensaje")
    @Type(type="text")
    private String mensaje;

    @Column(name="id_consulta")
    private long consulta;

    @Column(name="id_emisor")
    private long emisor;

    public Mensaje(){

    }

    public Mensaje(long id, String mensaje, long consulta, long emisor) {
        this.id = id;
        this.mensaje = mensaje;
        this.consulta = consulta;
        this.emisor = emisor;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public long getConsulta() {
        return this.consulta;
    }

    public void setConsulta(long consulta) {
        this.consulta = consulta;
    }

    public long getEmisor() {
        return this.emisor;
    }

    public void setEmisor(long emisor) {
        this.emisor = emisor;
    }

}