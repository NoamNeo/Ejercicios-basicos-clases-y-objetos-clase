package Semana2;

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
  }
}
