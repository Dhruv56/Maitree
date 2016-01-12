package com.example.maitree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by dhruv on 1/8/2016.
 */
public class GujaratMap extends AppCompatActivity{
    Toolbar toolbar;
    ImageView imageView;
    PhotoViewAttacher mAttacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat_map);
        toolbar= (Toolbar) findViewById(R.id.tool_bar5);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView= (ImageView) findViewById(R.id.imageView3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mAttacher=new PhotoViewAttacher(imageView);

    }
}

