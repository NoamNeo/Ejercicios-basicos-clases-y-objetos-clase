package Parte2;

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
  }
}
