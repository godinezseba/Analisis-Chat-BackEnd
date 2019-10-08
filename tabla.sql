create database chat;

connect chat;

create table public.mensaje(
    id_mensaje serial not null,
    mensaje text,
    user_send int,
    primary key (id_mensaje)
);