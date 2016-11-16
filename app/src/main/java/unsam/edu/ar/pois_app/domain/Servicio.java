package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;

public class Servicio implements Serializable{
    private String nombre;
    private String horario;

    public Servicio(String nombre_, String horario_){
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
        return this.horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    @Override
    public String toString(){
        return nombre + " " + horario/* + " hs."*/;
    }
}
