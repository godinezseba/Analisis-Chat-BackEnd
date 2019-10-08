create database chat; 

-- dentro de la BD chat ejecutar las tablas
create table chat.mensaje(
    id_mensaje int not null AUTO_INCREMENT,
    mensaje text,
    user_send int not null,
    primary key (id_mensaje)
);