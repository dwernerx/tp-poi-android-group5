package unsam.edu.ar.pois_app.service;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import unsam.edu.ar.pois_app.domain.Poi;

public interface PoiService {
    @GET("/buscador")
    Call<List<Poi>> getPois();

}
