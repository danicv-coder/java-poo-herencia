package herencia;

import herencia.modelo.Alumno;
import herencia.modelo.AlumnoInternacional;
import herencia.modelo.Persona;
import herencia.modelo.Profesor;

public class EjemploHerenciaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		System.out.println(alumno.saludar());
		System.out.println(alumnoInt.saludar());
		System.out.println(profe.saludar());
		
		imprimir(alumno);
		imprimir(alumnoInt);
		imprimir(profe);

	}

	public static void imprimir(Persona persona) {
		System.out.println("\nImprimiendo datos del tipo persona:");
		System.out.print("nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad: "
				+ persona.getEdad());

		if (persona instanceof Alumno) {
			System.out.println("\nImprimiendo datos del tipo alumno:");
			System.out.println("Institución: " + ((Alumno) persona).getInstitución());
			System.out.println("Institución: " + ((Alumno) persona).getNotasCalculo());

			if (persona instanceof AlumnoInternacional) {
				System.out.println("Imprimiendo datos del tipo alumnoInternacional:");
				System.out.println("Notas idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
				System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
			}

		}
		if (persona instanceof Profesor) {
			System.out.println("Imprimiendo datos del tipo profesor:");
			System.out.println("Asignaturas: " + ((Profesor) persona).getAsignatura());

		}
	}

}
