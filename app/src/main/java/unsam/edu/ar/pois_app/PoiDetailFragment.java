package unsam.edu.ar.pois_app;

import android.app.Activity;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import unsam.edu.ar.pois_app.adapter.Review2Adapter;
import unsam.edu.ar.pois_app.adapter.ReviewAdapter;
import unsam.edu.ar.pois_app.domain.Poi;
import unsam.edu.ar.pois_app.dummy.DummyContent;
import unsam.edu.ar.pois_app.utils.StringUtils;

/**
 * A fragment representing a single Poi detail screen.
 * This fragment is either contained in a {@link PoiListActivity}
 * in two-pane mode (on tablets) or a {@link PoiDetailActivity}
 * on handsets.
 */
public class PoiDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Poi poi;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PoiDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
//            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            //String idPoi = getArguments().getString(ARG_ITEM_ID);         //getSerializable en vez de String
//            poi = RepositorioPois.getInstance().getPoi(new Long(idPoi).longValue());

            poi = (Poi) getArguments().get(ARG_ITEM_ID);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(poi.getNombre()); // Titulo barra superior de detalle
            } else {
                activity.setTitle(poi.getNombre());
            }
        }
    }

        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
//            View rootView = inflater.inflate(R.layout.poi_detail, container, false);
            View rootView = inflater.inflate(R.layout.fragment_poi_detail, container, false);
            // Show the dummy content as text in a TextView.
            if (poi != null) {
//                ImageView imgTipo = ((ImageView) rootView.findViewById(R.id.imgTipoPoi));
//                imgTipo.setImageDrawable(getResources().getDrawable(new TipoPoiAdapter().getIconoTipo(poi)));

//                ((TextView) rootView.findViewById(R.id.poi_detail)).setText(poi.getNombre());
//                ((TextView) rootView.findViewById(R.id.poi_detail)).setText("Horario: \n" + poi.getHorario());
//                ((TextView) rootView.findViewById(R.id.poi_detail)).setText("Direccion: \n" + poi.getDireccion());

                ((TextView) rootView.findViewById(R.id.poi_horario)).setText(poi.getHorario());
                ((TextView) rootView.findViewById(R.id.poi_direccion)).setText(poi.getDireccion());
                ((TextView) rootView.findViewById(R.id.poi_particular_nombre)).setText(poi.getNombreDetalleParticular());
                ((TextView) rootView.findViewById(R.id.poi_particular_info)).setText(poi.getDetalleParticular());

                ((CheckBox) rootView.findViewById(R.id.checkbox_favorito)).setChecked(poi.isEstaEnFavoritos());
//                ((RatingBar) rootView.findViewById(R.id.poi_calificacion)).setRating((float) poi.getPromedioDeCalificaciones());
                RatingBar ratingBar = ((RatingBar) rootView.findViewById(R.id.poi_calificacion));
                ratingBar.setRating((float) poi.getPromedioDeCalificaciones());
//                ratingBar.setMinimumWidth(10);
//                ratingBar.setMinimumHeight(10);

//                ((TextView) rootView.findViewById(R.id.poi_promedio)).setText(""+poi.getPromedioDeCalificaciones());
                ((TextView) rootView.findViewById(R.id.poi_promedio)).setText(""+ratingBar.getRating()+" / "+ ratingBar.getNumStars());

//                ProgressBar progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
//                progressBar.setProgress((int) poi.getPromedioDeCalificaciones());

                if(poi.getReviews().isEmpty()){
                    //TODO textview que diga algo como que no tiene reviews?
                } else {
                    ((ListView) rootView.findViewById(R.id.poi_review_list)).setAdapter(new Review2Adapter(getContext(), poi.getReviews()));
                    //TODO ultima version de prueba de la lista de reviews (en fragment_poi_detail creo que sería la opcion3)

                    //TODO lo que está en opcion1 es lo que está en review_row
                }




//                ProgressBar progressBar = ((ProgressBar) rootView.findViewById(R.id.poi_promedio));
//                progressBar.setProgress(poi.getPromedioDeCalificaciones());
//                progressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#80DAEB"),
//                        android.graphics.PorterDuff.Mode.MULTIPLY);

//                hay que hacer un adapter para datos de cada poi?  map que devuelva 1 dato?
//                icono tipo poi?  (adapter --> generos pelicula)


//                ((TextView) rootView.findViewById(R.id.poi_reviews)).setText("Review: \n" + poi.getReviews());
            }
            return rootView;
        }

    }
