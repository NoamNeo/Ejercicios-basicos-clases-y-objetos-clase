package Semana3;

public class Producto {
  private String nombre;
  private double precio;
  private static final String[] nombres = { "Leche", "Galletas", "Pollo", "Arroz", "Pasta", "Atún", "Pan", "Brecol",
      "Tomate", "Cebolla" };

  public double getPrecio() {
    return precio;
  }

  public Producto(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public static String nameGen(int seed) {
    return nombres[seed];
  }

  public String getEstado() {
    return "Nombre: " + this.nombre + "\nPrecio: " + this.precio;
  }
}
