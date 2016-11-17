package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import unsam.edu.ar.pois_app.utils.NumberUtils;

public class Calificacion implements Serializable {
    private List<Review> listaReview;
    public String promedioCalificacion;
//    public int promedioCalificacion;

    public Calificacion(){
        this.listaReview = new ArrayList<>();
    }

//    public void agregarReview(Review review) {
//        this.listaReview.add(review);
//    }
//
//    public void eliminarReview(Review review) {
//        this.listaReview.remove(review);
//    }
//
//    public void agregarReviews(List<Review> reviews) {
//        this.listaReview.addAll(reviews);
//    }
//
    public List getReviews(){
        return listaReview;
    }

    public String getReviewsToString() {
        String reviews="";
        if(this.noHayReviews()) {
            reviews = "\n\t No hay reviews. \n";
        }
        for (Review review : listaReview) {
            reviews = reviews + review.toString();//"\n Usuario: " + review.getNombreDeUsuario() + "\n Comentario: " + review.getComentario() + "\n Puntuacion: " + review.getPuntuacion() + "\n";
        }
        return reviews;
    }

        public String getPromedioCalificacion() {
        return promedioCalificacion;
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
        return this.listaReview.size();
    }

    private int getSumaDeCalificaciones() {
        int sumaCalificaciones = 0;
        for (int i = 0; i < this.getCantidadDeReviews(); i++) {
            sumaCalificaciones = sumaCalificaciones + this.listaReview.get(i).getPuntuacion();
        }
        return sumaCalificaciones;
    }

    private boolean noHayReviews(){
        return this.listaReview.isEmpty();
    }
}
