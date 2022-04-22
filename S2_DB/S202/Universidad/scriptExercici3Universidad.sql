SELECT COUNT(*) FROM persona WHERE tipo="alumno";
SELECT COUNT(*) FROM persona WHERE tipo="alumno" AND fecha_nacimiento LIKE "1999%";
SELECT departamento.nombre AS "nombre del departamento", COUNT(profesor.id_profesor) AS "número de profesores" FROM departamento INNER JOIN profesor ON profesor.id_departamento=departamento.id GROUP BY departamento.id ORDER BY 2 DESC;
SELECT departamento.nombre AS "nombre del departamento", COUNT(profesor.id_profesor) AS "número de profesores" FROM departamento LEFT JOIN profesor ON profesor.id_departamento=departamento.id GROUP BY departamento.id ORDER BY 2 DESC;
SELECT grado.nombre AS grado_nombre, COUNT(asignatura.id) AS número_asignaturas FROM grado LEFT JOIN asignatura ON grado.id=asignatura.id_grado GROUP BY grado.id ORDER BY 2 DESC;
SELECT grado.nombre AS grado_nombre, COUNT(asignatura.id) AS número_asignaturas FROM grado LEFT JOIN asignatura ON grado.id=asignatura.id_grado GROUP BY grado.id HAVING COUNT(asignatura.id) > 40;
SELECT grado.nombre AS grado_nombre,  asignatura.tipo AS tipo_asignatura, COUNT(asignatura.creditos) AS número_créditos_tipo FROM grado LEFT JOIN asignatura ON grado.id=asignatura.id_grado GROUP BY grado.nombre, asignatura.tipo HAVING SUM(asignatura.creditos);
SELECT DISTINCT curso_escolar.anyo_inicio AS año_inicio, COUNT(alumno_se_matricula_asignatura.id_alumno) AS alumnos_matriculados FROM curso_escolar LEFT JOIN alumno_se_matricula_asignatura ON curso_escolar.id=alumno_se_matricula_asignatura.id_curso_escolar GROUP BY curso_escolar.anyo_inicio, alumno_se_matricula_asignatura.id_alumno;
SELECT DISTINCT persona.id, persona.nombre, persona.apellido1, persona.apellido2, COUNT(asignatura.id) AS número_asignaturas FROM persona LEFT JOIN asignatura ON persona.id=asignatura.id_profesor WHERE persona.tipo="profesor" GROUP BY persona.id, persona.nombre, persona.apellido1, persona.apellido2 ORDER BY 5 DESC;
SELECT * FROM persona WHERE persona.tipo="alumno" ORDER BY persona.fecha_nacimiento DESC LIMIT 1;
SELECT profesor.id_profesor, profesor.id_departamento, asignatura.nombre AS nombre_asignatura FROM profesor LEFT JOIN asignatura ON profesor.id_profesor=asignatura.id_profesor WHERE asignatura.id_profesor IS NULL ORDER BY profesor.id_profesor;
