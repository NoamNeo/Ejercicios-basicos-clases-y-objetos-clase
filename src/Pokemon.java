public class Pokemon {
  private String nombre;
  private String tipo;
  private int nivel;
  private int vida;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public String getNombre() {
    return nombre;
  }

  public int getNivel() {
    return nivel;
  }

  public String getTipo() {
    return tipo;
  }

  public int getVida() {
    return vida;
  }

}
