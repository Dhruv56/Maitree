package com.example.maitree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class HostDetail extends AppCompatActivity {

    Toolbar toolbar;
    ListView ll ;
    String[] name = {"Deepika and Virendra Rathod","Megha and Sandeep Sheth","Trupti and Chetan Vora","Denish and Purvish Shah","Aarti and Shailendra Goyal","Shashi and Suresh Karpatiya","Manisha and Nitesh Goswami","Vishakha and Ajay Sanghvi"};
    String[] detail = {"Mr. Virendra Rathod is the founder of maitree at ahmedabad and started in 1993. He was born in bhavnagar and has studied organic chemistry. He was working with Excel Genetics limited and is now a consultant to Transpek Industries Limited.","Sandeep Sheth is a practicing Pathologist managing own laboratory. Megha Sheth is a Physiotherapy lecturer at V S Hospital. They have a son and a daughter. Their daughter recently visited France under exchange program.","Chetan Vora is Finance and Management Consultant at Ahmedabad. Trupti Vora was English professor from Gujarat University. She has learned French. They have two daughters studying in USA.","Purvish Shah apart from running his own business is a fitness geek and runs a lot. Something which cannot be put in numbers. Denish Shah is married to Purvish since January 30, 2011. She has extra-ordinary skills at french and teaches french too. They have a beautful daughter as well.","Shailendra is director at SMG Infosolutions Pvt Ltd. At present, he works as a software professional, leading a team at SMG. At SMG, they develop business applications and provide IT solutions. His hobbies would include cooking, music, gardening and photography amongst others.","Suresh karpatiya studied fine arts from ahmedabad. He is working with Kumbh Design, an advertising agency which operates as renowned leader in the Graphic Design, Website Design, Web Development and Advertising world, helping organizations to achieve their marketing goals and providing robust branding solutions.","Nitesh is ICWA and heads a operations of a speacility coating manufactering multinational company in India. While Manisha is a Physiotherapist. They have a son named Dwij. Both of them are extensively travelled and love to make new friends.","Ajay Sanghvi is an independent financial service professional working in the field of Insurance. Vishakha and Ajay visited France under the exchange program followed by their son. They are extensively travelled family. Their son is currently studying in US."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_detail);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CustomAdapterHost cc = new CustomAdapterHost(HostDetail.this,name,detail);

        ll = (ListView) findViewById(R.id.listView111);
        ll.setAdapter(cc);
    }
}
