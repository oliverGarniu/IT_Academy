SELECT apellido1, apellido2, nombre FROM persona WHERE tipo="alumno" ORDER BY apellido1, apellido2, nombre; 
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo="alumno" AND telefono IS NULL; 
SELECT * FROM persona WHERE tipo="alumno" AND fecha_nacimiento LIKE "1999%"; 
SELECT * FROM persona WHERE tipo="profesor" AND telefono IS NULL AND nif LIKE "%K"; 
SELECT * FROM asignatura WHERE cuatrimestre=1 AND curso=3 AND id_grado=7;
SELECT persona.apellido1, persona.apellido2, persona.nombre, departamento.nombre FROM persona INNER JOIN departamento ON persona.id=departamento.id ORDER BY persona.apellido1, persona.apellido2, persona.nombre;
SELECT a.nombre, ce.anyo_inicio, ce.anyo_fin, p.nif FROM asignatura a JOIN alumno_se_matricula_asignatura ama ON a.id=ama.id_asignatura JOIN curso_escolar ce ON ce.id=ama.id_curso_escolar JOIN persona p ON p.id=ama.id_alumno WHERE p.nif="26902806M";
SELECT departamento.nombre AS nombre_departamento, grado.nombre AS nombre_grado, profesor.id_profesor, asignatura.nombre AS nombre_asignatura FROM departamento, asignatura, grado, profesor WHERE (grado.id=asignatura.id_grado AND departamento.id=profesor.id_departamento) AND grado.nombre="Grado en Ingeniería Informática (Plan 2015)";
SELECT DISTINCT ama.id_alumno, a.nombre AS "nombre asignatura", ce.anyo_inicio, ce.anyo_fin FROM alumno_se_matricula_asignatura ama JOIN asignatura a ON ama.id_alumno=a.id JOIN curso_escolar ce ON ama.id_curso_escolar=ce.id AND (ce.anyo_inicio="2018" AND ce.anyo_fin="2019"); 

