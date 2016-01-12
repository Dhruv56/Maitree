package com.example.maitree;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



/**
 * Created by Administrator on 9/11/2015.
 */
public class ListAdapter extends BaseAdapter  {

  //  private Activity mActivity;
    private List<Place> mStudentList;
    private LayoutInflater mLayoutInflater;
    int[] imageid;
    Context context;
    Resources resources;
    int thumbsize=64;

    public ListAdapter(Context context, List<Place> mStudentList,int arr[],Resources resources)
    {
        this.context = context;
        this.imageid=arr;
        this.resources=resources;
        //this.mActivity = (Activity) context;
        this.mStudentList = mStudentList;
        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mStudentList.size();
    }

    @Override
    public Place getItem(int position) {
        return mStudentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder;
        if(convertView==null){
            convertView = mLayoutInflater.inflate(R.layout.custlay,null);
            mViewHolder = new ViewHolder();
            Log.d("listcheck", "adaptercalled");
            mViewHolder.placename = (TextView) convertView.findViewById(R.id.txthead);
            mViewHolder.placetime = (TextView) convertView.findViewById(R.id.txttime);
           // mViewHolder.btnView = (Button) convertView.findViewById(R.id.btnView);
            mViewHolder.placeid= (TextView) convertView.findViewById(R.id.txtid);
            mViewHolder.placeimage= (ImageView) convertView.findViewById(R.id.circleView);
            convertView.setTag(mViewHolder);
       }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();
       }

        mViewHolder.placename.setText(getItem(position).getPlacename());
        mViewHolder.placetime.setText(String.valueOf(getItem(position).getPlacetime()));


       //Bitmap bitmap= BitmapFactory.decodeByteArray(getItem(position).getPlaceicon(), 0, getItem(position).getPlaceicon().length);

    // mViewHolder.placeimage.setImageBitmap(bitmap);
        int k1 =getItem(position).getPlaceid();
        switch (k1)
        {

            case 0:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.four);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }
            case 1:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.one);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }
            case 2:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.two);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }
            case 3:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.three);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }
            case 4:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.five);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }
            case 101:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.akshardham1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }

            case 102:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.gandhi1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                // i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.garden3));
                break;
            }
            case 103:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.guj1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.guj2));
                break;
            }
            case 104:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources,R.drawable.garden1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                // i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.garden2));
                break;
            }
            case 105:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.vintage1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                // i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vintage2));
                break;
            }
            case 106:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources,R.drawable.hathi1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //  i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.hathi2));
                break;
            }
            case 107:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.kalam1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                // i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kalam2));
                break;
            }
            case 108:
            {
                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.sardar1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);

                // i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sardar2));
                break;
            }
            case 109:
            {
                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.triba1);

                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.triba2));
                break;
            }
            case 110:
            {

                Bitmap bit= BitmapFactory.decodeResource(resources, R.drawable.modhera1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.modhera2));
                break;
            }
            case 111:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.mountabu1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit, thumbsize, thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.mountabu2));
                break;
            }
            case 112:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.patola1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                // i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.patola2));
                break;
            }
            case 113:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.rani1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.rani2));
                break;
            }
            case 114:
            {
                Bitmap bit= BitmapFactory.decodeResource(resources, R.drawable.blind1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.blind2));
                break;
            }
            case 115:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources,R.drawable.dilwara1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.dilwara2));
                break;
            }
            case 116:
            {
                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.nakki1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.nakki2));
                break;
            }
            case 117:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.sarkhejroza1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sarkhejroza2));
                break;
            }
            case 118:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.sunset1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sunset2));
                break;
            }
            case 119:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.toadrock1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.toadrock2));
                break;
            }
            case 120:
            {
                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.vishala1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vishal32));
                break;
            }
            case 121:
            {
                Bitmap bit= BitmapFactory.decodeResource(resources, R.drawable.katal1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.katal2));
                break;
            }
            case 122:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.uttarayan1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.uttarayan2));
                break;
            }
            case 123:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.serenity);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                //i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.serenity2));
                break;
            }
            case 124:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.iskonimage1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit, thumbsize, thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 201:
            {

                Bitmap bit= BitmapFactory.decodeResource(resources, R.drawable.adalaj1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 202:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.kankaria1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 203:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.riverfrontpark1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 204:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.sciencecity1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 205:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.ravivari1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 206:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.thol1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 207:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.nal1);
                Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 208:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.mn1);
                        Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 209:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.law1);
                        Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }
            case 210:
            {

                Bitmap bit=BitmapFactory.decodeResource(resources, R.drawable.iim1);
                        Bitmap ThumbImage = ThumbnailUtils.extractThumbnail(bit,thumbsize,thumbsize);
                mViewHolder.placeimage.setImageBitmap(ThumbImage);
                break;

            }


        }
        mViewHolder.placeid.setText(String.valueOf(getItem(position).getPlaceid()));
        convertView.setId(position);
        final int temp = convertView.getId();

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tid = (TextView) v.findViewById(R.id.txtid);

                String pid = tid.getText().toString();

                if(Integer.parseInt(pid) < 50)
                {
                    Intent in = new Intent(context, French_Food.class);
              /*  Bundle b = new Bundle();
                b.putInt("placeID",);*/

                    in.putExtra("pid", Integer.parseInt(pid));
                    //  ListAdapter.this.startActivity(in);
                    in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(in);
                }
                else {
                    Intent in = new Intent(context, FrenchActivity.class);
              /*  Bundle b = new Bundle();
                b.putInt("placeID",);*/
                    in.putExtra("pid", pid);
                    //  ListAdapter.this.startActivity(in);
                    in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(in);
                }

            }
        });


        return convertView;
    }

    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tid= (TextView) view.findViewById(R.id.txtid);
        Toast.makeText(view.getContext(),tid.getText(),Toast.LENGTH_SHORT).show();
        Intent in=new Intent(context,FrenchActivity.class);
        context.startActivity(in);


    }*/

    static class ViewHolder {
        TextView placename;
        TextView placedesc;
        TextView placedate;
        TextView placeid;

        TextView placetime;
        ImageView placeimage;

    }
}
