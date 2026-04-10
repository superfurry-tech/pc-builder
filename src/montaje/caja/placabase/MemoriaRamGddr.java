package montaje.caja.placabase;

import montaje.enums.TipoMemoriaDDR;

public class MemoriaRamGddr extends MemoriaRam{

  public MemoriaRamGddr(String nombre, String fabricante, double precio, int consumoEnergia) {
    super(nombre, fabricante, precio, consumoEnergia);
  }

  @Override
  public String toString() {
    return "Memoria GDDR{" +
        super.toString() +
        "}\n";
  }
}
