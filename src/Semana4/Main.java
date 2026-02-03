package Semana4;

import Semana4.Curso.Curso;
import Semana4.Videojuego.*;

public class Main {
  public static void main(String[] args) {
    // Ejercicio 1
    Jugador jugadorChulo = new Jugador("Gabi", new String[] { "Poción", "Armadura", "Cuerda", "Ganas de vivir" });
    jugadorChulo.mostrarEstado();
    jugadorChulo.ruletaDeTwitter();
    jugadorChulo.mostrarEstado();

    System.out.println();

    // Ejercicio 2
    Curso cursoMegaGuay = new Curso("Mega Guay");
    cursoMegaGuay.mostrarCurso();
  }
}
