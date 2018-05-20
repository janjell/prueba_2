CREATE DATABASE bd_inmobiliaria;
--drop database bd_inmobiliaria;
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
    fecha DATETIME,
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

-- SELECT * FROM vista_vivienda
CREATE VIEW vista_viviendas AS
SELECT
    viv.nrol AS 'Número de Rol',
    viv.direccion AS 'Dirección',
    viv.cantPieza AS 'Cantidad de Piezas',
    viv.cantBanos AS 'Cantidad de Baños',
    tip.tipo AS 'Tipo de vivienda',
    viv.precio AS 'Precio',
    viv.nuevo AS 'Nuevo'
FROM
    vivienda viv
INNER JOIN
    tipoVivienda tip ON viv.tipoVivienda = tip.id;

--- SELECT * FROM vista_ventas
CREATE VIEW vista_ventas AS
SELECT
    ven.id AS 'ID',
    viv.nrol AS 'Número de Rol',
    usu.run AS 'Run de Usuario',
    usu.nombre AS 'Nombre de Usuario',
    cli.run AS 'Run de Cliente',
    cli.nombre AS 'Nombre de Cliente'
FROM
    venta ven
INNER JOIN
    vivienda viv ON ven.rol_fk = viv.id
    usuario usu ON ven.usuario_fk = usu.id
    cliente cli ON ven.cliente_fk = cli.id;