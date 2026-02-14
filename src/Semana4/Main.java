package Semana4;

import Semana4.Curso.*;
import Semana4.Videojuego.*;
import Semana4.Coche.*;

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

    // Ejercicio 3
    Coche miCoche = new Coche("Renault", new Motor(200, false));
    miCoche.imprimirEstado();
    miCoche.encender();
    miCoche.encender();
    miCoche.apagar();
    miCoche.apagar();
    miCoche.imprimirEstado();
    miCoche.encender();
    miCoche.imprimirEstado();
  }
}
