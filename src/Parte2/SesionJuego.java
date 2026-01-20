package Parte2;

public class SesionJuego {
  private String nombreJuego;
  private int minutosJugados;

  public SesionJuego(String nombre) {
    setNombreJuego(nombre);
    setMinutosJugados(0);
  }

  public SesionJuego() {
    setMinutosJugados(0);
  }

  public int getMinutosJugados() {
    return minutosJugados;
  }

  public String getNombreJuego() {
    return nombreJuego;
  }

  public void setMinutosJugados(int minutosJugados) {
    this.minutosJugados = minutosJugados;
  }

  public void setNombreJuego(String nombreJuego) {
    this.nombreJuego = nombreJuego;
  }

  public void jugar(int minutos) {
    setMinutosJugados(getMinutosJugados() + minutos);
  }

  public double getHorasJugadas() {
    double buffer = (double) this.minutosJugados;
    return buffer / 60d;
  }
}
