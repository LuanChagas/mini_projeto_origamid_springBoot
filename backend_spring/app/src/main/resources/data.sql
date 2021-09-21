
create table IF NOT EXISTS tb_fotos(
       id int not null,
       titulo varchar(50),
       src varchar,
       primary key(id)
       
);

create table IF NOT EXISTS  tb_produtos(
       id int not null ,
       nome varchar(50),
       preco decimal(5,2),
       descricao varchar(255),
       vendido boolean,
       id_fotos int,
       Primary Key(id),
       Foreign key (id_fotos) references tb_fotos(id)
);


