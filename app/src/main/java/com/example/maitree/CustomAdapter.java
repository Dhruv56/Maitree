package com.example.maitree;

/**
 * Created by Dalwadi on 21-09-2015.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    public String join ="+91";
    String[] contactname;
    Context context;
    String[] contactnuber;
    private static LayoutInflater inflater = null;

    public CustomAdapter(Context mainActivity, String[] prgmNameList, String[] sin) {
        // TODO Auto-generated constructor stub
        contactname = prgmNameList;
        contactnuber = sin;
        context = mainActivity;

        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return contactname.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {

        TextView name,  numer;


        Holder(View v) {
            name = (TextView) v.findViewById(R.id.mytext);
            numer = (TextView) v.findViewById(R.id.price);
        }

    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = null;

        final View row;

        if (convertView == null) {

            row = inflater.inflate(R.layout.single_item_lay, parent,false);
            holder = new Holder(row);

            row.setTag(holder);
        } else {
            row = convertView;
            holder = (Holder) row.getTag();
        }

        holder.numer.setText(join + String.valueOf(contactnuber[position]));
        holder.name.setText(contactname[position]);

        row.setId(position);

        final String aa = contactnuber[position];
        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(context, "" + aa, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+aa));
                context.startActivity(Intent.createChooser(intent,"Choose Dialier app"));
            }
        });
        return row;

    }


}