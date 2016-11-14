package unsam.edu.ar.pois_app.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RepositorioPois {
    private List<Poi> pois;
    private static final int MAX_RESULTS = 20;//10;
    private static RepositorioPois ourInstance;// = new RepositorioPois();

    private RepositorioPois() {
        pois = new ArrayList<>();
    }

    public static RepositorioPois getInstance() {
        if (ourInstance == null) {
            ourInstance = new RepositorioPois();
            ourInstance.init();
        }
        return ourInstance;
    }

    private void init() {
        final Review opinion1 = new Review("Jaime Talero", "Que buen Poi pero le pongo 1", 1);
        final Review opinion2 = new Review("Susy Lueta", "No me gusto el lugar", 2);
        final Review opinion3 = new Review("Martin Gala", "Vamos con un 3", 3);
        final Review opinion4 = new Review("Juanchi Cato", "Tengo sueño", 4);
        final Review opinion5 = new Review("Guillermo Nigote", "POI recomendado", 5);

        List<Review> reviews1 = new ArrayList<Review>(){{
            add(opinion1);
            add(opinion4);
        }};

        List<Review> reviews2 = new ArrayList<Review>(){{
            add(opinion5);
            add(opinion4);
        }};

        List<Review> reviews3 = new ArrayList<Review>(){{
            add(opinion2);
        }};

        List<Review> reviews4 = new ArrayList<Review>(){{
            add(opinion3);
            add(opinion4);
            add(opinion1);
        }};

        List<Review> reviews5 = new ArrayList<Review>(){{
            add(opinion2);
            add(opinion3);
        }};

        List<Review> reviews6 = new ArrayList<Review>(){{
            add(opinion5);
        }};


        //TODO armar los review y servicios (cgp y banco)
        RepositorioPois.getInstance().agregarPoi(new Colectivo("278", null, null, "2", true, reviews1));
        RepositorioPois.getInstance().agregarPoi(new Colectivo("110", null, null, "6", false, reviews2));
        RepositorioPois.getInstance().agregarPoi(new Colectivo("343", null, null, "9", false, reviews3));
//        RepositorioPois.getInstance().agregarPoi(new Colectivo("278", null, null, true));
//        RepositorioPois.getInstance().agregarPoi(new Colectivo("110", null, null, false));
//        RepositorioPois.getInstance().agregarPoi(new Colectivo("343", null, null , false));
        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Don Manolo", "Quirno 343, Flores", "10:30 a 20:30", false, "Verduleria"));
        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Duomo Gelato", "Gral. Roca 3113, Villa Ballester", "11:00 a 23:30", true, "Heladeria"));
        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Garabombo", "Amerello 900, Flores", "10:00 a 19:00", true, "Libreria"));
        final Banco santander = new Banco("Santander", "Av. Urquiza 4788, Caseros", "09:30 a 18:00", false);
        santander.agregarServicio("Transaccion");
        santander.agregarServicio("Extracción");
        RepositorioPois.getInstance().agregarPoi(santander);
//        RepositorioPois.getInstance().agregarPoi(new Banco("Santander", "Av. Urquiza 4788, Caseros", "09:30 a 18:00", false));
        RepositorioPois.getInstance().agregarPoi(new Banco("Nacion", "Bartolomé Mitre 326, Avellaneda", "09:00 a 15:00", false));
        RepositorioPois.getInstance().agregarPoi(new Banco("Comafi", "Gral. Belgrano 2549, Munro", "08:00 a 15:30", true));
        RepositorioPois.getInstance().agregarPoi(new Banco("Ciudad", "Av. Pres. Juan Domingo Perón 900, San Miguel", "08:45 a 15:30", false));
        RepositorioPois.getInstance().agregarPoi(new Cgp("Madero 3453, La Boca","07:30 a 21:00",true, "2"));
        RepositorioPois.getInstance().agregarPoi(new Cgp("Galvan 3323, Urquiza", "09:30 a 17:30", false, "14"));
        RepositorioPois.getInstance().agregarPoi(new Cgp("Av. Córdoba 5690, Chacarita", "08:00 a 17:00", false, "6"));
    }

    public void agregarPoi(Poi poi){
        poi.setId(getMaximoId());
        pois.add(poi);
    }

    public List<Poi> getPois(String nombre) {
        return getPois(nombre, MAX_RESULTS);
    }

    public List<Poi> getPois(String nombre, int max) {
        Iterator<Poi> it = pois.iterator();
        List<Poi> result = new ArrayList<>();
        while (it.hasNext() && max > 0) {
            Poi poi = it.next();
            max--;
            if (nombre == null || poi.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                result.add(poi);
            }
        }
        return result;
    }

    public Poi getPoi(Long id) {
        for (Poi poi : this.pois) {
            if (poi.getId().equals(id)) {
                return poi;
            }
        }
        return null;
    }

    public Long getMaximoId() {
        return new Long(pois.size() + 1);
    }

    public List<String> getNombreDePois() {
        List<String> result = new ArrayList<>();
        for (Poi poi : this.getPois(null, 10)) {
            result.add(poi.getNombre());
        }
        return result;
    }
}
