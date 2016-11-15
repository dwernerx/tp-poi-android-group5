package unsam.edu.ar.pois_app.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import unsam.edu.ar.pois_app.utils.NumberUtils;
import unsam.edu.ar.pois_app.utils.StringUtils;


abstract public class Poi implements Serializable {
    private Long id;
    private String direccion;
    private String horario;
    private boolean estaEnFavoritos;// = false;
    private List<Review> reviews; //Calificacion

    public Poi(String direccion, String horario, boolean favorito) {
        this.direccion = direccion;
        this.horario = horario;
        this.estaEnFavoritos = favorito;
        this.reviews = new ArrayList<>();
    }

    public Poi(String direccion, String horario, boolean favorito, List<Review> reviews) {
        this.direccion = direccion;
        this.horario = horario;
        this.estaEnFavoritos = favorito;
        this.reviews = new ArrayList<>();
        this.agregarReviews(reviews);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public boolean isEstaEnFavoritos() {
        return estaEnFavoritos;
    }

    public void setEstaEnFavoritos(boolean estado) {
        this.estaEnFavoritos = estado;
    }


    public String getTipo() {
        return this.getClass().getSimpleName();
    }


    abstract public String getNombre();

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

//    public String toString() {
////        return nombre;
//        return this.getTipo() + " " + nombre;
//    }

    public String getHorario() {
        return horario + " hs.";
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    public void agregarReview(Review review) {
        this.reviews.add(review);
    }

    public void eliminarReview(Review review) {
        this.reviews.remove(review);
    }

    /** depende de como queremos agregar los reviews*/
    public void agregarReviews(List<Review> reviews) {
        this.reviews.addAll(reviews);
    }

    public List getReviews(){
        return reviews;
    }

    public double /*int*/ getPromedioDeCalificaciones() {
        if (this.reviews.isEmpty()) {
//            return 0.0;
            return 0;
        } else {
//          return (double) this.getSumaDeCalificaciones()/this.getCantidadDeReviews(); //con todos los decimales
//          return this.getSumaDeCalificaciones()/this.getCantidadDeReviews();//parte entera
            return NumberUtils.redondearDecimales((double) this.getSumaDeCalificaciones() / this.getCantidadDeReviews(), 1); //con 1 decimales
        }
    }

    private int getCantidadDeReviews(){
        return this.reviews.size();
    }

    private int getSumaDeCalificaciones() {
            int sumaCalificaciones = 0;
            for (int i = 0; i < this.getCantidadDeReviews(); i++) {
                sumaCalificaciones = sumaCalificaciones + this.reviews.get(i).getCalificacion();
            }
            return sumaCalificaciones;
    }

    abstract public String getDetalleParticular();
    abstract public String getNombreDetalleParticular();
}

