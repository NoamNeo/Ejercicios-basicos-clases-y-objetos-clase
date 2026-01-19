public class JugadorFutbol {
  private String nombre;
  private String equipo;
  private String posicion;
  private int dorsal;

  public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
  }

  public void setEquipo(String equipo) {
    this.equipo = equipo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  public int getDorsal() {
    return dorsal;
  }

  public String getEquipo() {
    return equipo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getPosicion() {
    return posicion;
  }
}
