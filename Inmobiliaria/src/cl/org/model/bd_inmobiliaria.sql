CREATE DATABASE bd_inmobiliaria; /** drop database bd_inmobiliaria; **/
USE bd_inmobiliaria;

CREATE TABLE tipoVivienda(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(100)
);

insert into tipoVivienda values(null,'Casa');
insert into tipoVivienda values(null,'Departamento');

CREATE TABLE estado(
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

INSERT INTO estado VALUES(NULL,'En Arriendo');
INSERT INTO estado VALUES(NULL,'Arrendada');
INSERT INTO estado VALUES(NULL,'Vendida');
INSERT INTO estado VALUES(NULL,'En Venta');
INSERT INTO estado VALUES(NULL,'Reservada');

select estado.descripcion from estado

select * from estado;

CREATE TABLE vivienda(
    nrol INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    direccion VARCHAR(200),
    estado INT,
    cantPiezas INT,
    cantBanos INT,
    tipoVivienda INT,
    precio INT,
    nuevo BOOLEAN,
    FOREIGN KEY(tipoVivienda) references tipoVivienda(id),
    FOREIGN KEY(estado) REFERENCES estado(id)
); -- select * from vivienda;

insert into vivienda values(null,'psj3',1,2,3,1,500,true);


CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run VARCHAR(20) UNIQUE,
    nombre VARCHAR(200),
    administrador boolean
); -- select * from usuario;



CREATE TABLE cliente(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run VARCHAR(20) UNIQUE,
    nombre VARCHAR(200),
    sueldo int
); --select * from cliente;



CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATETIME,
    rol_fk INT REFERENCES vivienda(nrol),
    usuario_fk INT REFERENCES usuario(id),
    cliente_fk INT REFERENCES cliente(id)
); -- select * from venta;


CREATE TABLE log(
    id INT AUTO_INCREMENT PRIMARY KEY,
    registro VARCHAR(200),
    fecha DATETIME,
    run VARCHAR(20),
    nombre VARCHAR(200)
); -- SELECT * FROM log;


-- select venta.rol_fk as 'Numero de Rol' ,venta.usuario_fk as 'Usuario' ,venta.cliente_fk as 'Cliente'
-- from venta ,usuario ,vivienda, cliente
-- where venta.rol_fk = vivienda.nrol and venta.usuario_fk = usuario.id
-- and venta.cliente_fk = cliente.id;


-- 1 = admin - 0 = vendedor
INSERT INTO usuario VALUES(NULL, '11-1', 'admin',1);
INSERT INTO usuario VALUES(NULL, '22-2', 'vendedor',0);

select * from usuario