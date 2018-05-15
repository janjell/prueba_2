CREATE DATABASE bd_inmobiliaria;
--drop database bd_inmobiliaria;
USE bd_inmobiliaria;

CREATE TABLE tipoVivienda(
    id INT AUTO_INCREMENT PRIMARY KEY,
    casa BOOLEAN
);

CREATE TABLE vivienda(
    NdeRol INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    direccion VARCHAR(200),
    cantPiezas INT,
    cantBanos INT,
    tipoVivienda INT,
    precio INT,
    nuevo BOOLEAN,
    FOREIGN KEY(tipoVivienda) references tipoVivienda(id)
);

CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run VARCHAR(20) UNIQUE,
    nombre VARCHAR(200),
    administrador boolean
);

CREATE TABLE cliente(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run VARCHAR(20) UNIQUE,
    nombre VARCHAR(200),
    sueldo int
);

CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    rol_fk INT REFERENCES vivienda(rol),
    usuario_fk INT REFERENCES usuario(id),
    cliente_fk INT REFERENCES cliente(id)
);

-- 1 = admin - 0 = vendedor
INSERT INTO usuario VALUES(NULL, '11-1', 'admin',1);