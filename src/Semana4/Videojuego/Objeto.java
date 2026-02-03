package Semana4.Videojuego;

import java.util.Map;
import java.util.HashMap;

public class Objeto {
  private String nombre;
  private int cantidad;
  private static Map<String, Integer> defaultItemAmmount;

  private static Map<String, Integer> getDefaultItems() {
    if (defaultItemAmmount == null) {
      defaultItemAmmount = new HashMap<String, Integer>();
      defaultItemAmmount.put("Cuerda", 10);
      defaultItemAmmount.put("Armadura", 1);
      defaultItemAmmount.put("Poción", 5);
      return defaultItemAmmount;
    }
    return defaultItemAmmount;
  }

  public Objeto(String nombre) {
    this.nombre = nombre;
    Map<String, Integer> cantidadesDefault = getDefaultItems();
    this.cantidad = (cantidadesDefault.containsKey(nombre)) ? cantidadesDefault.get(nombre) : 0;
  }

  private int getCantidad() {
    return cantidad;
  }

  private String getNombre() {
    return nombre;
  }

  public void mostrarEstado() {
    System.out.println("Objeto: " + getNombre());
    System.out.println("Cantidad: " + getCantidad());
  }

}
