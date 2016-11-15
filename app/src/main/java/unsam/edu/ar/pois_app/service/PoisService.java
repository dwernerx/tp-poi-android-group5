package unsam.edu.ar.pois_app.service;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import unsam.edu.ar.pois_app.domain.Poi;

public interface PoisService {
//    @GET("peliculas/{tituloContiene}")
//    public Call<List<Pelicula>> getPeliculas(@Path("tituloContiene") String tituloContiene);

//    @GET("pois/buscador/{nombreContiene}")
    @GET("buscador/{nombreContiene}")
    public Call<List<Poi>> getPois(@Path("nombreContiene") String nombreContiene);

//    @GET("pois/buscador")
//    public Call<List<Poi>> getPois();

    @GET("buscador")
    public Call<List<Poi>> getPois();
}
