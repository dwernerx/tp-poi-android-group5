package unsam.edu.ar.pois_app.domain;

import java.security.cert.CollectionCertStoreParameters;
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
//Colectivos
//        Colectivo linea278 = new Colectivo("278", null, null, true, "10");
//        linea278.getCalificacion().agregarReviews(reviews1);
//        RepositorioPois.getInstance().agregarPoi(linea278);
////        RepositorioPois.getInstance().agregarPoi(new Colectivo("278", null, null, "10", true, reviews1));
//
//        Colectivo linea110 = new Colectivo("110", null, null, false, "8");
//        linea110.getCalificacion().agregarReviews(reviews2);
//        RepositorioPois.getInstance().agregarPoi(linea110);
////        RepositorioPois.getInstance().agregarPoi(new Colectivo("110", null, null, "8", false, reviews2));
//
//        Colectivo linea343 = new Colectivo("343", null, null, false, "15");
//        linea343.getCalificacion().agregarReviews(reviews3);
//        RepositorioPois.getInstance().agregarPoi(linea343);
////        RepositorioPois.getInstance().agregarPoi(new Colectivo("343", null, null, "15", false, reviews3));
//
//        Colectivo linea78 = new Colectivo("78", null, null, false, "20");
//        linea78.getCalificacion().agregarReviews(reviews5);
//        RepositorioPois.getInstance().agregarPoi(linea78);
////        RepositorioPois.getInstance().agregarPoi(new Colectivo("78", null, null, "20", false, reviews5));
//
//        Colectivo linea237 = new Colectivo("237", null, null, true, "12");
//        linea237.getCalificacion().agregarReviews(reviews6);
//        RepositorioPois.getInstance().agregarPoi(linea237);
////        RepositorioPois.getInstance().agregarPoi(new Colectivo("237", null, null, "12", true, reviews6));
//
////Locales comerciales
//        LocalComercial donManolo = new LocalComercial("Don Manolo", new Direccion("Quirno", 343, "Flores"), new HorarioDeAtencion("10:30", "20:30"), false, "Verduleria");
//        donManolo.getCalificacion().agregarReviews(reviews5);
//        RepositorioPois.getInstance().agregarPoi(donManolo);
////        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Don Manolo", "Quirno 343, Flores", "10:30 a 20:30", false, "Verduleria", reviews5));
//
//        LocalComercial mario = new LocalComercial("Mario", new Direccion("Av. Raúl Scalabrini Ortiz", 1240, "Palermo"), new HorarioDeAtencion("08:00", "20:00"), false, "Vivero");
//        mario.getCalificacion().agregarReviews(reviews1);
//        RepositorioPois.getInstance().agregarPoi(mario);
////        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Mario", "Av. Raúl Scalabrini Ortiz 1240, Palermo", "08:00 a 20:00", false, "Vivero", reviews1));
//
//        LocalComercial duomoGelato = new LocalComercial("Duomo Gelato", new Direccion("Gral. Roca", 3113, "Villa Ballester"), new HorarioDeAtencion("11:00", "23:30"), true, "Heladeria");
//        duomoGelato.getCalificacion().agregarReviews(reviews4);
//        RepositorioPois.getInstance().agregarPoi(duomoGelato);
////        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Duomo Gelato", "Gral. Roca 3113, Villa Ballester", "11:00 a 23:30", true, "Heladeria",reviews4));
//
//        LocalComercial cremolatti = new LocalComercial("Cremolatti", new Direccion("Av. de los Constituyentes", 5999, "Villa Urquiza"), new HorarioDeAtencion("9:00", "21:15"), false, "Heladeria");
//        cremolatti.getCalificacion().agregarReviews(reviews2);
//        RepositorioPois.getInstance().agregarPoi(cremolatti);
////        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Cremolatti", "Av. de los Constituyentes 5999, Villa Urquiza", "9:00 a 21:15", false, "Heladeria", reviews2));
//
//        LocalComercial garabombo = new LocalComercial("Garabombo", new Direccion("Dr. Ramón Carrillo", 2314, "San Martín"), new HorarioDeAtencion("09:00", "19:00"), true, "Libreria");
//        garabombo.getCalificacion().agregarReviews(reviews3);
//        RepositorioPois.getInstance().agregarPoi(garabombo);
////        RepositorioPois.getInstance().agregarPoi(new LocalComercial("Garabombo", "Dr. Ramón Carrillo 2314, San Martín", "09:00 a 19:00", true, "Libreria", reviews3));
//
////Bancos
////        Banco santander = new Banco("Santander", "Av. Urquiza 4788, Caseros", "09:30 a 18:00", false, reviews6);
//        Banco santander = new Banco("Santander", new Direccion("Av. Urquiza", 4788, "Caseros"),new HorarioDeAtencion("09:30", "18:00"), false);
//        santander.getCalificacion().agregarReviews(reviews6);
//        santander.agregarServicio("Transacción");
//        santander.agregarServicio("Extracción");
//        RepositorioPois.getInstance().agregarPoi(santander);
////        Banco nacion = new Banco("Nacion", "Bartolomé Mitre 326, Avellaneda", "09:00 a 15:00", false, reviews3);
//        Banco nacion = new Banco("Nacion", new Direccion("Bartolomé Mitre", 326, "Avellaneda"), new HorarioDeAtencion("09:00", "15:00"), false);
//        santander.getCalificacion().agregarReviews(reviews3);
//        nacion.agregarServicio("Crédito");
//        nacion.agregarServicio("Transacción");
//        nacion.agregarServicio("Extracción");
//        nacion.agregarServicio("Depósito");
//        RepositorioPois.getInstance().agregarPoi(nacion);
////        Banco comafi = new Banco("Comafi", "Gral. Belgrano 2549, Munro", "10:00 a 15:30", true, reviews2);
//        Banco comafi = new Banco("Comafi", new Direccion("Gral. Belgrano", 2549, "Munro"), new HorarioDeAtencion("10:00", "15:30"), true);
//        santander.getCalificacion().agregarReviews(reviews2);
//        comafi.agregarServicio("Crédito");
//        comafi.agregarServicio("Transacción");
//        RepositorioPois.getInstance().agregarPoi(comafi);
////        Banco ciudad = new Banco("Ciudad", "Av. Pres. Juan Domingo Perón 900, San Miguel", "09:45 a 15:30", false,reviews5);
//        Banco ciudad = new Banco("Ciudad", new Direccion("Av. Pres. Juan Domingo Perón", 900, "San Miguel"), new HorarioDeAtencion("09:45", "15:30"), false);
//        santander.getCalificacion().agregarReviews(reviews5);
//        ciudad.agregarServicio("Depósito");
//        ciudad.agregarServicio("Extracción");
//        RepositorioPois.getInstance().agregarPoi(ciudad);
////        Banco galicia = new Banco("Galicia", "Superí 1801, Belgrano", "10:00 a 15:00", true, reviews4);
//        Banco galicia = new Banco("Galicia", new Direccion("Superí", 1801, "Belgrano"), new HorarioDeAtencion("10:00", "15:00"), true);
//        santander.getCalificacion().agregarReviews(reviews4);
//        galicia.agregarServicio("Créditos");
//        RepositorioPois.getInstance().agregarPoi(galicia);
////Cgps
////        Cgp cgp2 = new Cgp("Pres. José E. Uriburu 1022, Recoleta", "9 a 21", false, "2", reviews1);
//        Cgp cgp2 = new Cgp(new Direccion("Pres. José E. Uriburu", 1022, "Recoleta"), null, false, "2");
//        cgp2.getCalificacion().agregarReviews(reviews1);
//        cgp2.agregarServicio(new Servicio("Direcciónn de la Mujer", new HorarioDeAtencion("9:30", "16:30")));
//        cgp2.agregarServicio(new Servicio("Reclamos", new HorarioDeAtencion("8", "17:30")));
//        RepositorioPois.getInstance().agregarPoi(cgp2);
//
////        Cgp cgp3 = new Cgp("Junín 521, Balvanera", "08:00 a 17:00", false, "3", reviews4);
//        Cgp cgp3 = new Cgp(new Direccion("Junín", 521, "Balvanera"), null, false, "3");
//        cgp3.getCalificacion().agregarReviews(reviews4);
//        cgp3.agregarServicio(new Servicio("Cultura ", new HorarioDeAtencion("9", "17")));
//        RepositorioPois.getInstance().agregarPoi(cgp3);
//
////        Cgp cgp6 = new Cgp("Patricias Argentinas 277, Caballito", "08:00 a 17:00", false, "6", reviews2);
//        Cgp cgp6 = new Cgp(new Direccion("Patricias Argentinas", 277, "Caballito"), null, false, "6");
//        cgp6.getCalificacion().agregarReviews(reviews2);
//        cgp6.agregarServicio(new Servicio("Tesorería", new HorarioDeAtencion("9", "14.30")));
//        RepositorioPois.getInstance().agregarPoi(cgp6);
//
////        Cgp cgp13 = new Cgp("Av. Cabildo 3067, Nuñez", "7 a 20", true, "13", reviews6);
//        Cgp cgp13 = new Cgp(new Direccion("Av. Cabildo", 3067, "Nuñez"), null, true, "13");
//        cgp13.getCalificacion().agregarReviews(reviews6);
//        cgp13.agregarServicio(new Servicio("Rentas", new HorarioDeAtencion("8", "17")));
//        cgp13.agregarServicio(new Servicio("Infracciones", new HorarioDeAtencion("8", "20")));
//        cgp13.agregarServicio(new Servicio("Registro Civil", new HorarioDeAtencion("7:30", "18:30")));
//        RepositorioPois.getInstance().agregarPoi(cgp13);
//
////        Cgp cgp14 = new Cgp("Beruti 3325, Palermo", "09:30 a 19:30", false, "14", reviews3);
//        Cgp cgp14 = new Cgp(new Direccion("Beruti", 3325, "Palermo"), null, false, "14");
//        cgp14.getCalificacion().agregarReviews(reviews3);
//        cgp14.agregarServicio(new Servicio("Informes", new HorarioDeAtencion("8", "19")));
//        cgp14.agregarServicio(new Servicio("Controladores", new HorarioDeAtencion("8", "18:30")));
//        cgp14.agregarServicio(new Servicio("Casamientos", new HorarioDeAtencion("9.30", "15.30")));
//        RepositorioPois.getInstance().agregarPoi(cgp14);
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
//        for (Poi poi : this.getPois(null, 10)) {
        for (Poi poi : this.getPois(null, 20)) {
            result.add(poi.getNombre());
        }
        return result;
    }
}
