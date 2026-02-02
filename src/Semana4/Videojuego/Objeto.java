package Semana4.Videojuego;

public class Objeto {
  private String nombre;
  private int cantidad;

  private int getDefaultAmmount(String nombre) {
    switch (nombre) {
      case "Poción":
        return 5;
      case "Armadura":
        return 1;
      case "Cuerda":
        return 10;
      default:
        return 0;
    }
  }

  public Objeto(String nombre) {
    this.nombre = nombre;
    this.cantidad = getDefaultAmmount(nombre);
  }

  private int getCantidad() {
    return cantidad;
  }

  private String getNombre() {
    return nombre;
  }

  public void mostrarEstado() {
    System.out.println("Objeto: " + getNombre());
    System.out.println("Cantidad: " + getCantidad());
  }

}
