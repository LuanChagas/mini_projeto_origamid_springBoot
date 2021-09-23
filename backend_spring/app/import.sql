
create table IF NOT EXISTS  tb_produtos(
       id varchar(255),
       nome varchar(255),
       preco decimal(10,2),
       descricao varchar(255),
       vendido boolean,
       Primary Key(id)
);

create table IF NOT EXISTS tb_fotos(
       id int auto_increment not null,
       titulo varchar(255),
       src varchar(525),
       produto_id varchar(255),
       primary key(id),
       Foreign key (produto_id) references tb_produtos(id)
);

insert into tb_produtos(id,nome,preco,descricao,vendido)values('notebook-3','Notebook',2300.00,'Gostaria de enfatizar que o início da atividade geral de formação de atitudes pode nos levar a considerar.',false);

insert into tb_fotos(titulo,src,produto_id) values ('teste','testanto','notebook-3');
insert into tb_fotos(titulo,src,produto_id) values ('teste 2','testanto 2','notebook-3'); 

