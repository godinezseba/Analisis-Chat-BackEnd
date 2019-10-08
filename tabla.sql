create database chat; -- ejecutar solo

-- dentro de la BD chat ejecutar las tablas
create table public.mensaje(
    id_mensaje serial not null,
    mensaje text,
    user_send int,
    primary key (id_mensaje)
);