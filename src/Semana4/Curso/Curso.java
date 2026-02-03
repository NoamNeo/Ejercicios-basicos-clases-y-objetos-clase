package Semana4.Curso;

import java.util.Random;

public class Curso {
  private String nombre;
  private Alumno[] listado;
  private static final int NUMERO_ALUMNOS = 10;
  private static final String[] NOMBRES = { "Ana", "Carlos", "Gabi", "Ismael", "Juan", "Andrés", "Damián", "Pedro" };

  public Curso(String nombre) {
    this.nombre = nombre;
    listado = new Alumno[NUMERO_ALUMNOS];
    for (int i = 0; i < NUMERO_ALUMNOS; i++) {
      listado[i] = new Alumno(NOMBRES[new Random().nextInt(0, NOMBRES.length)]);
    }
  }

  public void mostrarCurso() {
    System.out.println("Curso: " + this.nombre);
    for (Alumno alumno : listado) {
      alumno.mostrarAlumno();
    }
  }
}
