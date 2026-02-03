package Semana4;

import Semana4.Videojuego.*;

public class Main {
  public static void main(String[] args) {
    Jugador jugadorChulo = new Jugador("Gabi", new String[] { "Poción", "Armadura", "Cuerda", "Ganas de vivir" });
    jugadorChulo.mostrarEstado();
    jugadorChulo.ruletaDeTwitter();
    jugadorChulo.mostrarEstado();
  }
}
