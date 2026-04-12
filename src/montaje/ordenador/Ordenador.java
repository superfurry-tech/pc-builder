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
      System.out.println("Incompatibilidad Caja y Placa Base por diferente tamaño. Tamaño Caja: " + caja.getSizeCaja() + " y tamaño Placa: " + placaBase.getSizePlaca());
      return false;
    } else {
      return true;
    }
  }

  public void mostrarInformeRAM() {
    this.placaBase.inspeccionarRAM();
  }

  public void encender(){

  }


  @Override
  public String toString() {
    if (!esCompatible) {
      return "Incompatibilidad Caja y Placa Base por diferente tamaño. Tamaño Caja: " + caja.getSizeCaja() + " y tamaño Placa: " + placaBase.getSizePlaca();
    }
    return "Ordenador{" +
        "nombre='" + nombre + '\'' +
        ", caja=" + caja +
        ", placaBase=" + placaBase +
        ", refrigeración=" + refrigeracion +
        ", fuente alimentación=" + fuenteAlimentacion +
        ", esCompatible=" + esCompatible +
        '}';
  }
}


