package unsam.edu.ar.pois_app.domain;

import java.io.Serializable;

public class Punto implements Serializable {

    String x;
    String y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
