package unsam.edu.ar.pois_app.domain;


import java.io.Serializable;

public class Review implements Serializable {
//    private Long id;
    private String nombreDeUsuario;
    private int puntuacion;
    private String comentario;

    public Review(String nombreDeUsuario, String comentario, int puntuacion){
        this.nombreDeUsuario = nombreDeUsuario;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }

//    public Long getId(){
//        return id;
//    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public String getNombreDeUsuario(){
        return nombreDeUsuario;
    }

    public String getComentario(){
        return "\t"+comentario;
    }

    @Override
    public String toString(){
//        return "\t" + nombreDeUsuario + "\n\t\t" + comentario /*+ " " + puntuacion*/; //TODO ver como lo queremos mostrar (prueba)
//        return nombreDeUsuario + " " + comentario + " " + puntuacion;

        return "\n Usuario: " + nombreDeUsuario + "\n Comentario: " + comentario + "\n Puntuacion: " + puntuacion + "\n";
    }


}
