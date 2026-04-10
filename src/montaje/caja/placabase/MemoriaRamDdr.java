package montaje.caja.placabase;

import montaje.enums.TipoMemoriaDDR;

public abstract class MemoriaRamDdr extends MemoriaRam {
private TipoMemoriaDDR memoriaDDR;

  public MemoriaRamDdr(String nombre, String fabricante, double precio, int consumoEnergia, TipoMemoriaDDR memoriaDDR) {
    super(nombre, fabricante, precio, consumoEnergia);
    this.memoriaDDR = memoriaDDR;
  }

  @Override
  public String toString() {
    return "Memoria DDR{" +
        super.toString() +
        ", tipo=" + memoriaDDR +
        "}\n";
  }
}
