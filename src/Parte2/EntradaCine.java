package Parte2;

public class EntradaCine {
  private String nombrePeli;
  private double precioBase;
  private boolean esEstudiante;

  public EntradaCine(String nombrePeli, double precioBase, boolean esEstudiante) {
    setNombrePeli(nombrePeli);
    setPrecioBase(precioBase);
    setEsEstudiante(esEstudiante);
  }

  public EntradaCine() {
    setNombrePeli(null);
    setPrecioBase(0);
    setEsEstudiante(false);
  }

  public String toString() {
    return "\nNombre Película: " + getNombrePeli() + "\nPrecio Base: " + getPrecioBase() + "\nEs Estudiante: "
        + ((esEstudiante) ? "si" : "no") + "\nPrecio Final: " + precioFinal();
  }

  public String getNombrePeli() {
    return nombrePeli;
  }

  public double getPrecioBase() {
    return precioBase;
  }

  public void setNombrePeli(String nombrePeli) {
    this.nombrePeli = nombrePeli;
  }

  public void setPrecioBase(double precioBase) {
    this.precioBase = precioBase;
  }

  public void setEsEstudiante(boolean esEstudiante) {
    this.esEstudiante = esEstudiante;
  }

  public double precioFinal() {
    return (esEstudiante) ? getPrecioBase() * 0.8 : getPrecioBase();
  }

}
