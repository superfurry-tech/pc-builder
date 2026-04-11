package montaje.caja.placabase;

import montaje.enums.TipoMemoriaDDR;

public class MemoriaRamDdr extends MemoriaRam {
private TipoMemoriaDDR tipomemoriaDDR;

  public MemoriaRamDdr(String nombre, String fabricante, double precio, int consumoEnergia, TipoMemoriaDDR tipomemoriaDDR) {
    super(nombre, fabricante, precio, consumoEnergia);
    this.tipomemoriaDDR = tipomemoriaDDR;
  }

  public TipoMemoriaDDR getTipomemoriaDDR() {
    return tipomemoriaDDR;
  }

  @Override
  public String toString() {
    return "Memoria DDR{" +
        super.toString() +
        ", tipo=" + tipomemoriaDDR +
        "}";
  }
}
