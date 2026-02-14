package Semana4.Coche;

public class Coche {
  private String marca;
  private Motor motor;

  public Coche(String marca, Motor motor) {
    this.marca = marca;
    this.motor = motor;
  }

  public void apagar() {
    motor.apagar();
  }

  public void encender() {
    motor.encender();
  }

  public void imprimirEstado() {
    System.out.printf("\nMarca: %s", marca);
    motor.mostrarMotor();
  }
}
