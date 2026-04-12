package montaje.caja;

import montaje.enums.TipoSize;

public class Caja extends Pieza {
  private TipoSize sizeCaja;

  public Caja(String nombre, String fabricante, double precio, TipoSize sizeCaja) {
    super(nombre, fabricante, precio, 0);
    this.sizeCaja = sizeCaja;
  }

  public TipoSize getSizeCaja() {
    return sizeCaja;
  }

  @Override
  public String toString() {
    return "Caja{" +
        "nombre='" + getNombre() +
        "', fabricante='" + getFabricante() +
        "', precio=" + getPrecio() +
        ", tamaño=" + sizeCaja +
        "}\n";
  }
}


