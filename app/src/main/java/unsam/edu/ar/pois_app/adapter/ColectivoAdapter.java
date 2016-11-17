package unsam.edu.ar.pois_app.adapter;

import android.view.View;
import android.widget.TextView;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Colectivo;
import unsam.edu.ar.pois_app.domain.Poi;

public class ColectivoAdapter extends DetailAdapter {
    @Override
    View getView(View rootView, Poi poi) {
//        Colectivo coletivo = (Colectivo) poi;
//        ((TextView) rootView.findViewById(R.id.colectivo_paradas)).setText("Cantidad de paradas: " + coletivo.getCantidadDeParadas()/* + "\n"*/);
//        ((TextView) rootView.findViewById(R.id.colectivo_paradas)).setText(coletivo.getCantidadDeParadas());
        ((TextView) rootView.findViewById(R.id.colectivo_paradas)).setText(poi.getCantidadDeParadas());
//        ((TextView) rootView.findViewById(R.id.colectivo_paradas)).setText("Cantidad de paradas: " + poi.getCantidadDeParadas()/* + "\n"*/);
        return rootView;
    }
}
