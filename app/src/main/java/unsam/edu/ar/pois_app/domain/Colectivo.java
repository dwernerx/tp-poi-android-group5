package unsam.edu.ar.pois_app.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laboratorio on 08/11/2016.
 */

public class Colectivo extends Poi {
    private String linea;
    private String cantidadParadas;
//    private List<Point> recorrido; //o set?

    public Colectivo(String linea, String direccion, String horario, String cantParadas, boolean favorito) {
        super(direccion, horario, favorito);
        this.linea = linea;
        this.cantidadParadas=cantParadas;
//        this.recorrido = new ArrayList<Point>();   //o cantidad de paradas? TODO
    }
    //TODO con o sin reviews?
    public Colectivo(String linea, String direccion, String horario, String cantParadas, boolean favorito, List<Review> reviews) {
        super(direccion, horario, favorito, reviews);
        this.linea = linea;
        this.cantidadParadas=cantParadas;
    }

//    public Colectivo(String linea, String direccion/*terminal?*/,boolean favorito){
//        super(direccion, null/*o 24 hs.?*/, favorito);
////        super(direccion, "o 24 hs." /*o null*/, favorito);
//        this.linea = linea;
//    }
    /*TODO si usamos este contructor y le mandamos "24 hs." o lo que sea, no hace falta hacer override de getHorario
    * en direccion ponemos la terminal entonces?
    * asi sacamos el override de getDireccion*/

    @Override
    public String getNombre() {
        return "Linea " + linea;
//        return this.getTipo() + " " + linea;
    }

    @Override
    public String getDireccion() {
        return "(Sin dirección)"; // zona o terminal?
    }

    @Override
    public String getHorario(){
        return "24 hs."; //TODO alguna idea mejor?
    }

    @Override
    public String getDetalleParticular() {
        return this.getCantidadDeParadas();
    }

    @Override
    public String getNombreDetalleParticular() {
        return "Cantidad de paradas: ";
    }

    public String getCantidadDeParadas(){
        return cantidadParadas;
    }

}
