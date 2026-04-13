package montaje.ejecutable;

import montaje.caja.Caja;
import montaje.caja.FuenteAlimentacion;
import montaje.caja.Refrigeracion;
import montaje.caja.gpu.Gpu;
import montaje.caja.gpu.MemoriaRamGddr;
import montaje.caja.placabase.Cpu;
import montaje.caja.placabase.MemoriaRamDdr;
import montaje.caja.placabase.PlacaBase;
import montaje.enums.TipoMemoriaDDR;
import montaje.enums.TipoPlaca;
import montaje.enums.TipoSize;
import montaje.ordenador.Ordenador;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    double dineroCliente;


    PlacaBase p1 = new PlacaBase("PLACA1", "F.PLACA", 200.0, 200, TipoPlaca.NO_GAMING, TipoSize.ATX);
    PlacaBase p2 = new PlacaBase("PLACA2", "F.PLACA", 250.0, 250, TipoPlaca.GAMING, TipoSize.MICROATX);

    Cpu cpu1 = new Cpu("CPU1", "F.CPU", 100.0, 100);
    Cpu cpu2 = new Cpu("CPU2", "F.CPU", 150.0, 150);

    MemoriaRamDdr ddr4_1 = new MemoriaRamDdr("DDR4_1", "F.DDR4", 300.0, 300, TipoMemoriaDDR.DDR4);
    MemoriaRamDdr ddr4_2 = new MemoriaRamDdr("DDR4_2", "F.DDR4", 400.0, 400, TipoMemoriaDDR.DDR4);
    MemoriaRamDdr ddr4_3 = new MemoriaRamDdr("DDR4_3", "F.DDR4", 500.0, 500, TipoMemoriaDDR.DDR4);
    MemoriaRamDdr ddr4_4 = new MemoriaRamDdr("DDR4_4", "F.DDR4", 600.0, 600, TipoMemoriaDDR.DDR4);
    MemoriaRamDdr ddr4_5 = new MemoriaRamDdr("DDR4_5", "F.DDR4", 700.0, 700, TipoMemoriaDDR.DDR4);

    MemoriaRamDdr ddr5_1 = new MemoriaRamDdr("DDR5_1", "F.DDR5", 800.0, 800, TipoMemoriaDDR.DDR5);

    MemoriaRamGddr gddr_1 = new MemoriaRamGddr("GDR5_1", "F.FDR5", 900.0, 900);

    Gpu gpu1 = new Gpu("GPU1", "F.GPU", 1000.0, 1000);
    Gpu gpu2 = new Gpu("GPU2", "F.GPU", 1100.0, 1100);
    Gpu gpu3 = new Gpu("GPU3", "F.GPU", 1200.0, 1200);

    Caja c1 = new Caja("CAJA1", "F.CAJA", 10.0, TipoSize.ATX);
    Caja c2 = new Caja("CAJA2", "F.CAJA", 20.0, TipoSize.MICROATX);

    FuenteAlimentacion f1 = new FuenteAlimentacion("FUENTE1", "F.FUENTE", 1300.0, 1300, 4350);

    Refrigeracion r1 = new Refrigeracion("REFRIG.1", "F.REFRIG", 1400.0, 1400);


    /*p1.addRam(ddr4_1);
    p1.addRam(ddr4_2);
    p1.addRam(ddr4_3);
    p1.addRam(ddr4_4);
    p1.addRam(ddr4_5);
    p1.addRam(ddr5_1);

    p2.addGpu(gpu1);
    p2.addGpu(gpu2);
    p1.addGpu(gpu3);

    p1.addCpu(cpu1);
    p1.addCpu(cpu2);*/

    p2.addCpu(cpu1);
    p2.addRam(ddr4_1);
    p2.addGpu(gpu1);

    Ordenador pc1 = new Ordenador("PC1", c2, p2, r1, f1);


    p2.inspeccionarRAM();

    pc1.encender();

    /*System.out.println(pc1);
    pc1.mostrarInformeRAM();*/

    System.out.println(pc1.calcularPrecioTotal());
    System.out.print("¿Cuánto dinero tienes?: ");
    dineroCliente = sc.nextDouble();
    if (dineroCliente >= pc1.calcularPrecioTotal()) {
      System.out.println("Compra OK. Tu cambio es: " + (dineroCliente - pc1.calcularPrecioTotal()) + " €");
    } else {
      System.out.println("Error. Te faltan: " + (pc1.calcularPrecioTotal() - dineroCliente) + " €");
    }
  }
}
