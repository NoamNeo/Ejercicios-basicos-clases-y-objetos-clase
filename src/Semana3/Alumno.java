package Semana3;

public class Alumno {
  private String nombre;
  private int nota;
  private static final String[] nombres = { "Juan", "Martín", "Pedro", "Irene", "Isabela", "Ana", "María", "Gabi",
      "Carlos", "Eleonor" };
  private static final String[] apellidos = { "Perez", "Fernandez", "Jimenez", "Sánchez", "García", "Lorenzo", "Vilas",
      "Vilaverde", "Hernández", "Molanes" };

  public String getNombre() {
    return nombre;
  }

  public int getNota() {
    return nota;
  }

  public static String nameGen(int nombre, int apellido) {
    return nombres[nombre] + " " + apellidos[apellido];
  }

  public Alumno(String nombre, int nota) {
    this.nombre = nombre;
    this.nota = nota;
  }

  public void mostrarAlumno() {
    System.out.printf("Alumno: %s\nNota: %,d\n", getNombre(), getNota());
  }
}
