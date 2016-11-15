package unsam.edu.ar.pois_app.adapter;

import java.util.HashMap;
import java.util.Map;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Poi;

public class TipoPoiAdapter {
    static Map<String, Integer> mapaTipos;

    private Map<String, Integer> getMapaGeneros() {
        if (mapaTipos == null) {
            mapaTipos = new HashMap<String, Integer>();
            mapaTipos.put("Colectivo", R.drawable.ic_bus_48_white);
            mapaTipos.put("Banco", R.drawable.ic_banco_48_white);
            mapaTipos.put("LocalComercial", R.drawable.ic_local_48_white);
            mapaTipos.put("Cgp", R.drawable.ic_comuna_48_white);
        }
        return mapaTipos;
    }

    public int getIconoTipoPoi(Poi poi) {
        Integer result = getMapaGeneros().get(poi.getTipo());
        if (result == null) {
            return R.drawable.ic_map_48_white;
        }
        return result.intValue();
    }
}
