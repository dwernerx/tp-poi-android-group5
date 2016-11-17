package unsam.edu.ar.pois_app.adapter;

import android.view.View;
import android.widget.TextView;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Banco;
import unsam.edu.ar.pois_app.domain.Cgp;
import unsam.edu.ar.pois_app.domain.Poi;

public class CgpAdapter extends DetailAdapter {
    @Override
    View getView(View rootView, Poi poi) {
        Cgp cgp = (Cgp) poi;

//        ((TextView) rootView.findViewById(R.id.cgp_direccion)).setText("Direccion: " + poi.getDireccion());
        ((TextView) rootView.findViewById(R.id.cgp_direccion)).setText(poi.getDireccion());

//        ((TextView) rootView.findViewById(R.id.cgp_servicios)).setText("Servicios: " + poi.getServiciosToString());

//        ((TextView) rootView.findViewById(R.id.cgp_servicios)).setText("Servicios: " + cgp.getServiciosToString());
        ((TextView) rootView.findViewById(R.id.cgp_servicios)).setText(cgp.getServiciosToString());

        return rootView;
    }
}
