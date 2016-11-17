package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;

public class Servicio implements Serializable{
    private String nombre;
    private /*String*/HorarioDeAtencion horario;

    public Servicio(String nombre_, /*String*/HorarioDeAtencion horario_){
        this.nombre = nombre_;
        this.horario = horario_;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
         this.nombre = nombre;
    }

    public String getHorario(){
        return horario.toString();
//        return this.horario;
    }

    public void setHorario(/*String*/HorarioDeAtencion horario){
        this.horario = horario;
    }

    @Override
    public String toString(){
        return nombre + " " + horario.toString()/* + " hs."*/;
    }
}
