package com.ayudantia.chat.Mensajeria.Entidades;

public class MensajeRequest{
    long consulta;

    String mensaje;

    public MensajeRequest(){

    }

    public MensajeRequest(long consulta, String mensaje) {
        this.consulta = consulta;
        this.mensaje = mensaje;
    }

    public long getConsulta() {
        return this.consulta;
    }

    public void setConsulta(long consulta) {
        this.consulta = consulta;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}