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

    // Ejercicio 11
    BateriaMovil movil = new BateriaMovil();
    System.out.printf("\nBatería Móvil: %,d%%\n", movil.getPorcentaje());
    movil.cargar();
    System.out.println("Vamos a usar el móvil hasta que se quede sin batería");
    while (movil.getPorcentaje() > 0) {
      movil.usar();
    }
    System.out.printf("Batería Móvil: %,d%%\n", movil.getPorcentaje());
    System.out.println("Se ha quedado sin batería");
    System.out.println("Vamos a cargarlo hasta el tope");
    while (movil.getPorcentaje() < 100) {
      movil.cargar();
    }
    System.out.printf("Batería Móvil: %,d%%\n", movil.getPorcentaje());
    System.out.println("Se ha cargado");
    // Fin Ejercicio 11

    // Ejercicio 12
    Personaje personaje = new Personaje("Gabi");
    Personaje enemigo = new Personaje("Enemigo");
    System.out.println(personaje.toString());
    // System.out.println("Simulamos combate".toUpperCase());
    // while (personaje.estaVivo() || enemigo.estaVivo()) {
    // System.out.println(personaje.toString());
    // System.out.println(enemigo.toString());
    // if (rand.nextInt(0, 2) == 1) {
    // System.out.println("Te curas".toUpperCase());
    // personaje.curarse(20);
    // }
    // enemigo.recibirDano(personaje.getAtaque());
    // personaje.recibirDano(enemigo.getAtaque());
    // }
    // Fin Ejercicio 12

    // Ejercicio 13
    Carrito carrito = new Carrito();
    System.out.println();
    for (int i = 0; i < 5; i++) {
      carrito.anadirCarrito();
      System.out.println("Añades algo al carrito");
    }
    System.out.println("Aplicas el descuento");
    carrito.aplicarDescuento();
    System.out.println("Balance final: " + carrito.getTotal());
    // Fin ejercicio 13
  }
}
