CREATE DATABASE bd_inmobiliaria; /** drop database bd_inmobiliaria; **/
USE bd_inmobiliaria;

CREATE TABLE log(
    id INT AUTO_INCREMENT PRIMARY KEY,
    registro VARCHAR(200),
    fecha DATE,
    run VARCHAR(20),
    nombre VARCHAR(200)
); -- SELECT * FROM log;

CREATE TABLE tipoVivienda(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(100)
);

insert into tipoVivienda values(null,'Casa');
insert into tipoVivienda values(null,'Departamento');


CREATE TABLE estado(
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
); -- SELECT * FROM estado;

INSERT INTO estado VALUES(NULL,'Arrendada');
INSERT INTO estado VALUES(NULL,'Vendida');
INSERT INTO estado VALUES(NULL,'En Venta');
INSERT INTO estado VALUES(NULL,'En Arriendo');
INSERT INTO estado VALUES(NULL,'Reservada');

-- select estado.descripcion from estado;

select * from vivienda where vivienda.estado between 2 and 3 order by vivienda.precio desc;

select * from estado;

UPDATE vivienda SET estado = 4 WHERE nrol = 1



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

select * from vivienda where vivienda.estado between 1 and 2;

select * from vivienda where vivienda.nuevo = true;

insert into vivienda values(null,'psj3',1,2,3,1,500,true);
insert into vivienda values(null,'psj3',2,2,3,1,500,true);
insert into vivienda values(null,'psj3',3,2,3,1,500,true);
insert into vivienda values(null,'psj3',3,2,3,1,500,true);
insert into vivienda values(null,'psj3',3,2,3,1,700,true);
insert into vivienda values(null,'psj3',2,2,3,1,800,true);
insert into vivienda values(null,'psj3',3,2,3,1,900,true);
insert into vivienda values(null,'psj3',3,2,3,1,1000,true);
insert into vivienda values(null,'psj3',4,2,3,1,1000,true);
insert into vivienda values(null,'psj3',4,2,3,1,1000,false);
insert into vivienda values(null,'psj3',4,2,3,1,1000,false);

select * from vivienda order by vivienda.precio desc;
select * from vivienda order by vivienda.precio asc;
select * from vivienda where vivienda.nuevo = false;

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
); -- select * from cliente

insert into cliente values(null,'33-3','Pabli',40000);
insert into cliente values(null,'10-1','Berny',40000);

CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    rol_fk INT REFERENCES vivienda(nrol),
    usuario_fk INT REFERENCES usuario(id),
    cliente_fk INT REFERENCES cliente(id)
); -- select * from venta;

insert into venta values(null,NOW(),1,1,1);



-- select venta.rol_fk as 'Numero de Rol' ,venta.usuario_fk as 'Usuario' ,venta.cliente_fk as 'Cliente'
-- from venta ,usuario ,vivienda, cliente
-- where venta.rol_fk = vivienda.nrol and venta.usuario_fk = usuario.id
-- and venta.cliente_fk = cliente.id;


-- 1 = admin - 0 = vendedor
INSERT INTO usuario VALUES(NULL, '11-1', 'admin',1);
INSERT INTO usuario VALUES(NULL, '22-2', 'vendedor',0);
INSERT INTO usuario VALUES(NULL, '66-6', 'Tami',0);

-- Nombre del vendedor
select usuario.nombre from usuario where usuario.run = '66-6';


-- Lista de viviendas Arrendadas o Vendidas
select * from vivienda where vivienda.estado between 3 and 4; 

select * from usuario;

-- Creacion de trigger para tabla log

DELIMITER $$
CREATE TRIGGER log
after insert on cliente
for each row
BEGIN
    insert into log values (null,'Se ha creado un cliente',NOW(),'77-7','Pablo');
end $$
DELIMITER ;


-- Vista para mostrar top ventas

CREATE VIEW top_ventas AS -- DROP VIEW top_ventas;
SELECT
    ven.fecha,
    usu.nombre
FROM venta ven
JOIN usuario usu ON ven.usuario_fk = usu.id;

SELECT * FROM top_ventas;



"select venta.id, venta.fecha, tipoVivienda.tipo, usuario.run, cliente.nombre "
                + "from venta, usuario, cliente, tipoVivienda, vivienda "
                + "where venta.usuario_fk = usuario.id and venta.cliente_fk = cliente.id and "
                + "vivienda.tipoVivienda = tipoVivienda.id and venta.rol_fk = vivienda.nrol "
                + and vivienda.tipoVivienda = 2;

select * from vivienda where vivienda.tipovivienda = 2;