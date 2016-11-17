package unsam.edu.ar.pois_app.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import unsam.edu.ar.pois_app.utils.NumberUtils;
import unsam.edu.ar.pois_app.utils.StringUtils;


public class Poi implements Serializable {

    Long id;
    String nombre;
    String direccion;
    String tipo;
    Calificacion calificacion;
    HorarioDeAtencion horario;
    Rubro rubro;
    List<Punto> recorrido;
    List<String> listaServicios = new ArrayList<>();

    boolean estaEnFavoritos = true;

    public Poi(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public boolean isEstaEnFavoritos(){
        return estaEnFavoritos;
    }

    public /*String*/double getCalificacion() {
//        return calificacion.getPromedioCalificacion();
        return calificacion.getPromedioDeCalificaciones();
    }

    public String getRubro() {
        return rubro.getNombre();
    }

    public String getCercaniaRubro() {
        return rubro.getCercania();
    }

    public String getCantidadDeParadas(){
        return String.valueOf(recorrido.size());
    }

    public String getHorario(){
        return horario.toString();
    }

    public String getReviews() {
        return calificacion.getReviewsToString();
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        if (direccion == "") {
            return "No tiene dirección";
        }
        return direccion;
    }

    public String getServicios(){
        if(listaServicios.isEmpty()) {
            return "No se encontraron servicios.";
        } else {
            return StringUtils.join("\n",this.listaServicios);
        }
    }

    public String getTipo() {
        return tipo;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public void setHorario(HorarioDeAtencion horario) {
        this.horario = horario;
    }

}

