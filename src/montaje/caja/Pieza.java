package montaje.caja;

public abstract class Pieza {
  private String nombre;
  private String fabricante;
  private double precio;
  private int consumoEnergia;

  public Pieza(String nombre, String fabricante, double precio, int consumoEnergia) {
    this.nombre = nombre;
    this.fabricante = fabricante;
    this.precio = precio;
    this.consumoEnergia = consumoEnergia;
  }

  public String getNombre() {
    return nombre;
  }

  public String getFabricante() {
    return fabricante;
  }

  public double getPrecio() {
    return precio;
  }

  public int getConsumoEnergia() {
    return consumoEnergia;
  }

  @Override
  public String toString() {
    return "nombre='" + nombre +
        "', fabricante='" + fabricante +
        "', precio=" + precio +
        "€, consumo=" + consumoEnergia +
        "W";
  }
}
