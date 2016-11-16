package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private int numero;
    private String barrio;

    public Direccion(String calle, int numero, String barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return calle + " " + numero + ", " + barrio;
    }
}
