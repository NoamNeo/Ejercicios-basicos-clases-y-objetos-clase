package Semana2;

public class Coche {
  private String marca;
  private int velocidad;
  private int velocidadMax;

  public Coche(String marca, int velocidadMax) {
    setMarca(marca);
    setVelocidadMax(velocidadMax);
    setVelocidad(0);
  }

  private String getMarca() {
    return marca;
  }

  private int getVelocidadMax() {
    return velocidadMax;
  }

  private int getVelocidad() {
    return velocidad;
  }

  private void setMarca(String marca) {
    this.marca = marca;
  }

  private void setVelocidadMax(int velocidadMax) {
    this.velocidadMax = velocidadMax;
  }

  private void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public void acelerar() {
    setVelocidad((getVelocidad() + 5 >= getVelocidadMax()) ? getVelocidadMax() : getVelocidad() + 5);
  }

  public void frenar() {
    setVelocidad((getVelocidad() - 5 <= 0) ? 0 : getVelocidad() - 5);
  }

  public void mostrarVelocidad() {
    System.out.println("Velocidad: " + getVelocidad());
  }

  public void mostrarStats() {
    System.out.println("Marca: " + getMarca() + "\nVelocidad maxima: " + getVelocidadMax());
  }

}
