package herencia.modelo;

public class Profesor extends Persona {
	private String asignatura;
	private int carnetProfesor;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getCarnetProfesor() {
		return carnetProfesor;
	}

	public void setCarnetProfesor(int carnetProfesor) {
		this.carnetProfesor = carnetProfesor;
	}

}
