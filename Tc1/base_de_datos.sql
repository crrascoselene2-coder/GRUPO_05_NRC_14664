-- ============================================================
-- 1. LIMPIEZA Y CREACIÓN DE LA BASE DE DATOS
-- ============================================================
DROP SCHEMA IF EXISTS bd_truesports;
CREATE SCHEMA bd_truesports;
USE bd_truesports;

-- ============================================================
-- 2. TABLAS CATÁLOGO (No dependen de ninguna otra tabla)
-- ============================================================
CREATE TABLE sedes (
    id_sede INT AUTO_INCREMENT PRIMARY KEY,
    nombre_sede VARCHAR(45) NOT NULL,
    direccion VARCHAR(100) NOT NULL
);

CREATE TABLE disciplinas (
    id_disciplina INT AUTO_INCREMENT PRIMARY KEY,
    nombre_disciplina VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE planes (
    id_plan INT AUTO_INCREMENT PRIMARY KEY,
    nombre_plan VARCHAR(100) NOT NULL,
    precio_total DECIMAL(6,2) NOT NULL
);

-- ============================================================
-- 3. ENTIDADES PRINCIPALES
-- ============================================================
CREATE TABLE alumnos (
    codigo_alumno INT AUTO_INCREMENT PRIMARY KEY,
    dni VARCHAR(8) NOT NULL UNIQUE,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    celular VARCHAR(15) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    estado VARCHAR(20) NOT NULL
);

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    rol VARCHAR(45) NOT NULL,
    id_sede INT NOT NULL,
    username VARCHAR(50) NOT NULL, -- Incluido directamente aquí
    password VARCHAR(50) NOT NULL, -- Incluido directamente aquí
    FOREIGN KEY (id_sede) REFERENCES sedes(id_sede)
);

-- ============================================================
-- 4. ENTIDADES SECUNDARIAS (Dependen de las principales)
-- ============================================================
CREATE TABLE apoderados (
    id_apoderado INT AUTO_INCREMENT PRIMARY KEY,
    dni_apoderado VARCHAR(8) NOT NULL UNIQUE,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    celular VARCHAR(15) NOT NULL,
    parentesco VARCHAR(50) NOT NULL,
    codigo_alumno INT NOT NULL,
    FOREIGN KEY (codigo_alumno) REFERENCES alumnos(codigo_alumno)
);

CREATE TABLE profesores (
    id_profesor INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    celular VARCHAR(15) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    id_disciplina INT NOT NULL,
    id_sede INT NOT NULL, -- ¡Agregado con éxito según tu análisis!
    FOREIGN KEY (id_disciplina) REFERENCES disciplinas(id_disciplina),
    FOREIGN KEY (id_sede) REFERENCES sedes(id_sede)
);

-- ============================================================
-- 5. TABLAS TRANSACCIONALES (El corazón del negocio)
-- ============================================================
CREATE TABLE ventas (
    codigo_venta INT AUTO_INCREMENT PRIMARY KEY,
    fecha_venta DATE NOT NULL,
    metodo_pago VARCHAR(20) NOT NULL,
    monto_efectivo DECIMAL(6,2) NOT NULL,
    monto_digital DECIMAL(6,2) NOT NULL,
    total_pagado DECIMAL(6,2) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    codigo_alumno INT NOT NULL,
    id_plan INT NOT NULL,
    id_usuario INT NOT NULL,
    id_sede INT NOT NULL,
    FOREIGN KEY (codigo_alumno) REFERENCES alumnos(codigo_alumno),
    FOREIGN KEY (id_plan) REFERENCES planes(id_plan),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_sede) REFERENCES sedes(id_sede)
);

CREATE TABLE clases_dictadas (
    id_clase INT AUTO_INCREMENT PRIMARY KEY,
    fecha_clase DATE NOT NULL,
    turno VARCHAR(20) NOT NULL,
    cantidad_alumnos INT NOT NULL,
    calificacion VARCHAR(20) NOT NULL,
    id_profesor INT NOT NULL,
    id_disciplina INT NOT NULL,
    id_sede INT NOT NULL,
    FOREIGN KEY (id_profesor) REFERENCES profesores(id_profesor),
    FOREIGN KEY (id_disciplina) REFERENCES disciplinas(id_disciplina),
    FOREIGN KEY (id_sede) REFERENCES sedes(id_sede)
);


-- ============================================================
-- 6. INYECCIÓN DE DATOS REALES (SEED DATA)
-- ============================================================

-- A. SEDES (Genera ID 1 y 2 automáticamente)
INSERT INTO sedes (nombre_sede, direccion) VALUES  
('Sede Bellavista', 'Av. Oscar R Benavides 3866'),
('Sede Pilares', 'Av. Oscar R Benavides Cdra. 30');

-- B. DISCIPLINAS (ID 1 al 5 automáticamente)
INSERT INTO disciplinas (nombre_disciplina) VALUES  
('Boxeo'),          -- ID 1
('Muay Thai'),      -- ID 2
('MMA'),            -- ID 3
('Lucha Olímpica'), -- ID 4
('Luta Livre');     -- ID 5

-- C. PLANES (ID 1 al 5 automáticamente)
INSERT INTO planes (nombre_plan, precio_total) VALUES  
('Plan - 1 Mes', 209.90),
('Plan - 2 Meses', 259.90),
('Plan - 3 Meses', 329.90),
('Plan - 6 Meses', 499.90),
('Plan - 12 Meses', 839.90);

-- D. USUARIOS 
-- (Sede 1 = Bellavista, Sede 2 = Pilares)
INSERT INTO usuarios (nombres, rol, id_sede, username, password) VALUES  
('Andrea', 'Jefa', 1, 'admin', '123456'),
('Axel', 'Asesor', 1, 'axel', '01012026'),
('Fabio', 'Asesor', 2, 'fabio', '02022026'),
('Jimena', 'Asesor', 1, 'jimena', '03032026'),
('Kiara', 'Asesor', 2, 'kiara', '04042026');

-- E. PROFESORES 
-- (Los últimos dos números corresponden a: id_disciplina, id_sede)
INSERT INTO profesores (nombres, apellidos, celular, estado, id_disciplina, id_sede) VALUES  
('Danny', 'Rosales', '987654321', 'Activo', 1, 1),   -- Boxeo en Bellavista
('Jordan', 'Pacheco', '912345678', 'Activo', 2, 2), -- Muay Thai en Pilares 
('William', 'Gómez', '999888777', 'Activo', 3, 1);  -- MMA en Bellavista