package com.example.maitree;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;


public class Directory extends ActionBarActivity {

    Toolbar toolbar;
    ListView ll ;
    String[] numbers={"9601916787","9898055595","9979156802","9825042385","8460417710","9825025875","9825095001","9687225780","9824003457","9909044770","9898876769","9825087250","9712968496","9376467984","9824321562","9909033291","9879433309","9924992800","9898067783","9913721207","9825884846","9898066794","9824033521","9909020205","9825009342","9898067784","9879796284","9879781325","9327011453","9825322920","9426606306","9408707999","9998026595","9824262936"};
    String[] names={"Aarti Goyal","Ajay Sanghvi","Ananya Parikh","Ashok Patel","Beena Pandya","Bhaskar Bhatt","Chetan Vora","Chirag Pandya","Darshan Parikh","Denish Shah","Dhara Joshi","Gautam Pandya","Hetal Trivedi","Hina Yogesh tank ","Jasmine Mehta","Jitesh Chauhan","Ketki Kathiara","Neelima Parikh","Nilam Desai","Niti Buch","Padmin Buch","Parul Rajyaguru","Paurami Sheth","Purvish Shah","Sanjay Mehta","Shailendra Goyal","Shashi Karpatiya","Suresh Karpatiya","Tejal Bhatt","Trupti Vora","Vaishali Desai","Virendra Rathod","VishakhaSanghvi","Yogesh Tank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CustomAdapter cc = new CustomAdapter(Directory.this,names,numbers);

        ll = (ListView) findViewById(R.id.listView11);
        ll.setAdapter(cc);



    }


}
