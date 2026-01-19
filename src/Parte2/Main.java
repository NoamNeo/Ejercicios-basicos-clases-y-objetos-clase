package Parte2;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // Ejercicio 9
    CancionStats cancion = new CancionStats("Wonderwall");
    System.out.printf("Cancion: %s\nNúmero de Reproducciones: %,d\n", cancion.getTitulo(),
        cancion.getNumReproducciones());
    System.out.println("Reproducimos la canción 30 veces");
    for (int i = 0; i < 30; i++) {
      cancion.reproducir();
    }
    System.out.printf("Cancion: %s\nNúmero de Reproducciones: %,d\n", cancion.getTitulo(),
        cancion.getNumReproducciones());
    // Fin ejercicio 9

    // Ejercicio 10
    Marcador marcador = new Marcador();
    marcador.setEquipoLocal("Celta");
    marcador.setEquipoVisitante("Depor Coruña");
    System.out.println("\nSimulamos un partido");
    Random rand = new Random();
    int randInt;
    for (int i = 0; i < 6; i++) {
      randInt = rand.nextInt(0, 3);
      if (randInt == 2) {
        marcador.golLocal();
      } else if (randInt == 1) {
        marcador.golVisitante();
      }
    }
    marcador.resultado();
    // Fin ejercicio 10
  }
}
