package Semana4.Coche;

public class Motor {
  private int potencia;
  private boolean encendido;

  public Motor(int potencia, boolean encendido) {
    this.potencia = potencia;
    this.encendido = encendido;
  }

  protected void encender() {
    System.out.printf("\n%s", (encendido) ? "El coche ya está encendido" : "Enciendes el coche");
    encendido = (encendido) ? encendido : !encendido;
  }

  protected void apagar() {
    System.out.printf("\n%s", (!encendido) ? "El coche ya está apagado" : "Apagas el coche");
    encendido = (!encendido) ? encendido : !encendido;
  }

  protected void mostrarMotor() {
    System.out.printf("\nPotencia: %,d caballos\nEncendido: %s", potencia, (encendido) ? "Encendido" : "apagado");
  }
}
