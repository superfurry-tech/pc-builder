package montaje.ordenador;

import montaje.caja.Pieza;
import java.util.ArrayList;

public class Ordenador {
  private String nombre;
  private ArrayList<Pieza> componentes = new ArrayList<>();

  public Ordenador (String nombre, ArrayList<Pieza> lista){
    this.nombre = nombre;
    this.componentes = lista;
  }

  @Override
  public String toString() {
    return "\nOrdenador{" +
        "nombre='" + nombre + '\'' + ",\n" +
        "componentes=\n" + componentes +
        '}';
  }
}
