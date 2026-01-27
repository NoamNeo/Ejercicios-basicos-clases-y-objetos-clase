package Semana3;

public class Jugadores {
  private String nombre;
  private int vida;
  private static final String[] nombres = { "Juan", "Martín", "Pedro", "Irene", "Isabela", "Ana", "María", "Gabi",
      "Carlos", "Eleonor" };
  private static final String[] apellidos = { "Perez", "Fernandez", "Jimenez", "Sánchez", "García", "Lorenzo", "Vilas",
      "Vilaverde", "Hernández", "Molanes" };

  public String getNombre() {
    return nombre;
  }

  public int getVida() {
    return vida;
  }

  public Jugadores(String nombre, int vida) {
    this.nombre = nombre;
    this.vida = vida;
  }

  public static String nameGen(int nombre, int apellido) {
    return nombres[nombre] + " " + apellidos[apellido];
  }

  public void mostrarJugador() {
    System.out.printf("Jugador: %s\nVida: %,d\n", getNombre(), getVida());
  }
}
