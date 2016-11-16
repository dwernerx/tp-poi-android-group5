package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import unsam.edu.ar.pois_app.utils.NumberUtils;

public class Calificacion implements Serializable {
    private List<Review> reviews;

    public Calificacion(){
        this.reviews = new ArrayList<>();
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
}
