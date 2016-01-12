package com.example.maitree;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by dhruv on 1/8/2016.
 */
public class AhmedabadMap extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    PhotoViewAttacher mAttacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedabad_map);
        toolbar= (Toolbar) findViewById(R.id.tool_bar4);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView= (ImageView) findViewById(R.id.imageView2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mAttacher=new PhotoViewAttacher(imageView);

    }
}
