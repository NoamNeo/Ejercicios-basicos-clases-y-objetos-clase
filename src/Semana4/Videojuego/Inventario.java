package Semana4.Videojuego;

public class Inventario {
  private Objeto[] contenido;

  // Inventario("Poción", "Armadura", "Cuerda");
  public Inventario(String[] items) {
    contenido = new Objeto[items.length];
    for (int i = 0; i < contenido.length; i++) {
      contenido[i] = new Objeto(items[i]);
    }
  }

  public void mostrarInventario() {
    int i = 1;
    for (Objeto objeto : contenido) {
      System.out.println("Slot " + i);
      objeto.mostrarEstado();
      i++;
    }
  }
}
