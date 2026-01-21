package Semana2;

public class Termometro {
  private int temperatura;

  public Termometro(int temperatura) {
    if (temperatura < -50) {
      setTemperatura(-50);
    } else if (temperatura > 50) {
      setTemperatura(50);
    } else {
      setTemperatura(temperatura);
    }
  }

  private int getTemperatura() {
    return temperatura;
  }

  private void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
  }

  public void subirTemperatura() {
    System.out.println("Subimos la temperatura");
    setTemperatura((getTemperatura() + 1 >= 50) ? 50 : getTemperatura() + 1);
  }

  public void bajarTemperatura() {
    System.out.println("Bajamos la temperatura");
    setTemperatura((getTemperatura() - 1 <= -50) ? -50 : getTemperatura() - 1);
  }

  public void mostrarTemperatura() {
    System.out.println("La temperatura es: " + getTemperatura());
  }
}
