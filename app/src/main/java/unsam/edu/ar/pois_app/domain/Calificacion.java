package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import unsam.edu.ar.pois_app.utils.NumberUtils;

public class Calificacion implements Serializable {
    private List<Review> listaDeReviews;

    public Calificacion(){
        this.listaDeReviews = new ArrayList<>();
    }

    public void agregarReview(Review review) {
        this.listaDeReviews.add(review);
    }

    public void eliminarReview(Review review) {
        this.listaDeReviews.remove(review);
    }

    /** depende de como queremos agregar los listaDeReviews*/
    public void agregarReviews(List<Review> reviews) {
        this.listaDeReviews.addAll(reviews);
    }

    public List getReviews(){
        return listaDeReviews;
    }

    public String getReviewsToString() {
        String reviews="";
        if(this.noHayReviews()) {
//            mensajes = "No hay listaDeReviews por el momento.";
            reviews = "No hay listaDeReviews.";
        }
        for (Review review : listaDeReviews) {
            reviews = reviews + review.toString();//"\n Usuario: " + item.getUsuario() + "\n Comentario: " + item.getComentario() + "\n Puntuacion: " + item.getPuntuacion() + "\n";
        }
        return reviews;
    }

    public double /*int*/ getPromedioDeCalificaciones() {
        if (this.noHayReviews()) {
            return 0;
        } else {
//          return (double) this.getSumaDeCalificaciones()/this.getCantidadDeReviews(); //con todos los decimales
//          return this.getSumaDeCalificaciones()/this.getCantidadDeReviews();//parte entera
            return NumberUtils.redondearDecimales((double) this.getSumaDeCalificaciones() / this.getCantidadDeReviews(), 1); //con 1 decimales
        }
    }

    private int getCantidadDeReviews(){
        return this.listaDeReviews.size();
    }

    private int getSumaDeCalificaciones() {
        int sumaCalificaciones = 0;
        for (int i = 0; i < this.getCantidadDeReviews(); i++) {
            sumaCalificaciones = sumaCalificaciones + this.listaDeReviews.get(i).getPuntuacion();
        }
        return sumaCalificaciones;
    }

    private boolean noHayReviews(){
        return this.listaDeReviews.isEmpty();
    }
}
