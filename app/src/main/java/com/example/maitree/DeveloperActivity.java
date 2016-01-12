package com.example.maitree;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class DeveloperActivity extends AppCompatActivity {

    private Toolbar toolbar;                              // Declaring the Toolbar Objectt
    ImageView img1, img2, img3, img5, img4;
    int thumbsize=64;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img1 = (ImageView) findViewById(R.id.view);
        img2 = (ImageView) findViewById(R.id.view2);
        img3 = (ImageView) findViewById(R.id.view3);
        img4 = (ImageView) findViewById(R.id.view4);
        img5 = (ImageView) findViewById(R.id.view5);

        Bitmap bit=BitmapFactory.decodeResource(getResources(), R.drawable.bb);
        Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit, thumbsize, thumbsize);
        img1.setImageBitmap(ThumbImage);
        Bitmap bit2=BitmapFactory.decodeResource(getResources(), R.drawable.meeeeee);
        Bitmap ThumbImage2 = ThumbnailUtils.extractThumbnail(bit2, thumbsize, thumbsize);
        img2.setImageBitmap(ThumbImage2);
        Bitmap bit3=BitmapFactory.decodeResource(getResources(), R.drawable.aa);
        Bitmap ThumbImage3 = ThumbnailUtils.extractThumbnail(bit3, thumbsize, thumbsize);
        img3.setImageBitmap(ThumbImage3);
        Bitmap bit4=BitmapFactory.decodeResource(getResources(), R.drawable.cc);
        Bitmap ThumbImage4 = ThumbnailUtils.extractThumbnail(bit4, thumbsize, thumbsize);
        img4.setImageBitmap(ThumbImage4);
        Bitmap bit5=BitmapFactory.decodeResource(getResources(), R.drawable.hh);
        Bitmap ThumbImage5 = ThumbnailUtils.extractThumbnail(bit5, thumbsize, thumbsize);
        img5.setImageBitmap(ThumbImage5);

    }
}
