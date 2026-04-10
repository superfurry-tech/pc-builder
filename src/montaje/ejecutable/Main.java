package montaje.ejecutable;

import montaje.caja.Caja;
import montaje.caja.FuenteAlimentacion;
import montaje.caja.Pieza;
import montaje.caja.Refrigeracion;
import montaje.caja.placabase.*;
import montaje.enums.TipoSize;
import montaje.enums.TipoMemoriaDDR;
import montaje.enums.TipoPlaca;
import montaje.ordenador.Ordenador;

import java.util.ArrayList;

public class Main {
  static void main(String[] args) {

    Pieza caja1 = new Caja("N.Caja1", "F.Caja1", 100.0, 10, TipoSize.ATX);
    Pieza caja2 = new Caja("N.Caja2", "F.Caja2", 150.0, 15, TipoSize.MICROATX);
    Pieza r1 = new Refrigeracion("N.Refrigeración", "F.Refrigeración", 200.0, 20);
    Pieza f1 = new FuenteAlimentacion("N.Fuente", "F.Fuente", 300.0, 30);
    /*Pieza p1 = new PlacaBase("N.Placa1", "F.Placa1", 400.0, 40, TipoPlaca.GAMING, TipoSize.ATX);
    Pieza p2 = new PlacaBase("N.Placa2", "F.Placa2", 450.0, 45, TipoPlaca.NO_GAMING, TipoSize.MICROATX);*/
    Pieza cpu1 = new Cpu("N.Cpu", "F.Cpu", 500.0, 50);
    Pieza gpu1 = new Gpu("N.Gpu", "F.Gpu", 600.0, 60);
    Pieza memoriaGDDR1 = new MemoriaRamGddr("N.GGDR", "F.GGDR", 700.0, 70);
    Pieza memoriaDDR4_1 = new MemoriaRamDdr("N.DDR4_1", "F.DDR4", 800.0, 80, TipoMemoriaDDR.DDR4) {
    };
    Pieza memoriaDDR5_1 = new MemoriaRamDdr("N.DDR5_1", "F.DDR5", 900.0, 90, TipoMemoriaDDR.DDR5) {
    };



    ArrayList<Pieza> componentes = new ArrayList<>();
    Ordenador mipc1 = new Ordenador("Mi PC1", componentes);
    componentes.add(caja1);
    componentes.add(caja2);
    componentes.add(r1);
    componentes.add(f1);
    /*componentes.add(p1);
    componentes.add(p2);*/
    componentes.add(cpu1);
    componentes.add(gpu1);
    componentes.add(memoriaGDDR1);
    componentes.add(memoriaDDR4_1);
    componentes.add(memoriaDDR5_1);

    System.out.println(mipc1);


  }
}
