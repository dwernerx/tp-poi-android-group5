package unsam.edu.ar.pois_app.domain;

import java.util.ArrayList;
import java.util.List;

import unsam.edu.ar.pois_app.utils.StringUtils;

public class Banco extends Poi {
    private String nombre;
    private List<String> servicios;

    public Banco(String nombre, /*String*/Direccion direccion, /*String*/HorarioDeAtencion horario, boolean favorito) {
        super(direccion, horario, favorito);
        this.servicios = new ArrayList<>();
        this.nombre = nombre;
    }
//TODO con o sin reviews?
//    public Banco(String nombre, String direccion, String horario, boolean favorito, List<Review> reviews) {
//        super(direccion, horario, favorito, reviews);
//        this.servicios = new ArrayList<>();
//        this.nombre = nombre;
//    }

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
        return this.getTipo()+" "+this.nombre;
    }

//    @Override
//    public String getDetalleParticular() {
//        return this.getServiciosToString();
//    }
//
//    @Override
//    public String getNombreDetalleParticular(){
//        return "Servicios: ";
//    }
}
