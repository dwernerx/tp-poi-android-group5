package unsam.edu.ar.pois_app.adapter;

import android.view.View;

import java.util.HashMap;
import java.util.Map;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Poi;

public class TipoPoiAdapter {
    static Map<String, Integer> mapaTipoIcon;
    static Map<String, Integer> mapaTipoLayout;
    static Map<String, DetailAdapter> mapaTipoViewDetail;

    private Map<String, Integer> getMapaTipoIcon() {
        if (mapaTipoIcon == null) {
            mapaTipoIcon = new HashMap<String, Integer>();
            mapaTipoIcon.put("Colectivo", R.drawable.ic_bus_48_white);
            mapaTipoIcon.put("Banco", R.drawable.ic_banco_48_white);
            mapaTipoIcon.put("LocalComercial", R.drawable.ic_local_48_white);
            mapaTipoIcon.put("Cgp", R.drawable.ic_comuna_48_white);
        }
        return mapaTipoIcon;
    }

    public int getIconoTipo(Poi poi) {
        Integer result = getMapaTipoIcon().get(poi.getTipo());
        if (result == null) {
            return R.drawable.ic_map_48_white;
        }
        return result.intValue();
    }

    private Map<String, Integer> getMapaTipoLayout() {
        if (mapaTipoLayout == null) {
            mapaTipoLayout = new HashMap<String, Integer>();
            mapaTipoLayout.put("Colectivo", R.layout.colectivo_detail);
            mapaTipoLayout.put("Cgp", R.layout.cgp_detail);
            mapaTipoLayout.put("Banco", R.layout.banco_detail);
            mapaTipoLayout.put("LocalComercial", R.layout.local_comercial_detail);

        }
        return mapaTipoLayout;
    }

    public int getLayoutTipo(Poi poi) {
        Integer result = getMapaTipoLayout().get(poi.getTipo());
//        if (result == null) {
//            return R.layout.colectivo_detail;
//        } //TODO
        return result.intValue();
    }

    private Map<String, DetailAdapter> getMapaTipoView(View rootView, Poi poi) {
        if (mapaTipoViewDetail == null) {
            mapaTipoViewDetail = new HashMap<String, DetailAdapter>();
            mapaTipoViewDetail.put("Colectivo", new ColectivoAdapter());
            mapaTipoViewDetail.put("Cgp", new CgpAdapter());
            mapaTipoViewDetail.put("Banco", new BancoAdapter());
            mapaTipoViewDetail.put("LocalComercial",  new LocalComercialAdapter());

        }
        return mapaTipoViewDetail;
    }

    public void getViewDetailTipo(View rootView, Poi poi) {

        DetailAdapter adapterView = getMapaTipoView(rootView, poi).get(poi.getTipo());

        /** se creo una clase abstract DetalleAdapter de la cual los demas adapter extienden y se puede crear ese objeto. Aparentemente fue necesario tambien
         porque java perdia la referencia del objeto poi. ;) CJuhal  **/

        adapterView.getView(rootView,poi);
    }
}
