package unsam.edu.ar.pois_app.adapter;

import android.view.View;

import unsam.edu.ar.pois_app.domain.Poi;

abstract /*public*/ class DetailAdapter {
    abstract View getView(View rootView, Poi poi);

}
