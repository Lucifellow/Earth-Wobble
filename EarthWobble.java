package tk.gamelucifellow.earthwobble;

/**
 * Created by vyash on 6/20/2017.
 */

public class EarthWobble {
    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public EarthWobble(String magnitude,String location,String date){

            mMagnitude=magnitude;
            mLocation=location;
            mDate=date;
    }

    public String getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public String getDate(){return mDate;}

}
