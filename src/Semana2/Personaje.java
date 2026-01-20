package Semana2;

public class Personaje {
  private String nombre;
  private int vida;

  public Personaje(String nombre) {
    setVida(100);
    setNombre(nombre);
  }

  public Personaje() {
    setNombre(null);
    setVida(0);
  }

  public String toString() {
    return "Nombre: " + getNombre() + "\nVida: " + getVida();
  }

  public void mostrarEstado() {
    System.out.println(toString());
  }

  private String getNombre() {
    return nombre;
  }

  private int getVida() {
    return vida;
  }

  private void setNombre(String nombre) {
    this.nombre = nombre;
  }

  private void setVida(int vida) {
    this.vida = vida;
  }

  public void recibirDano(int dano) {
    dano = (dano <= 0) ? 0 : dano;
    setVida((getVida() - dano <= 0) ? 0 : getVida() - dano);
  }

  public void curarse(int cura) {
    if (getVida() == 100) {
      System.out.println("Estás a full de vida");
    } else {
      cura = (cura <= 0) ? 0 : cura;
      setVida((getVida() + cura >= 100) ? 100 : getVida() + cura);
    }
  }

}
