insert into roles(id_rol, nombre) values(1, 'Docente');
insert into roles(id_rol, nombre) values(2, 'Estudiante');

-----------

insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('joanp@gmail.com',	'Joan',	'Perez Rodriguez',	45,	'dfsa3.da',	1);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('pepea@gmail.com',	'Pepe Guajiro',	'Arnol Gimenez',	32,	'dsaf.ddf.',	1);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('pedrom@gmail.com',	'Pedro Elegildo',	'Mendez Martinez',	33,	'df333d13.',	1);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('mariann@gmail.com',	'María Camila',	'Aguado Rodriguez',	42,	'eekdy2.#',	1);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('laurab@gmail.com',	'Laura Viviana',	'Hernández',	51,	',d3sdfK/',	1);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('camilag@gmail.com',	'Camila Juliana',	'Gomez Mendez',	20,	'Ojdfd#.',	2);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('juano@gmail.com',	'Juan Camilo',	'Ospina',	23,	'sadf.dfj-',	2);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('angelv@gmail.com',	'Angel Miguel',	'Villaveces',	18,	'=83ddf.ll',	2);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('emiliab@gmail.com',	'Emilia',	'Buitrago',	25,	'dd234as.#',	2);
insert into usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) values('emmak@gmail.com',	'Emma Juliana',	'Kimberly',	19,	'dddfi23=?/',	2);

-----------

insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(1,	'Aritmética',	'Aprende a realizar estas operaciones aritméticas básicas',	2020,	'joanp@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(2,	'Trigonometría',	'Descubre las aplicaciones prácticas de la Trigonometría y empieza a entenderla en profundidad',	2020,	'pepea@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(3,	'Geometría',	'Aprende conceptos de geometría para todas las edades',	2020,	'pedrom@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(4,	'Literatura latinoamericana',	'Aprende acerca de la evolución de la literatura en latinoamerica',	2020,	'mariann@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(5,	'Física Cuántica',	'Aprende sobre el movimiento de las cosas en el mundo subatómico',	2020,	'laurab@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(6,	'Aritmética',	'Aprende a realizar estas operaciones aritméticas básicas',	2021,	'joanp@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(7,	'Trigonometría',	'Descubre las aplicaciones prácticas de la Trigonometría y empieza a entenderla en profundidad',	2021,	'pepea@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(8,	'Geometría',	'Aprende conceptos de geometría para todas las edades',	2021,	'pedrom@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(9,	'Literatura Europea',	'Aprende acerca de la evolución de la literatura en europa',	2022,	'mariann@gmail.com');
insert into tutorias (id_tutoria, titulo, descripcion, año, id_docente_encargado) values(10,	'Física Mecánica',	'Aprende sobre física mecánica',	2022,	'laurab@gmail.com');

-----------

insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (1,	'camilag@gmail.com',	3);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (2,	'camilag@gmail.com',	10);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (3,	'camilag@gmail.com',	7);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (4,	'juano@gmail.com',	2);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (5,	'juano@gmail.com',	3);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (6,	'angelv@gmail.com',	1);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (7,	'angelv@gmail.com',	3);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (8,	'angelv@gmail.com',	8);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (9,	'emiliab@gmail.com',	9);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (10,	'emiliab@gmail.com',	10);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (11,	'emiliab@gmail.com',	1);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (12,	'emmak@gmail.com',	1);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (13,	'emmak@gmail.com',	5);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (14,	'emmak@gmail.com',	4);
insert into matriculas (id_matriculas, id_estudiante, id_tutoria) values (15,	'emmak@gmail.com',	6);
