CREATE DATABASE bd_inmobiliaria;
--drop database bd_inmobiliaria;
USE bd_inmobiliaria;

CREATE TABLE tipoVivienda(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(100)
);

insert into tipoVivienda values(null,'Casa');
insert into tipoVivienda values(null,'Departamento');

CREATE TABLE vivienda(
    nrol INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    direccion VARCHAR(200),
    cantPiezas INT,
    cantBanos INT,
    tipoVivienda INT,
    precio INT,
    nuevo BOOLEAN,
    FOREIGN KEY(tipoVivienda) references tipoVivienda(id)
);

select * from vivienda;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run VARCHAR(20) UNIQUE,
    nombre VARCHAR(200),
    administrador boolean
);

select * from usuario;

CREATE TABLE cliente(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run VARCHAR(20) UNIQUE,
    nombre VARCHAR(200),
    sueldo int
);

select * from cliente;

CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    rol_fk INT REFERENCES vivienda(nrol),
    usuario_fk INT REFERENCES usuario(id),
    cliente_fk INT REFERENCES cliente(id)
);

insert into venta values(null,1,1,1);
insert into venta values(null,2,1,1);

select * from venta;

select venta.rol_fk as 'Numero de Rol' ,venta.usuario_fk as 'Usuario' ,venta.cliente_fk as 'Cliente'
from venta ,usuario ,vivienda, cliente
where venta.rol_fk = vivienda.nrol and venta.usuario_fk = usuario.id
and venta.cliente_fk = cliente.id


-- 1 = admin - 0 = vendedor
INSERT INTO usuario VALUES(NULL, '11-1', 'admin',1);