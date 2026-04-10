package montaje.caja;

public class FuenteAlimentacion extends Pieza {

  public FuenteAlimentacion(String nombre, String fabricante, double precio, int consumoEnergia) {
    super(nombre, fabricante, precio, consumoEnergia);
  }

  @Override
  public String toString() {
    return "Fuente Alimentación{" +
        super.toString() +
        "}\n";
  }
}
