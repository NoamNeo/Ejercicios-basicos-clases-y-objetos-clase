package Semana2;

public class Ascensor {
  private int plantaActual;

  public Ascensor(int plantaActual) {
    setPlantaActual(plantaActual);
  }

  private int getPlantaActual() {
    return plantaActual;
  }

  private void setPlantaActual(int plantaActual) {
    this.plantaActual = plantaActual;
  }

  public void subirPlanta() {
    setPlantaActual((getPlantaActual() + 1 >= 10) ? 10 : getPlantaActual() + 1);
  }

  public void bajarPlanta() {
    setPlantaActual((getPlantaActual() - 1 <= 0) ? 0 : getPlantaActual() - 1);
  }

  public void mostrarPlanta() {
    System.out.println("Estas en la planta: " + getPlantaActual());
  }

}
