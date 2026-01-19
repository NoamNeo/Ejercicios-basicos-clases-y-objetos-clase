package Parte2;

public class CancionStats {
  private String titulo;
  private int numReproducciones;

  public CancionStats(String nombre) {
    this.titulo = nombre;
    this.numReproducciones = 0;
  }

  public void reproducir() {
    numReproducciones++;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getNumReproducciones() {
    return numReproducciones;
  }

}
