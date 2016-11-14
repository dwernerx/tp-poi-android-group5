package unsam.edu.ar.pois_app.domain;

import java.util.ArrayList;
import java.util.List;

import unsam.edu.ar.pois_app.utils.StringUtils;

/**
 * Created by Laboratorio on 08/11/2016.
 */

public class Banco extends Poi {
    private String nombre;
    private List<String> servicios;// o set?

    public Banco(String nombre, String direccion, String horario, boolean favorito) {
        super(/*nombre, */direccion, horario, favorito);
        this.servicios = new ArrayList<>();
        this.nombre = nombre;
    }
//TODO con o sin reviews?
    public Banco(String nombre, String direccion, String horario, boolean favorito, List<Review> reviews) {
        super(/*nombre, */direccion, horario, favorito, reviews);
        this.servicios = new ArrayList<>();
        this.nombre = nombre;
    }

    public List getServicios(){
        return this.servicios;
    }

    public void agregarServicio(String servicio){
        this.servicios.add(servicio);
    }

    public void eliminarServicio(String servicio){
        this.servicios.remove(servicio);
    }

    public String getServiciosToString(){
        return StringUtils.join("\n",this.servicios);
//        return StringUtils.join(", ",this.servicios);
    }

    @Override
    public String getNombre() {
//        return nombreBanco;
//        return "Banco "+this.nombreBanco;  //depende de como manejemos el tipo
        return this.getTipo()+" "+this.nombre;  //depende de como manejemos el tipo
    }

    @Override
    public String getDetalleParticular() {
        return this.getServiciosToString();
    }

    @Override
    public String getNombreDetalleParticular(){
        return "Servicios: ";
    }
}
