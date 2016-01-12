package com.example.maitree;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class FoodList extends ActionBarActivity {

    ListView foodlist;
    Toolbar toolbar;
    List<Place> mlist;
    String[] foodname,foodtime,foodid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        foodlist = (ListView) findViewById(R.id.foodlist);
        toolbar= (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mlist=new ArrayList<>();
        foodname=new String[]{"Dhokla","Khandvi","Gujarati Thali","Basundi","Kebabs and Chicken"};
        foodtime=new String[]{"at Das Surti Khaman Wala","at Das Surti Khaman Wala","at Ame Gujarati","at Murlidhar Sweets & Icecream","at Bhatiyar Gully"};
        foodid=new String[foodname.length];
        for(int i=0;i<foodname.length;i++){
            Place mplace=new Place();
            mplace.setPlacename(foodname[i]);
            mplace.setPlacetime(foodtime[i]);
            mplace.setPlaceid(i);
            mlist.add(mplace);
        }
        int ICONS[] = {R.drawable.home,R.drawable.users6,R.drawable.silhouette67,R.drawable.notebook91,R.drawable.hands12};
        ListAdapter adapter=new ListAdapter(this,mlist,ICONS,getResources());
        foodlist.setAdapter(adapter);

    }

}