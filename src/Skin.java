public class Skin {
  private String nombre;
  private String videojuego;
  private String rareza;
  private int precio;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public void setRareza(String rareza) {
    this.rareza = rareza;
  }

  public void setVideojuego(String videojuego) {
    this.videojuego = videojuego;
  }

  public String getNombre() {
    return nombre;
  }

  public int getPrecio() {
    return precio;
  }

  public String getRareza() {
    return rareza;
  }

  public String getVideojuego() {
    return videojuego;
  }

}
