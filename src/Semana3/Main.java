package Semana3;

import java.util.Random;
import java.util.Scanner;

public class Main {
  private static final int NUMERO_ALUMNOS = 5;
  private static final int NUMERO_JUGADORES = 4;

  public static void main(String[] args) {
    Scanner usrInput = new Scanner(System.in);
    Random rand = new Random();
    // Ejercicio Alumno
    Alumno[] alumnos = new Alumno[NUMERO_ALUMNOS];
    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno(Alumno.nameGen(rand.nextInt(0, 10), rand.nextInt(0, 10)), rand.nextInt(4, 10));
    }
    double media = 0;
    int idAlumnoMax = 0;
    int notaMax = 0;
    for (int i = 0; i < alumnos.length; i++) {
      if (alumnos[i].getNota() >= 5) {
        alumnos[i].mostrarAlumno();
      }
      media = alumnos[i].getNota() + media;
      if (notaMax < alumnos[i].getNota()) {
        notaMax = alumnos[i].getNota();
        idAlumnoMax = i;
      }
    }
    System.out.println("La media es: " + media / alumnos.length);
    System.out.println("El alumno con la nota más alta es:");
    alumnos[idAlumnoMax].mostrarAlumno();
    System.out.println("Los alumnos con las notas más altas son:");
    for (int i = 0; i < alumnos.length; i++) {
      if (alumnos[i].getNota() == notaMax) {
        alumnos[i].mostrarAlumno();
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
    usrInput.close();

    // Ejercicio Jugadores
    Jugadores[] jugadores = new Jugadores[NUMERO_JUGADORES];
    for (int i = 0; i < jugadores.length; i++) {
      jugadores[i] = new Jugadores(Jugadores.nameGen(rand.nextInt(0, 10), rand.nextInt(0, 10)), rand.nextInt(0, 20));
    }
    System.out.println("Estado inicial de los jugadores:");
    for (int i = 0; i < jugadores.length; i++) {
      jugadores[i].mostrarJugador();
    }
    System.out.println("Los jugadores muertos son:");
    for (int i = 0; i < jugadores.length; i++) {
      if (!jugadores[i].estaVivo()) {
        jugadores[i].mostrarJugador();
      }
    }
    System.out.println("Les hacemos a todos 10 puntos de daño");
    for (int i = 0; i < jugadores.length; i++) {
      jugadores[i].recibirDanho(10);
    }
    System.out.println("Los jugadores muertos son:");
    for (int i = 0; i < jugadores.length; i++) {
      if (!jugadores[i].estaVivo()) {
        jugadores[i].mostrarJugador();
      }
    }
  }
}
