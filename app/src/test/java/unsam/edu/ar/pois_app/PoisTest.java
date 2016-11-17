package unsam.edu.ar.pois_app;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unsam.edu.ar.pois_app.domain.Cgp;
import unsam.edu.ar.pois_app.domain.Colectivo;
import unsam.edu.ar.pois_app.domain.RepositorioPois;
import unsam.edu.ar.pois_app.domain.Review;
import unsam.edu.ar.pois_app.domain.Servicio;
import unsam.edu.ar.pois_app.utils.StringUtils;

public class PoisTest {
    private Colectivo colectivo;
    private Colectivo colectivo2;
    private Cgp cgp;

    @Before
    public void init(){
//        colectivo = new Colectivo("78","lalala",null, "0",true);
//        cgp = new Cgp("Calle falsa 123, Springfield", "8:00 a 19:00", false, "13");

//        colectivo2 = new Colectivo("343", "dfsdfdf", null, false);//new ArrayList<Review>[{new Review("user", "comentario",1)}]);

    }

    @Test
    public void lists(){
        List<Review> list = Arrays.asList(
                new Review("u1", "c1", 1),new Review("u2", "c2", 2)
        );
        System.out.println(StringUtils.join("\n",list));
    }

    @Test
    public void promedio(){
//        colectivo.agregarReview(new Review("user1", "asdf", 4));
//        colectivo.agregarReview(new Review("user2", "hola", 1));
//        colectivo.agregarReview(new Review("user3", "ghjgh", 2));
//        System.out.println(colectivo.getPromedioDeCalificaciones());
//        System.out.println(cgp.getPromedioDeCalificaciones());
//        System.out.println(cgp.getReviews().isEmpty());
    }

    @Test
    public void addAllReviews(){
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("user1", "asdf", 4));
        reviews.add(new Review("user2", "hola", 1));
        reviews.add(new Review("user3", "ghjgh", 2));
//        colectivo.agregarReviews(reviews);
//        colectivo.agregarReview(new Review("user4", "sdsd", 3));
//        System.out.println(colectivo.getReviews().toString());
//        System.out.println(colectivo.getPromedioDeCalificaciones());
    }

    /** Datos muy originales*/
    @Test
    public void serviciosCgp(){
//        cgp.agregarServicio(new Servicio("S1","9 a 15"));
//        cgp.agregarServicio(new Servicio("S2", "10 a 21"));
//        cgp.agregarServicio(new Servicio("S3", "11 a 20"));
//        System.out.println(cgp.getServiciosToString());
    }

    @Test
    public void splitString(){
        String string = "Hola, como estás?";
//        System.out.println(StringUtils.splitUsingTokenizer(",", string));
//        System.out.println(StringUtils.splitUsingTokenizer(",",cgp.getDireccion()));
//        return StringUtils.splitUsingTokenizer("', '",direccion);
    }

    @Test
    public void repo(){
        System.out.println(RepositorioPois.getInstance().getNombreDePois());
        System.out.println(RepositorioPois.getInstance().getPoi((long)3));
//        System.out.println();
    }

}
