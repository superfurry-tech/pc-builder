package montaje.caja.placabase;

import montaje.caja.Pieza;

public class Cpu extends Pieza {

  public Cpu(String nombre, String fabricante, double precio, int consumoEnergia) {
    super(nombre, fabricante, precio, consumoEnergia);
  }

  @Override
  public String toString() {
    return "CPU{" +
        super.toString() +
        "}\n";
  }
}
