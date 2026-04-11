package montaje.caja.placabase;

import montaje.caja.Pieza;
import montaje.caja.gpu.Gpu;
import montaje.caja.gpu.MemoriaRamGddr;
import montaje.enums.TipoMemoriaDDR;
import montaje.enums.TipoSize;
import montaje.enums.TipoPlaca;

import java.util.ArrayList;

public class PlacaBase extends Pieza {
  private Cpu cpu;
  private ArrayList<MemoriaRamDdr> listaRams;
  private ArrayList<Gpu> listaGpus;
  private TipoPlaca tipoplaca;
  private TipoSize sizePlaca;

  public PlacaBase(String nombre, String fabricante, double precio, int consumoEnergia, TipoPlaca tipoplaca, TipoSize sizePlaca) {
    super(nombre, fabricante, precio, consumoEnergia);
    this.listaRams = new ArrayList<>();
    this.listaGpus = new ArrayList<>();
    this.tipoplaca = tipoplaca;
    this.sizePlaca = sizePlaca;
  }

  public void addRam(MemoriaRamDdr memoriaRamDdr) {
    if (listaRams.isEmpty()) {
      listaRams.add(memoriaRamDdr);
    } else if (listaRams.size() == 4) {
      System.out.println("No puede meter " + memoriaRamDdr.getNombre() + ". Ya no quedan slots libres.");
    } else if (memoriaRamDdr.getTipomemoriaDDR().equals(TipoMemoriaDDR.DDR4) && listaRams.getFirst().getTipomemoriaDDR() == TipoMemoriaDDR.DDR5) {
      System.out.println("Incompatibilidad de memorias. La memoria " + memoriaRamDdr.getNombre() + " es DDR4 pero ya hay DDR5 en la placa.");
    } else if (memoriaRamDdr.getTipomemoriaDDR().equals(TipoMemoriaDDR.DDR5) && listaRams.getFirst().getTipomemoriaDDR() == TipoMemoriaDDR.DDR4) {
      System.out.println("Incompatibilidad de memorias. La memoria " + memoriaRamDdr.getNombre() + " es DDR5 pero ya hay DDR4 en la placa.");
    } else {
      listaRams.add(memoriaRamDdr);
    }
  }

  public void addGpu(Gpu gpu) {
    switch (tipoplaca) {
      case GAMING:
        if (listaGpus.size() == 2) {
          System.out.println("No puede meter la tarjeta gráfica " + gpu.getNombre() + ". Ya tiene dos y su placa GAMING solo permite dos.");
        } else {
          listaGpus.add(gpu);
        }
        break;
      case NO_GAMING:
        if (listaGpus.size() == 1) {
          System.out.println("No puede meter la tarjeta gráfica " + gpu.getNombre() + ". Ya tiene una y su placa NO GAMING solo permite una.");
        } else {
          listaGpus.add(gpu);
        }
        break;
      default:
        System.out.println("Nuevo tipo de placa sin límite.");
        break;
    }
  }

  public void addCpu(Cpu cpu) {
    if (this.cpu != null) {
      System.out.println("No puede añadir la CPU " + cpu.getNombre() + ". Ya tiene una instalada.");
    } else {
      this.cpu = cpu;
    }
  }

  public void inspeccionarRAM() {
    int contadorDDR4 = 0;
    int contadorDDR5 = 0;
    int contadorGDDR = 0;
    for (MemoriaRamDdr r : listaRams) {
      if (r.getTipomemoriaDDR() == TipoMemoriaDDR.DDR4) {
        contadorDDR4++;
      } else if (r.getTipomemoriaDDR() == TipoMemoriaDDR.DDR5) {
        contadorDDR5++;
      }
    }
    contadorGDDR = listaGpus.size();

    System.out.println("\n--- Inventario Memorias ---\nDDR4: " + contadorDDR4 + "\nDDR5: " + contadorDDR5 + "\nGDDR: " + contadorGDDR + "\n");
  }

  public TipoSize getSizePlaca() {
    return sizePlaca;
  }

  @Override
  public String toString() {
    return "PlacaBase{" +
        super.toString() +
        ", cpu=" + cpu +
        ", tipo=" + tipoplaca +
        ", tamaño=" + sizePlaca +
        ", RAM=" + listaRams +
        ", GPU=" + listaGpus +
        "}\n";
  }
}
