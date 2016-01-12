package com.example.maitree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by dhruv on 1/8/2016.
 */
public class MapActivity extends AppCompatActivity {

    ImageButton i1,i2;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        i1 = (ImageButton) findViewById(R.id.imageButton);
        i2 = (ImageButton) findViewById(R.id.imageButton1);

    }

    public void ahmedabad(View view) {
            Intent i = new Intent(getApplicationContext(),AhmedabadMap.class);
            startActivity(i);
    }

    public void gujarat(View view) {
            Intent i1 = new Intent(getApplicationContext(),GujaratMap.class);
            startActivity(i1);
    }
}
