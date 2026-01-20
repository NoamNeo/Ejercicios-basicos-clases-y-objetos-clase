package Parte2;

public class Carrito {
  private double total;

  public Carrito() {
    this.total = 0;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getTotal() {
    return total;
  }

  public void anadirCarrito() {
    setTotal(getTotal() + 5);
  }

  public void aplicarDescuento() {
    setTotal(getTotal() * 0.8);
  }

}
