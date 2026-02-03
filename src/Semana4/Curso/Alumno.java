package Semana4.Curso;

import java.util.Random;

public class Alumno {
  private static final int NUM_ASIGNATURAS = 10;
  private String nombre;
  private int[] notas = new int[NUM_ASIGNATURAS];
  private double media;

  public Alumno(String nombre) {
    this.nombre = nombre;
    this.notas = iniciarNotas();
    media = calcularMedia(notas);
  }

  private int[] iniciarNotas() {
    int[] notas = new int[NUM_ASIGNATURAS];
    for (int i = 0; i < notas.length; i++) {
      notas[i] = new Random().nextInt(0, 10);
    }
    return notas;
  }

  private double calcularMedia(int[] notas) {
    double media = 0;
    for (int nota : notas) {
      media = media + nota;
    }
    return media / NUM_ASIGNATURAS;
  }

  public void mostrarNotas() {
    for (int nota : notas) {
      System.out.println(nota);
    }
  }

  public void mostrarAlumno() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Media: " + this.media);
  }
}
