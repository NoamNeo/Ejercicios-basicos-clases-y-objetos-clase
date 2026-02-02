package Semana4.Videojuego;

public class Jugador {
  private String nombre;
  private int vida;
  private int ataque;
  private int movimiento;
  Inventario inventario;

  private String getNombre() {
    return nombre;
  }

  private int getAtaque() {
    return ataque;
  }

  private int getMovimiento() {
    return movimiento;
  }

  private int getVida() {
    return vida;
  }

  public Jugador(String nombre, String[] inventario) {
    this.nombre = nombre;
    this.vida = 50;
    this.ataque = 15;
    this.movimiento = 30;
    this.inventario = new Inventario(inventario);
  }

  public void mostrarEstado() {
    System.out.println("Nombre: " + getNombre());
    System.out.println("Vida: " + getVida());
    System.out.println("Ataque: " + getAtaque());
    System.out.println("movimiento: " + getMovimiento());
    inventario.mostrarInventario();
  }
}
