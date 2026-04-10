package montaje.caja;

public class Refrigeracion extends Pieza {

  public Refrigeracion (String nombre, String fabricante, double precio, int consumoEnergia){
    super(nombre, fabricante, precio, consumoEnergia);
  }

  @Override
  public String toString() {
    return "Refrigeración{" +
        super.toString() +
        "}\n";
  }
}
