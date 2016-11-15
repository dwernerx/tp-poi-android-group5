package unsam.edu.ar.pois_app.domain;


public class Servicio {
    private String nombre;
//    private HorarioDeAtencion horario;
    private String horario;

    public Servicio(String nombre_, /*HorarioDeAtencion*/String horario_){
        this.nombre = nombre_;
        this.horario = horario_;
    }

//    public Boolean estaDisponible(/*Date*/String unHorario) {
//        return this.horario.estaDisponible(unHorario);
//    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
         this.nombre = nombre;
    }

    public String getHorario(){
        return this.nombre;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    @Override
    public String toString(){
        return nombre + "  " + horario + " hs.";
    }
}
