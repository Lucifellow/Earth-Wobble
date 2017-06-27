package tk.gamelucifellow.earthwobble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<EarthWobble> earthquakes = QueryUtils.extractEarthquakes();
        //wobble.add(new EarthWobble("7.2","San Francisco","Feb,2 2016"));
        //wobble.add(new EarthWobble("6.1","London","July 20,2015"));
        //wobble.add(new EarthWobble("3.9","Tokyo","Nov 10,2014"));
        //wobble.add(new EarthWobble("5.4","Mexico","May 3,2014"));
        //wobble.add(new EarthWobble("2.8","Moscow","Jan 31,2013"));
        //wobble.add(new EarthWobble("4.9","Rio de Janeiro","Aug 19,2012"));
        //wobble.add(new EarthWobble("1.6","Paris","Oct 30,2011"));


        ListView wobbleListView = (ListView) findViewById(R.id.list);
        EarthWobbleAdapter adapter=new EarthWobbleAdapter(this,earthquakes);
        wobbleListView.setAdapter(adapter);
    }
}