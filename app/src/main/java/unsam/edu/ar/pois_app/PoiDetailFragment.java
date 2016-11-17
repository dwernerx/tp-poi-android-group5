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
import unsam.edu.ar.pois_app.adapter.TipoPoiAdapter;
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
    private View rootView;
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
            TipoPoiAdapter tipoAdapter = new TipoPoiAdapter();
//            View rootView = inflater.inflate(R.layout.fragment_poi_detail, container, false);

            this.rootView = inflater.inflate(tipoAdapter.getLayoutTipo(poi), container, false);

//            if (poi != null) {

//                ((TextView) rootView.findViewById(R.id.poi_horario)).setText(poi.getHorario());
//                ((TextView) rootView.findViewById(R.id.poi_direccion)).setText(poi.getDireccion());
//                ((TextView) rootView.findViewById(R.id.poi_dato_particular_nombre)).setText(poi.getNombreDetalleParticular());
//                ((TextView) rootView.findViewById(R.id.poi_dato_particular_info)).setText(poi.getDetalleParticular());


                //Informacion que muestran todos los pois
//                ImageView imgPoi = (ImageView) rootView.findViewById(R.id.img_tipo_poi);
//                imgPoi.setImageResource(new TipoPoiAdapter().getIconoTipo(poi));

//                ((TextView) rootView.findViewById(R.id.titulo)).setText("INFORMACIÓN:"); //TODO o detalles?
//                ((TextView) rootView.findViewById(R.id.tipo)).setText("Tipo: " + poi.getTipo() + "\n");


                ((CheckBox) rootView.findViewById(R.id.checkbox_favorito)).setChecked(poi.isEstaEnFavoritos());

                RatingBar ratingBar = ((RatingBar) rootView.findViewById(R.id.poi_calificacion_general));
                ratingBar.setRating((float) poi.getCalificacion().getPromedioDeCalificaciones());
                ((TextView) rootView.findViewById(R.id.poi_promedio)).setText(""+ratingBar.getRating()+" / "+ ratingBar.getNumStars());

//                ((TextView) rootView.findViewById(R.id.reviews)).setText("Reviews: \n" + poi.getCalificacion().getReviewsToString());
                ((TextView) rootView.findViewById(R.id.poi_reviews)).setText(poi.getCalificacion().getReviewsToString());

                /** Información particular del tipo de poi**/
                tipoAdapter.getViewDetailTipo(rootView, poi);


//                ((TextView) rootView.findViewById(R.id.poi_reviews)).setText("Review: \n" + poi.getReviews());
//            }
            return rootView;
        }

    }
