package unsam.edu.ar.pois_app.domain;


import java.io.Serializable;

public class Review implements Serializable {
    private Long id;
    private String usuario;
    private int puntuacion;
    private String comentario;

    public Review(String usuario, String comentario, int puntuacion){
        this.usuario = usuario;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }

    public Long getId(){
        return id;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public String getUsuario(){
        return usuario;
    }

    public String getComentario(){
        return "\t"+comentario;
    }

    @Override
    public String toString(){
//        return "\t" + usuario + "\n\t\t" + comentario /*+ " " + puntuacion*/; //TODO ver como lo queremos mostrar (prueba)
//        return usuario + " " + comentario + " " + puntuacion;

        return "\n Usuario: " + usuario + "\n Comentario: " + comentario + "\n Puntuacion: " + puntuacion + "\n";
    }


}
