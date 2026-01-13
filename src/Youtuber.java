public class Youtuber {
  private String nombreCanal;
  private String categoria;
  private int subscriptores;

  public void setCanal(String nombreCanal) {
    this.nombreCanal = nombreCanal;
  }

  public String getCanal() {
    return this.nombreCanal;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getCategoria() {
    return this.categoria;
  }

  public void setSubscriptores(int subscriptores) {
    this.subscriptores = subscriptores;
  }

  public int getSubscriptores() {
    return this.subscriptores;
  }
}
