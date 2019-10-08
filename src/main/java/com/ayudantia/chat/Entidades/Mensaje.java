package com.ayudantia.chat.Entidades;

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

    @Column(name="user_send")
    private long user;

    public Mensaje(){

    }

    public Mensaje(long id, String mensaje, long user) {
        this.id = id;
        this.mensaje = mensaje;
        this.user = user;
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

    public long getUser() {
        return this.user;
    }

    public void setUser(long user) {
        this.user = user;
    }

}