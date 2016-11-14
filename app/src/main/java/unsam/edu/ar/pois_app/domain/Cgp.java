package unsam.edu.ar.pois_app.domain;

import java.util.ArrayList;
import java.util.List;

import unsam.edu.ar.pois_app.utils.StringUtils;

/**
 * Created by Laboratorio on 08/11/2016.
 */

public class Cgp extends Poi {
    private String numeroComuna;
    private List<Servicio> servicios;

    public Cgp(String direccion, String horario, boolean favorito, String numeroComuna) {
        super(direccion, horario, favorito);
        this.numeroComuna = numeroComuna;
        this.servicios = new ArrayList<>();
    }
    //TODO con o sin reviews?
    public Cgp(String direccion, String horario, boolean favorito, String numeroComuna, List<Review> reviews) {
        super(direccion, horario, favorito, reviews);
        this.numeroComuna = numeroComuna;
        this.servicios = new ArrayList<>();
    }

    @Override
    public String getNombre() {
//        return this.numeroComuna;
        return this.getTipo() + " " + numeroComuna;
    }

    @Override
    public String getDetalleParticular() {
        return this.getServiciostoString();
    }

    @Override
    public String getNombreDetalleParticular() {
        return "Servicios: ";
    }

    public String getNumeroComuna(){
        return numeroComuna;
    }

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio) {
        this.servicios.remove(servicio);
    }

    public List getServicios(){
        return servicios;
    }

    public String getServiciostoString(){
        List<String> serviciosStrings = new ArrayList<>();
//        return servicios.forEach(s|s.toString());
        for(int i=0; i<this.servicios.size(); i++){
            serviciosStrings.add(this.servicios.get(i).toString());
        }

        return StringUtils.join("\n", serviciosStrings);
    }
    //TODO: Servicios de cgp toString()

}
