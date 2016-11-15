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
import unsam.edu.ar.pois_app.domain.Review;


public class Review2Adapter extends /*BaseAdapter*/ ArrayAdapter<Review> {

//    private Context context;
//    private List<Review> items;

    public Review2Adapter(Context context, List<Review> objects) {
        super(context,R.layout.review_row ,objects);
    }

//    public Review2Adapter(Context context, List<Review> items) {
//        this.context = context;
//        this.items = items;
//    }

//    @Override
//    public int getCount() {
//        return this.items.size();
//    }

//    @Override
//    public Review getItem(int position) {
//        return this.items.get(position);
//    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
//        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        View rowView = convertView;
//
//        if (convertView == null) {
//            // Create a new view into the list.
//            LayoutInflater inflater = (LayoutInflater) /*context*/ getContext()
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            rowView = inflater.inflate(R.layout.review_row, parent, false);
//        }

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.review_row, parent, false);

        // Set data into the view.
//        ImageView ivItem = (ImageView) rowView.findViewById(R.id.ivItem);
//        TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
//
//        Item item = this.items.get(position);
//        tvTitle.setText(item.getTitle());
//        ivItem.setImageResource(item.getImage());

        final Review review = getItem(position);

        TextView usuario = (TextView) rowView.findViewById(R.id.review_usuario);
        usuario.setText("* "+review.getUsuario());
        TextView comentario = (TextView) rowView.findViewById(R.id.review_comentario);
        comentario.setText(review.getComentario());
        RatingBar calificacion = (RatingBar) rowView.findViewById(R.id.review_calificacion);
        calificacion.setRating((float) review.getCalificacion());

        return rowView;
    }

}
