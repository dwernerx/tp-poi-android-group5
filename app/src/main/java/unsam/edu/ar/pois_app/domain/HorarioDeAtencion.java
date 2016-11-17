package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;

public class HorarioDeAtencion  implements Serializable{
    private String inicio;
    private String fin;

    public HorarioDeAtencion (String inicio, String fin){
        this.inicio = inicio;
        this.fin = fin;
    }

//    @Override
    public String toString(){
        if(inicio == null && fin == null){
            return "";
        } else {
            return inicio + " a " + fin + " hs.";
        }
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }
}
