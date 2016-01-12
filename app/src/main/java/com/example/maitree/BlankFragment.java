package com.example.maitree;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends android.support.v4.app.Fragment {

    int ICONS[] = {R.drawable.home,R.drawable.users6,R.drawable.silhouette67,R.drawable.notebook91,R.drawable.hands12};
    String mydate;
    String myid;
    ListView listView1;
    public BlankFragment(String mydate,String myid) {
        this.mydate=mydate;
        this.myid = myid;
        // Required empty public constructor
    }
    public BlankFragment(){
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_blank, container, false);
        listView1= (ListView) v.findViewById(R.id.listview1);
        Dbhelper dbhelper=new Dbhelper(getActivity().getApplicationContext());
        String str=getActivity().getLocalClassName();
       // Toast.makeText(getContext(),str,Toast.LENGTH_LONG).show();
        if(str.equalsIgnoreCase("SuggestedPlace")){
            this.mydate="";
            this.myid="225";
        }
        List<Place> list=dbhelper.selectPlace(mydate,myid);
        ListAdapter listAdapter=new ListAdapter(getActivity().getApplicationContext(),list,ICONS,getResources());
        //Log.d("listcheck", "fragmentcalled");
        listView1.setAdapter(listAdapter);
        //listView1.setOnItemClickListener(listAdapter);
        /*listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(),"ha la ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity().getApplicationContext(),FrenchActivity.class);
                startActivity(intent);
            }
        });*/


        return v;
    }


}
