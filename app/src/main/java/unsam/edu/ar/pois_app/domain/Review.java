package unsam.edu.ar.pois_app.domain;


import java.io.Serializable;

public class Review implements Serializable {
    private Long id;
    private String usuario;
    private int calificacion;
    private String comentario;

    public Review(String usuario, String comentario, int puntaje){
        this.usuario = usuario;
        this.comentario = comentario;
        this.calificacion = puntaje;
    }

    public Long getId(){
        return id;
    }

    public int getCalificacion(){
        return calificacion;
    }

    public String getUsuario(){
        return usuario;
    }

    public String getComentario(){
        return "\t"+comentario;
    }

    @Override
    public String toString(){ //es para probar algo. borrar después
        return "\t" + usuario + "\n\t\t" + comentario /*+ " " + calificacion*/; //TODO ver como lo queremos mostrar
//        return usuario + " " + comentario + " " + calificacion;
    }

    //TODO hacer setters??

}
