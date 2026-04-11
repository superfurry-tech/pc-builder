package montaje.caja;

import montaje.enums.TipoSize;

public class Caja extends Pieza {
  private TipoSize sizeCaja;

  public Caja(String nombre, String fabricante, double precio, int consumoEnergia, TipoSize sizeCaja) {
    super(nombre, fabricante, precio, consumoEnergia);
    this.sizeCaja = sizeCaja;
  }

  public TipoSize getSizeCaja() {
    return sizeCaja;
  }

  @Override
  public String toString() {
    return "Caja{" +
        super.toString() +
        ", tamaño=" + sizeCaja +
        "}\n";
  }
}
