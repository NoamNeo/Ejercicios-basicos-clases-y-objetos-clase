package Semana2;

public class Mascota {
  private String nombre;
  private int hambre;

  public Mascota(String nombre, int hambre) {
    setNombre(nombre);
    if (hambre > 100) {
      setHambre(100);
    } else if (hambre < 0) {
      setHambre(0);
    } else {
      setHambre(hambre);
    }
  }

  private String getNombre() {
    return nombre;
  }

  private int getHambre() {
    return hambre;
  }

  private void setNombre(String nombre) {
    this.nombre = nombre;
  }

  private void setHambre(int hambre) {
    this.hambre = hambre;
  }

  private void disminuirHambre(int hambre) {
    setHambre((getHambre() - hambre <= 0) ? 0 : getHambre() - hambre);
  }

  private void aumentarHambre(int hambre) {
    setHambre((getHambre() + hambre >= 100) ? 100 : getHambre() + hambre);
  }

  public void darComida() {
    System.out.println("Le das de comer");
    disminuirHambre(25);
  }

  public void pasarTiempo() {
    System.out.println("Pasa una hora");
    aumentarHambre(5);
  }

  public void mostrarEstado() {
    System.out.println("Nombre de la mascota: " + getNombre());
    System.out.println("Hambre de la mascota: " + getHambre());
  }

}
