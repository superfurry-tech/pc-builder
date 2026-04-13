package montaje.caja.placabase;

import montaje.caja.Pieza;

public abstract class MemoriaRam extends Pieza {

  public MemoriaRam(String nombre, String fabricante, double precio, int consumoEnergia) {
    super(nombre, fabricante, precio, consumoEnergia);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
