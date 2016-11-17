package unsam.edu.ar.pois_app.adapter;

import android.view.View;
import android.widget.TextView;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Poi;

public class LocalComercialAdapter extends DetailAdapter{
    @Override
    View getView(View rootView, Poi poi) {
        ((TextView) rootView.findViewById(R.id.local_comercial_direccion)).setText(poi.getDireccion());
        ((TextView) rootView.findViewById(R.id.local_comercial_horario)).setText(poi.getHorario());
        ((TextView) rootView.findViewById(R.id.local_comercial_rubro)).setText(poi.getRubro());

        return rootView;
    }
}
