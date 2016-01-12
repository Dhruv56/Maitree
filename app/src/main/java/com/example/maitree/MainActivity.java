package com.example.maitree;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends ActionBarActivity{

    Context context;
    ArrayList prgmName;
    String TITLES[] = {"Home","About Host","Suggested Places","Suggested Dishes","Maps","About Maitree","About Developer","Contact Details","Full Schedule","Share"};
    int ICONS[] = {R.drawable.ic_home_black_18dp,R.drawable.users6,R.drawable.modern11,R.drawable.food,R.drawable.mapmarker,R.drawable.hand220,R.drawable.silhouette67,R.drawable.user81,R.drawable.notebook91,R.drawable.ic_share_3x};

    //Similarly we Create a String Resource for the name and email in the header view
    //And we also create a int resource for profile picture in the header view

    String NAME = "Maitree";
    String EMAIL = "Cultural Exchange Group";
    int PROFILE = R.drawable.ahahhahah;

    private Toolbar toolbar;                              // Declaring the Toolbar Objectt

    RecyclerView mRecyclerView;                           // Declaring RecyclerView
    RecyclerView.Adapter mAdapter;                        // Declaring Adapter For Recycler View
    RecyclerView.LayoutManager mLayoutManager;            // Declaring Layout Manager as a linear layout manager
    DrawerLayout Drawer;                                  // Declaring DrawerLayout
    ActionBarDrawerToggle mDrawerToggle;                  // Declaring Action Bar Drawer Toggle
    Dbhelper dbhelper;

    private ViewPager mPager;
    private SlidingTabLayout mTabs;

    private String[] tabs = { "Today", "Tomorrow", "Thisday" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        //codestar
        dbhelper=new Dbhelper(this);
        String day = new SimpleDateFormat("dd").format(new Date());
        int i=Integer.parseInt(day);

       // dbhelper.insertPlace();
        mPager= (ViewPager) findViewById(R.id.pager);
        mTabs= (SlidingTabLayout) findViewById(R.id.tabs);
        mPager.setAdapter(new TabsPagerAdapter(getSupportFragmentManager(), dbhelper.tabcount(), dbhelper.numTab()));
        mTabs.setViewPager(mPager);
        mTabs.setDistributeEvenly(true);
        if(i>=13 && i<23) {
            i = i - 13;
            mPager.setCurrentItem(i);
        }


        //codeend

        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView); // Assigning the RecyclerView Object to the xml View

        mRecyclerView.setHasFixedSize(true);                            // Letting the system know that the list objects are of fixed size

        mAdapter = new MyAdapter(TITLES, ICONS, NAME, EMAIL, PROFILE);       // Creating the Adapter of MyAdapter class(which we are going to see in a bit)
        // And passing the titles,icons,header view name, header view email,
        // and header view profile picture

        mRecyclerView.setAdapter(mAdapter);                              // Setting the adapter to RecyclerView

        mLayoutManager = new LinearLayoutManager(this);                 // Creating a layout Manager

        mRecyclerView.setLayoutManager(mLayoutManager);                 // Setting the layout Manager



        Drawer = (DrawerLayout) findViewById(R.id.DrawerLayout);        // Drawer object Assigned to the view
        mDrawerToggle = new ActionBarDrawerToggle(this, Drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // code here will execute once the drawer is opened( As I dont want anything happened whe drawer is
                // open I am not going to put anything here)
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Code here will execute once drawer is closed
            }


        }; // Drawer Toggle Object Made
        Drawer.setDrawerListener(mDrawerToggle); // Drawer Listener set to the Drawer toggle
        mDrawerToggle.syncState();

    }



    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                MainActivity.this);

        alertDialogBuilder.setTitle("Are you sure want to exit?");
        alertDialogBuilder.setIcon(R.drawable.exiticon);
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        //  close current activity
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }



}
