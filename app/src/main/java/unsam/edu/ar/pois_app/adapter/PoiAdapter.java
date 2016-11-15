package unsam.edu.ar.pois_app.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Poi;

public class PoiAdapter extends ArrayAdapter<Poi> {

    public PoiAdapter(Context context, List<Poi> pois) {
        super(context, R.layout.poi_row, pois);
    }
//    private TipoPoiAdapter tipoPoiAdapter = new TipoPoiAdapter();

    @Override
    public long getItemId(int position) {
        //return position;
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.poi_row, parent, false);
        final Poi poi = getItem(position);

        TextView tvPoi = (TextView) rowView.findViewById(R.id.lblPoi);
        tvPoi.setText(poi.getNombre());

//        int img = tipoPoiAdapter.getIconoTipoPoi(poi);
        ImageView imgTipo = ((ImageView) rowView.findViewById(R.id.img_tipo_poi));
//        imgTipo.setImageDrawable(getDrawable(tipoPoiAdapter.getIconoTipoPoi(poi)));
        imgTipo.setImageDrawable(getContext().getResources().getDrawable(new TipoPoiAdapter().getIconoTipoPoi(poi)));

//            TextView tvActores = (TextView) rowView.findViewById(R.id.lblActores);
//            tvActores.setText(poi.getActores());
        return rowView;
    }
}

