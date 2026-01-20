package Parte2;

public class BateriaMovil {
  private int porcentaje;

  public BateriaMovil() {
    this.porcentaje = 100;
  }

  public int getPorcentaje() {
    return porcentaje;
  }

  public void setPorcentaje(int porcentaje) {
    this.porcentaje = porcentaje;
  }

  public void usar() {
    if (getPorcentaje() == 0) {
      System.out.println("No tienes suficiente batería para usar el móvil");
    } else {
      setPorcentaje((getPorcentaje() - 20 <= 0) ? 0 : (getPorcentaje() - 20));
    }
  }

  public void cargar() {
    if (getPorcentaje() == 100) {
      System.out.println("Batería a la carga máxima");
    } else {
      setPorcentaje((getPorcentaje() + 20 >= 100) ? 100 : getPorcentaje() + 20);
    }
  }
}
