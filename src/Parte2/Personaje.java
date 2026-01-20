package Parte2;

public class Personaje {
  private String nombre;
  private int vida;
  private int ataque;

  public Personaje() {
    setVida(100);
    setAtaque(25);
  }

  public String toString() {
    return "\nPERSONAJE\nNombre: " + getNombre() + "\nVida: " + getVida();
  }

  public Personaje(String nombre) {
    setNombre(nombre);
    setVida(100);
    setAtaque(25);
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  private void setVida(int vida) {
    this.vida = vida;
  }

  private void setAtaque(int ataque) {
    this.ataque = ataque;
  }

  public String getNombre() {
    return nombre;
  }

  public int getVida() {
    return vida;
  }

  public int getAtaque() {
    return ataque;
  }

  public void recibirDano(int dano) {
    setVida((getVida() - dano <= 0) ? 0 : getVida() - dano);
  }

  public void curarse(int cura) {
    if (getVida() == 100) {
      System.out.println("Ya estás al 100% de vida");
    } else {
      setVida((getVida() + cura >= 100) ? 100 : getVida() + cura);
    }
  }

  public boolean estaVivo() {
    return (getVida() <= 0) ? false : true;
  }
}
