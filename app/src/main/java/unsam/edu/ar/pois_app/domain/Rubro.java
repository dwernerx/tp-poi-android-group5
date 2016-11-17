package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;

public class Rubro implements Serializable {
    String nombre;
    String cercania;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCercania() {
        return cercania;
    }

    public void setCercania(String cercania) {
        this.cercania = cercania;
    }
}
