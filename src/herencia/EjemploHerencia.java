package herencia;

import herencia.modelo.Alumno;
import herencia.modelo.AlumnoInternacional;
import herencia.modelo.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {

		// ********* ALUMNO *********
		Alumno alumno = new Alumno();
		alumno.setNombre("Daniel Enrique");
		alumno.setApellido("Calderon Vera");
		alumno.setCarreraCursar("Ingenieria Informatica");
		alumno.setNotasCalculo(5.5);

		// ********* ALUMNOINT *********
		AlumnoInternacional alumnoInt = new AlumnoInternacional();
		alumnoInt.setNombre("Sofia");
		alumnoInt.setApellido("Berubi");
		alumnoInt.setSexo("Mujer");
		alumnoInt.setPais("Alemania");
		alumnoInt.setCarreraCursar("Ingeniria en computación");
		alumnoInt.setNotaIdiomas(6.6);
		alumnoInt.setNotasCalculo(3.3);

		// ********* PROFE ********
		Profesor profe = new Profesor();
		profe.setNombre("Juan");
		profe.setApellido("Medinas");
		profe.setAsignatura("Programacion web");

		// ********* ALUMNO PRIM *********
		System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
		System.out.println("Carrera: " + alumno.getCarreraCursar());
		System.out.println("nota de Calculo: " + alumno.getNotasCalculo());

		// ********* ALUMNOINT PRIM *********
		System.out.println("\nAlumno: " + alumnoInt.getNombre() + " " + alumnoInt.getApellido());
		System.out.println("pais: " + alumnoInt.getPais());
		System.out.println("Carrera: " + alumnoInt.getCarreraCursar());
		System.out.println("nota de Calculo: " + alumnoInt.getNotasCalculo());

		// ********* PROFE PRIM *********
		System.out.println("\nProfesor: " + profe.getNombre() + " " + profe.getApellido());
		System.out.println("Asignatura: " + profe.getAsignatura());

		Class clase = alumnoInt.getClass();
		while (clase.getSuperclass() != null) {
			String hija = clase.getName();
			String padre = clase.getSuperclass().getName();
			System.out.println(hija + " es una clase hija de la clase padre " + padre);
			clase = clase.getSuperclass();

		}

	}

}
