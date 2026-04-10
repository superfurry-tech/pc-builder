package montaje.caja.placabase;

import montaje.caja.Pieza;
import montaje.enums.TipoSize;
import montaje.enums.TipoPlaca;

import java.util.ArrayList;

public class PlacaBase  extends Pieza {
  private Cpu cpu;
  private ArrayList<MemoriaRam> listaRams = new ArrayList<>();
  private ArrayList<Gpu> listaGpus = new ArrayList<>();
  private TipoPlaca placa;
  private TipoSize sizePlaca;

  public PlacaBase (String nombre, String fabricante, double precio, int consumoEnergia, Cpu cpu, ArrayList<MemoriaRam> listaRams, ArrayList<Gpu> listaGpus, TipoPlaca placa, TipoSize sizePlaca){
    super(nombre, fabricante, precio, consumoEnergia);
    this.cpu = cpu;
    this.listaRams = listaRams;
    this.listaGpus = listaGpus;
    this.placa = placa;
    this.sizePlaca = sizePlaca;
  }

  @Override
  public String toString() {
    return "PlacaBase{" +
        super.toString() +
        ", tipo=" + placa +
        ", tamaño=" + sizePlaca +
        "}\n";
  }
}
