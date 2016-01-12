package com.example.maitree;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Hello on 17-12-2015.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    private String[] tabs;
    int daydate,temp,count,currentdate,month;
    String date,cdate;
    List<Place> myPlace;
    public TabsPagerAdapter(FragmentManager fm,int i,List<Place> myPlace) {
        super(fm);
        daydate= Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
        currentdate=daydate;
        date = new SimpleDateFormat("yyyy").format(new Date());
        daydate=13;
        month=01;
        count=i-1;
        this.myPlace=myPlace;
        tabs= new String[]{"Today", "Tomorrow", date};
    }

    @Override
    public Fragment getItem(int position) {

        temp=daydate+position;
        cdate=myPlace.get(position).getPlacedate();
        Log.d("listcheck",cdate);
        // Top Rated fragment activity
        return new BlankFragment(cdate,"125");


    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        temp=daydate+position;
        cdate=myPlace.get(position).getPlacedate();
        if(temp==currentdate)
            return "Today";
        else if (temp==(currentdate+1))
            return "Tommorrow";
        else
            return cdate;

    }
}
