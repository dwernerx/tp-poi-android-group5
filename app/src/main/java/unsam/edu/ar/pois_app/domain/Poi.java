package unsam.edu.ar.pois_app.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import unsam.edu.ar.pois_app.utils.NumberUtils;
import unsam.edu.ar.pois_app.utils.StringUtils;


//abstract public class Poi implements Serializable {
//    private Long id;
//    private /*String*/ Direccion direccion;
//    private /*String*/ HorarioDeAtencion horario;
//    private boolean estaEnFavoritos;// = false;
//    private Calificacion calificacion;
//
//    public Poi(/*String*/ Direccion direccion, /*String*/HorarioDeAtencion horario, boolean favorito) {
//        this.direccion = direccion;
//        this.horario = horario;
//        this.estaEnFavoritos = favorito;
//        this.calificacion = new Calificacion();
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//    public boolean isEstaEnFavoritos() {
//        return estaEnFavoritos;
//    }
//
//    public void setEstaEnFavoritos(boolean estado) {
//        this.estaEnFavoritos = estado;
//    }
//
//
//    public String getTipo() {
//        return this.getClass().getSimpleName();
//    }
//
//
//    abstract public String getNombre();
//
//    public String getDireccion() {
//        return direccion.toString();
////        return direccion;
//    }
//
//    public void setDireccion(Direccion direccion) {
//        this.direccion = direccion;
//    }
//
////    public String toString() {
//////        return nombre;
////        return this.getTipo() + " " + nombre;
////    }
//
//    public String getHorario() {
//        return horario.toString();
////        return horario + " hs.";
//    }
//
//    public void setHorario(HorarioDeAtencion horario) {
//        this.horario = horario;
//    }
//
//    public Calificacion getCalificacion(){
//        return calificacion;
//    }
//
//}

public class Poi implements Serializable {

    Long id;
    String nombre;
    String direccion;
    String tipo;
    Calificacion calificacion;
    HorarioDeAtencion horario; //o renombrar la clase a Horario
    Rubro rubro;
    List<Punto> recorrido;
//    List<String> servicios = new ArrayList<>(); //TODO habría que en xtend banco y cgp tengan una lista de strings de servicios
                                                //TODO en cgp el string tendría servicios y horario
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

//    public String getHorarioInicio() {
//        return horario.getInicio();
//    }

//    public String getHorarioFin() {
//        return horario.getFin();
//    }

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
        return /*tipo + " " +*/ nombre;
    }

    public String getDireccion() {
        if (direccion == "") {
            return "No tiene dirección";
        }
        return direccion;
    }

    public String getServicios(){
//        if(servicios.isEmpty()) {
            return "No se encontraron servicios.";
//        } else {
//            return StringUtils.join("\n",this.servicios);
//        }
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

//    public void setHorario(HorarioDeAtencion horario) {
//        this.horario = horario;
//    }


    public String toString() {
        return nombre;
    }
}

