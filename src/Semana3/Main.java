package Semana3;

import java.util.Random;
import java.util.Scanner;

public class Main {
  private static final int NUMERO_ALUMNOS = 5;
  private static final int NUMERO_JUGADORES = 4;
  private static final int NUMERO_PRODUCTOS = 10;

  public static void main(String[] args) {
    Scanner usrInput = new Scanner(System.in);
    Random rand = new Random();
    // Ejercicio Alumno
    Alumno[] alumnos = new Alumno[NUMERO_ALUMNOS];
    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno(Alumno.nameGen(rand.nextInt(0, 10), rand.nextInt(0, 10)), rand.nextInt(4, 10));
    }
    double media = 0;
    Alumno alumnoMax = null;
    for (Alumno alumno : alumnos) {
      if (alumno.getNota() >= 5) {
        alumno.mostrarAlumno();
      }
      media = media + alumno.getNota();
      alumnoMax = (alumnoMax != null && alumnoMax.getNota() > alumno.getNota()) ? alumnoMax : alumno;
    }
    System.out.println("La media es: " + media / alumnos.length);
    System.out.println("El alumno con la nota más alta es:");
    alumnoMax.mostrarAlumno();
    System.out.println("Los alumnos con las notas más altas son:");
    for (Alumno alumno : alumnos) {
      if (alumno.getNota() == alumnoMax.getNota()) {
        alumno.mostrarAlumno();
      }
    }
    // System.out.println("Escribe un nombre para saber si está en la clase: ");
    // String nameRegex = usrInput.nextLine().trim();
    // boolean nameExists = false;
    // for (int i = 0; i < alumnos.length; i++) {
    // if (alumnos[i].getNombre().equals(nameRegex)) {
    // nameExists = !nameExists;
    // System.out.println("Hay un alumno con el nombre: " + nameRegex);
    // }
    // }
    // if (!nameExists) {
    // System.out.println("No hay un alumno con ese nombre");
    // }

    // Ejercicio Jugadores
    Jugadores[] jugadores = new Jugadores[NUMERO_JUGADORES];
    for (int i = 0; i < jugadores.length; i++) {
      jugadores[i] = new Jugadores(Jugadores.nameGen(rand.nextInt(0, 10), rand.nextInt(0, 10)), rand.nextInt(0, 20));
    }
    System.out.println("Estado inicial de los jugadores:");
    for (Jugadores jugador : jugadores) {
      jugador.mostrarJugador();
    }
    System.out.println("Los jugadores muertos son:");
    for (Jugadores jugador : jugadores) {
      if (!jugador.estaVivo()) {
        jugador.mostrarJugador();
      }
    }
    System.out.println("Les hacemos a todos 10 puntos de daño");
    for (Jugadores jugador : jugadores) {
      jugador.recibirDanho(10);
    }
    System.out.println("Los jugadores muertos son:");
    for (int i = 0; i < jugadores.length; i++) {
      if (!jugadores[i].estaVivo()) {
        jugadores[i].mostrarJugador();
      }
    }

    // Ejercicio Producto
    Producto[] productos = new Producto[NUMERO_PRODUCTOS];
    for (int i = 0; i < productos.length; i++) {
      String nombre = Producto.nameGen(rand.nextInt(0, 10));
      productos[i] = new Producto(nombre, rand.nextInt(50, 251));
    }
    System.out.println("Introduce el presupuesto por producto (en céntimos):");
    int precio = usrInput.nextInt();
    System.out.println("Productos fuera de presupuesto");
    for (Producto producto : productos) {
      if (producto.getPrecio() > precio) {
        System.out.println(producto.getEstado());
      }
    }
    System.out.println("Productos dentro de presupuesto");
    for (Producto producto : productos) {
      if (producto.getPrecio() <= precio) {
        System.out.println(producto.getEstado());
      }
    }
    Producto masCaro = null;
    for (Producto producto : productos) {
      masCaro = (masCaro != null && masCaro.getPrecio() > producto.getPrecio()) ? masCaro : producto;
    }
    System.out.println("El producto más caro es:");
    System.out.println(masCaro.getEstado());
    usrInput.close();
  }
}
