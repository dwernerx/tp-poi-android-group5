package unsam.edu.ar.pois_app.service;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import unsam.edu.ar.pois_app.domain.Poi;

public interface PoisService {
//    @GET("peliculas/{tituloContiene}")
//    public Call<List<Pelicula>> getPeliculas(@Path("tituloContiene") String tituloContiene);

    //TODO lo hice a modo de ejemplo, basandome en el de peliculas
    @GET("pois/{nombreContiene}")
    public Call<List<Poi>> getPois(@Path("nombreContiene") String nombreContiene);

    //TODO con solo el get alcanza no?    hay que hacer la busqueda?

    @GET("/buscador")
    Call<List<Poi>> getPois();
}
