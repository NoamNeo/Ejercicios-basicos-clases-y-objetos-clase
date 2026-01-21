package Semana2;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // Ejercicio 1
    CuentaBancaria cuentaChula = new CuentaBancaria("Gabi", 5000);
    cuentaChula.imprimirEstado();
    System.out.println("Intentamos retirar 10000 de saldo");
    cuentaChula.retirarSaldo(10000);
    cuentaChula.imprimirEstado();
    System.out.println("Intentamos retirar 300 de saldo");
    cuentaChula.retirarSaldo(300);
    cuentaChula.imprimirEstado();
    System.out.println("Intentamos ingresar 100 de saldo");
    cuentaChula.ingresar(100);
    cuentaChula.imprimirEstado();
    // Fin ejercicio 1

    // Ejercicio 2
    System.out.println("\nPersonaje");
    Personaje gabi = new Personaje("Gabi");
    gabi.mostrarEstado();
    gabi.curarse(10);
    gabi.mostrarEstado();
    gabi.recibirDano(50);
    gabi.mostrarEstado();
    gabi.curarse(30);
    gabi.mostrarEstado();
    gabi.curarse(30);
    gabi.mostrarEstado();
    System.out.println("Recibes 110 de daño");
    gabi.recibirDano(110);
    gabi.mostrarEstado();
    // Fin ejercicio 2

    // Ejercicio 3
    Random rand = new Random();
    Contador contador = new Contador(14);
    System.out.println();
    contador.valorActual();
    for (int i = 0; i < 10; i++) {
      switch (rand.nextInt(0, 5)) {
        case 0:
          System.out.println("Incrementamos el contador en 5");
          contador.incrementarContador();
          break;
        case 1:
          System.out.println("Incrementamos el contador en un número aleatorio");
          contador.incrementarContador(rand.nextInt(0, 6));
          break;
        case 2:
          System.out.println("Decrementamos el contador en 5");
          contador.decrementarContador();
          break;
        case 3:
          System.out.println("Decrementamos el contador en un número aleatorio");
          contador.decrementarContador(rand.nextInt(0, 6));
          break;
        case 4:
          System.out.println("Reseteamos el contador");
          contador.resetContador();
          break;
      }
      contador.valorActual();
    }
    // Fin ejercicio 3

    // Ejercicio 4
    Coche coche = new Coche("Seat", 120);
    for (int i = 0; i < 30; i++) {
      System.out.println("Aceleramos");
      coche.acelerar();
      coche.mostrarVelocidad();
    }
    for (int i = 0; i < 30; i++) {
      System.out.println("Frenamos");
      coche.frenar();
      coche.mostrarVelocidad();
    }
    // Fin ejercicio 4

    // Ejercicio 5
    System.out.println();
    Termometro termometro = new Termometro(49);
    for (int i = 0; i < 5; i++) {
      termometro.subirTemperatura();
      termometro.mostrarTemperatura();
    }
    for (int i = 0; i < 5; i++) {
      termometro.bajarTemperatura();
      termometro.mostrarTemperatura();
    }
    termometro = new Termometro(-49);
    for (int i = 0; i < 5; i++) {
      termometro.bajarTemperatura();
      termometro.mostrarTemperatura();
    }
    for (int i = 0; i < 5; i++) {
      termometro.subirTemperatura();
      termometro.mostrarTemperatura();
    }
    // Fin Ejercicio 5

    // Ejercicio 6
    System.out.println();
    Mascota mascota = new Mascota("Michifu", 50);
    mascota.mostrarEstado();
    mascota.darComida();
    mascota.mostrarEstado();
    System.out.println("Pasan 5 horas");
    for (int i = 0; i < 5; i++) {
      mascota.pasarTiempo();
    }
    mascota.mostrarEstado();
    // Fin ejercicio 6

    // Ejercicio 7
    System.out.println();
    Ascensor ascensor = new Ascensor(7);
    ascensor.mostrarPlanta();
    System.out.println("Intentamos subir 4 plantas");
    for (int i = 0; i < 4; i++) {
      ascensor.subirPlanta();
    }
    ascensor.mostrarPlanta();
    System.out.println("Cambiamos a la planta 3");
    ascensor = new Ascensor(3);
    ascensor.mostrarPlanta();
    System.out.println("Intentamos bajar 4 plantas");
    for (int i = 0; i < 4; i++) {
      ascensor.bajarPlanta();
    }
    ascensor.mostrarPlanta();
    // Fin ejercicio 7
  }
}
