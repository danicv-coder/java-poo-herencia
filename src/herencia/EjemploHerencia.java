package herencia;

import herencia.modelo.Alumno;
import herencia.modelo.AlumnoInternacional;
import herencia.modelo.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {
		System.out.println("\n============= inicializando la clase alumno =============");

		// ********* ALUMNO *********
		Alumno alumno = new Alumno("Daniel", "Calderon", "Universidad privada Rafael Belloso Chacin",
				"Ingenieria en informatica");
		alumno.setEdad(23);
		alumno.setNotasCalculo(5.5);

		System.out.println("============= inicializando la clase alumnoInternacional =============");

		// ********* ALUMNOINT *********
		AlumnoInternacional alumnoInt = new AlumnoInternacional("Sofia", "Berubi",
				"Universidad privada rafael belloso chacin", "Ingenieria en computación", "Argentina");
		alumnoInt.setEdad(21);
		alumnoInt.setNotaIdiomas(6.6);
		alumnoInt.setNotasCalculo(3.3);

		System.out.println("============= inicializando la clase profesor =============");

		// ********* PROFE ********
		Profesor profe = new Profesor("Juan", "Medina", "Programacion web");

		// ********* ALUMNO PRIM *********
		System.out.println("\nAlumno: " + alumno.getNombre() + " " + alumno.getApellido());
		System.out.println("Edad: " + alumno.getEdad());
		System.out.println("Institución: " + alumno.getInstitución());
		System.out.println("Carrera: " + alumno.getCarreraCursar());
		System.out.println("nota de Calculo: " + alumno.getNotasCalculo());

		// ********* ALUMNOINT PRIM *********
		System.out.println("\nAlumno: " + alumnoInt.getNombre() + " " + alumnoInt.getApellido());
		System.out.println("Edad: " + alumno.getEdad());
		System.out.println("pais: " + alumnoInt.getPais());
		System.out.println("Institución: " + alumno.getInstitución());
		System.out.println("Carrera: " + alumnoInt.getCarreraCursar());
		System.out.println("nota de Calculo: " + alumnoInt.getNotasCalculo());

		// ********* PROFE PRIM *********
		System.out.println("\nProfesor: " + profe.getNombre() + " " + profe.getApellido());
		System.out.println("Asignatura: " + profe.getAsignatura());

		Class clase = alumnoInt.getClass();
		while (clase.getSuperclass() != null) {
			String hija = clase.getName();
			String padre = clase.getSuperclass().getName();
			System.out.println("\n" + hija + " es una clase hija de la clase padre " + padre);
			clase = clase.getSuperclass();

		}

	}

}
