create database chat; -- ejecutar solo

-- dentro de la BD chat ejecutar las tablas
create table public.usuario(
    id_usuario int not null,
    user_name varchar(100) not null,
    password varchar(100) not null,
    roles varchar(100) default 'ROLE_USER',
    active boolean default TRUE,
    primary key (id_usuario)
);

create table public.consulta(
    id_consulta int not null,
    id_tecnico int not null,
    id_cliente int not null,
    primary key (id_consulta),
    foreign key (id_tecnico) references usuario(id_usuario),
    foreign key (id_cliente) references usuario(id_usuario)
);

create table public.mensaje(
    id_mensaje int not null,
    id_consulta int not null,
    id_emisor int not null,
    mensaje text,
    primary key (id_mensaje),
    foreign key (id_emisor) references usuario(id_usuario),
    foreign key (id_consulta) references consulta(id_consulta)
);