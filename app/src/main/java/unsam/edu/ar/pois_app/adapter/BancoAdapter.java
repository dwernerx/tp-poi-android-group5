package unsam.edu.ar.pois_app.adapter;

import android.view.View;
import android.widget.TextView;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Banco;
import unsam.edu.ar.pois_app.domain.Poi;

public class BancoAdapter extends DetailAdapter {
    @Override
    View getView(View rootView, Poi poi) {
//        ((TextView) rootView.findViewById(R.id.banco_direccion)).setText("Direccion: " + poi.getDireccion());
//        ((TextView) rootView.findViewById(R.id.banco_horario)).setText("Horario: " + poi.getHorario());
        ((TextView) rootView.findViewById(R.id.banco_direccion)).setText(poi.getDireccion());
        ((TextView) rootView.findViewById(R.id.banco_horario)).setText(poi.getHorario());

//        ((TextView) rootView.findViewById(R.id.banco_servicios)).setText("Servicios: " + poi.getServiciosToString());
        Banco banco = (Banco) poi;
//        ((TextView) rootView.findViewById(R.id.banco_servicios)).setText("Servicios: " + banco.getServiciosToString());
        ((TextView) rootView.findViewById(R.id.banco_servicios)).setText(banco.getServiciosToString());
        //TODO o hacemos metodos abstractos y cada poi devuelven los servicios o "No se encontraron servicios" o usamos solo Poi ??

        return rootView;
    }
}
