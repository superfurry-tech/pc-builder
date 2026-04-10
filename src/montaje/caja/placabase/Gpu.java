package montaje.caja.placabase;

import montaje.caja.Pieza;

public class Gpu extends Pieza {

  public Gpu(String nombre, String fabricante, double precio, int consumoEnergia) {
    super(nombre, fabricante, precio, consumoEnergia);
  }

  @Override
  public String toString() {
    return "GPU{" +
        super.toString() +
        "}\n";
  }
}
