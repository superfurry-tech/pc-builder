package montaje.caja;

public class FuenteAlimentacion extends Pieza {
  private int potencia;

  public FuenteAlimentacion(String nombre, String fabricante, double precio, int consumoEnergia, int potencia) {
    super(nombre, fabricante, precio, consumoEnergia);
    this.potencia = potencia;
  }

  public int getPotencia() {
    return potencia;
  }

  @Override
  public String toString() {
    return "Fuente Alimentación{" +
        super.toString() +
        "', potencia=" + getPotencia() + " W" +
        "}\n";
  }
}
