package tk.gamelucifellow.earthwobble;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vyash on 6/20/2017.
 */

public class EarthWobbleAdapter extends ArrayAdapter<EarthWobble> {

public EarthWobbleAdapter(Context context,List<EarthWobble> wobble){
    super(context,0,wobble);

}
public View getView(int position, View convetView, ViewGroup parent){
    View listItemView=convetView;
    if(listItemView==null){
        listItemView= LayoutInflater.from(getContext()).inflate(
         R.layout.earthwobble_list_item,parent,false
            );
    }
    EarthWobble currentEarthquake=getItem(position);
    TextView magnitudeView=(TextView)listItemView.findViewById(R.id.magnitude);
    magnitudeView.setText(currentEarthquake.getMagnitude());
    TextView locationView=(TextView)listItemView.findViewById((R.id.location));
    locationView.setText(currentEarthquake.getLocation());
    TextView dateView=(TextView)listItemView.findViewById(R.id.date);
    dateView.setText(currentEarthquake.getDate());
    return listItemView;
}
}
