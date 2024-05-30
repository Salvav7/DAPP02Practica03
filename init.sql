-- Cambiar a la base de datos postgres, ya que postgresuv se crea automáticamente.
\c practica

-- Crear la tabla empleado si no existe
CREATE TABLE IF NOT EXISTS empleados (
    clave INTEGER PRIMARY KEY,
    nombre character varying,
    direccion character varying,
    telefono character varying
);

CREATE TABLE IF NOT EXISTS public.usuarios (
    id_usuarios SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL
);

INSERT INTO usuarios (username, password, enabled) 
VALUES ('salvav', '$2a$12$V6CSJeenZH63TSw4SYkWg.OXGFy8fKwrHGvjNo1DxOaQOGJOojVni', true);
