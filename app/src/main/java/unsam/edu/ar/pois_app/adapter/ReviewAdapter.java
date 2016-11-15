package unsam.edu.ar.pois_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import unsam.edu.ar.pois_app.R;
import unsam.edu.ar.pois_app.domain.Poi;
import unsam.edu.ar.pois_app.domain.Review;


public class ReviewAdapter extends ArrayAdapter<Review> {

        public ReviewAdapter(Context context, List<Review> reviews) {
//            super(context, R.layout.poi_row, pois);
            super(context, R.layout.fragment_poi_detail, reviews);
        }

        @Override
        public long getItemId(int position) {
            //return position;
            return getItem(position).getId();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View rowView = inflater.inflate(R.layout.fragment_poi_detail, parent, false);
            View rowView = inflater.inflate(R.layout.review_row, parent, false);
            final Review review = getItem(position);

//            TextView usuario = (TextView) rowView.findViewById(R.id.review_usuario);
//            usuario.setText(review.getUsuario());
//            TextView comentario = (TextView) rowView.findViewById(R.id.review_comentario);
//            comentario.setText(review.getComentario());
//            RatingBar calificacion = (RatingBar) rowView.findViewById(R.id.review_calificacion);
//            calificacion.setRating((float) review.getCalificacion());

//            TextView calificacion = (TextView) rowView.findViewById(R.id.calificacion_review);
//            calificacion.setText(review.getCalificacion());

            TextView usuario = (TextView) rowView.findViewById(R.id.review_usuario);
            usuario.setText("* "+review.getUsuario());
            TextView comentario = (TextView) rowView.findViewById(R.id.review_comentario);
            comentario.setText(review.getComentario());
            RatingBar calificacion = (RatingBar) rowView.findViewById(R.id.review_calificacion);
            calificacion.setRating((float) review.getCalificacion());

//            TextView tvActores = (TextView) rowView.findViewById(R.id.lblActores);
//            tvActores.setText(poi.getActores());
            return rowView;
        }

}

