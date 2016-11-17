package unsam.edu.ar.pois_app.adapter;

import android.view.View;
import android.widget.TextView;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Poi;

public class CgpAdapter extends DetailAdapter {
    @Override
    View getView(View rootView, Poi poi) {
        ((TextView) rootView.findViewById(R.id.cgp_direccion)).setText(poi.getDireccion());
        ((TextView) rootView.findViewById(R.id.cgp_servicios)).setText(poi.getServicios());

        return rootView;
    }
}
