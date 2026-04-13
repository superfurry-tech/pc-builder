package montaje.ordenador;

import montaje.caja.Caja;
import montaje.caja.FuenteAlimentacion;
import montaje.caja.Refrigeracion;
import montaje.caja.placabase.PlacaBase;

public class Ordenador {
  private String nombre;
  private Caja caja;
  private PlacaBase placaBase;
  private Refrigeracion refrigeracion;
  private FuenteAlimentacion fuenteAlimentacion;
  private boolean esCompatible;

  public Ordenador(String nombre, Caja caja, PlacaBase placaBase, Refrigeracion refrigeracion, FuenteAlimentacion fuenteAlimentacion) {
    this.nombre = nombre;
    this.caja = caja;
    this.placaBase = placaBase;
    this.refrigeracion = refrigeracion;
    this.fuenteAlimentacion = fuenteAlimentacion;
    this.esCompatible = validarCajaYPlaca();
  }

  private boolean validarCajaYPlaca() {
    if (placaBase.getSizePlaca() != caja.getSizeCaja()) {
      return false;
    } else {
      return true;
    }
  }

  public void mostrarInformeRAM() {
    this.placaBase.inspeccionarRAM();
  }

  public double calcularConsumoOrdenador() {
    double consumoOrdenador = placaBase.calcularConsumoPlaca();

    if (refrigeracion != null) {
      consumoOrdenador += refrigeracion.getConsumoEnergia();
    }

    if (fuenteAlimentacion != null) {
      consumoOrdenador += fuenteAlimentacion.getConsumoEnergia();
    }
    return consumoOrdenador;
  }

  public boolean encender() {
    if (placaBase.getCpu() == null) {
      System.out.println("¡Ordenador no enciende!. Falta CPU.");
      return false;
    }
    if (placaBase.getListaRams().isEmpty()) {
      System.out.println("¡Ordenador no enciende!. Falta Memoria RAM.");
      return false;
    }
    if (placaBase.getListaGpus().isEmpty()) {
      System.out.println("¡Ordenador no enciende!. Falta Tarjeta gráfica.");
      return false;
    }
    if (refrigeracion == null) {
      System.out.println("¡Ordenador no enciende!. Falta sistema de refrigeración.");
      return false;
    }
    if (!validarCajaYPlaca()) {
      return false;
    }
    if (fuenteAlimentacion.getPotencia() >= calcularConsumoOrdenador()) {
      System.out.println("¡¡Ordenador encendido!!");
      return true;
    } else {
      System.out.println("Potencia de Fuente de Alimentación insuficiente. El ordenador no se puede encender.");
      return false;
    }
  }

  public double calcularPrecioTotal() {
    double precioTotal = 0;
    if (placaBase != null) {
      precioTotal = placaBase.calcularPrecioPlacaBase();
    }
    if (caja != null) {
      precioTotal += caja.getPrecio();
    }

    if (refrigeracion != null) {
      precioTotal += refrigeracion.getPrecio();
    }

    if (fuenteAlimentacion != null) {
      precioTotal += fuenteAlimentacion.getPrecio();
    }
    return precioTotal;
  }

  @Override
  public String toString() {
    String compatibilidad;
    if (esCompatible) {
      compatibilidad = "true";
    } else {
      compatibilidad = "* NO COMPATIBLES *";
    }
    return "Ordenador{" +
        "nombre='" + nombre + '\'' +
        ", caja=" + caja +
        ", placaBase=" + placaBase +
        ", refrigeración=" + refrigeracion +
        ", fuente alimentación=" + fuenteAlimentacion +
        ", compatibilidad Caja y Placa=" + compatibilidad +
        '}';
  }
}


