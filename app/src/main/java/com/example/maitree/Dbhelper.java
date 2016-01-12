package com.example.maitree;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hello on 14-12-2015.
 */
public class Dbhelper extends SQLiteOpenHelper {
    int checkdb = 0;
    public static final String dbname = "Maitry";
    public static final String placedetail = "PlaceDetails";
    public static final String guidedetail = "GuideDetails";
    public static final String hostdetail = "HostDetails";
    public static final String placeid = "place_id";
    public static final String placename = "place_name";
    public static final String placedesc = "place_desc";
    public static final String placedate = "place_date";
    public static final String placetime = "place_time";
    public static final String placeextra = "place_extra";
    public static final String placeicon = "place_icon";
    public static final String placeimage1 = "place_image";
    public static final String placeimage2 = "place_image2";
    public static final String placeimage3 = "place_image3";
    public static final String placefact = "place_fact";
    public static final String guideid = "guide_id";
    public static final String guidename = "guide_name";
    public static final String guidemob = "guide_mob";
    public static final String hostid = "host_id";
    public static final String hostname = "host_name";
    public static final String hostadd = "host_add";
    public static final String hostmob = "host_mob";
    public static final String hostdesc = "host_desc";
    int i;

    public Dbhelper(Context context) {

            super(context, dbname, null, 9);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL("CREATE TABLE " + placedetail + " (" + placeid + " INTEGER PRIMARY KEY," + placename + " TEXT," + placedesc + " TEXT(1999)," + placeextra + " TEXT(1999),"  + placedate + " TEXT," + placetime + " TEXT," + placeicon + " BLOB," + placeimage1 + " BLOB," + placeimage2 + " BLOB," + placeimage3 + " BLOB)");
            db.execSQL("CREATE TABLE " + hostdetail + " (" + hostid + " INTEGER PRIMARY KEY," + hostname + " TEXT," + hostadd + " TEXT," + hostmob + " TEXT," + hostdesc + " TEXT)");
            db.execSQL("CREATE TABLE " + guidedetail + " (" + guideid + " INTEGER PRIMARY KEY," + guidename + " TEXT," + guidemob + " TEXT," + placeid + " TEXT)");
        } catch (Exception e) {
            //
            Log.d("dbhelper", "oncreateerro");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL("DROP TABLE IF EXISTS" + placedetail);
            db.execSQL("DROP TABLE IF EXISTS" + hostdetail);
            db.execSQL("DROP TABLE IF EXISTS" + guidedetail);

            onCreate(db);
        } catch (Exception e) {
            Log.d("dbhelper", "onupgrade");
        }

    }

    public Place getplacedetail(String id) {
        SQLiteDatabase db = getReadableDatabase();

        String[] param = {id};
        Cursor mCursor = db.rawQuery("SELECT " + placeid + "," + placename + "," + placedesc + "," + placeextra + "," + placedate + "," + placetime + " FROM " + placedetail + " WHERE " + placeid + "=?", param);
//        Cursor mCursor1= db.rawQuery("SELECT " + placeimage1 + "," + placeimage2 + "," + placeimage3 + " FROM " + placedetail + " WHERE " + placeid + "=?", param);
        mCursor.moveToFirst();
//        mCursor1.moveToFirst();

        try {
            if (mCursor.getCount()>=1 || mCursor.getCount()<1 ) {

                Place mplace = new Place();
                mplace.setPlaceid(mCursor.getInt(mCursor.getColumnIndex(placeid)));
                mplace.setPlacename(mCursor.getString(mCursor.getColumnIndex(placename)));
                mplace.setPlacedesc(mCursor.getString(mCursor.getColumnIndex(placedesc)));
                mplace.setPlacedate(mCursor.getString(mCursor.getColumnIndex(placedate)));
                mplace.setPlacetime(mCursor.getString(mCursor.getColumnIndex(placetime)));
                mplace.setPlaceextra(mCursor.getString(mCursor.getColumnIndex(placeextra)));
              /*  mplace.setPlaceicon(mCursor.getBlob(mCursor.getColumnIndex(placeicon)));
                mplace.setPlaceimage1(mCursor.getBlob(mCursor.getColumnIndex(placeimage1)));
                mplace.setPlaceimage2(mCursor.getBlob(mCursor.getColumnIndex(placeimage2)));
                mplace.setPlaceimage3(mCursor.getBlob(mCursor.getColumnIndex(placeimage3)));*/


                mCursor.close();


                return mplace;

            }
            else {

               return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            mCursor.close();
        }
        return null;
    }
    public String getName(String mydate,String mytime){
        SQLiteDatabase db = getReadableDatabase();
        String[] param = {mydate,mytime};
        Cursor mCursor = db.rawQuery("SELECT " + placename + " FROM " + placedetail + " WHERE " + placedate + "=?"+" AND "+ placetime+"<?", param);
        mCursor.moveToFirst();
        if (mCursor.getCount()>0){
            Place mplace=new Place();
            mplace.setPlacename(mCursor.getString(mCursor.getColumnIndex(placename)));
            return mplace.getPlacename();
        }

        return "Maitree Notification";
    }

    public List<Place> selectPlace(String mydate,String myid) {
        SQLiteDatabase db = getReadableDatabase();
        String[] param = {mydate,myid};
        Cursor mCursor = db.rawQuery("SELECT " + placeid + "," + placename + "," + placetime + "," + placedate + " FROM " + placedetail + " WHERE " + placedate + "=?"+" AND "+ placeid+"<?" + " ORDER BY " + placetime, param);
        mCursor.moveToFirst();
        Log.d("listcheck", "dbhelpercalled");
        List<Place> placelist = new ArrayList<>();
        Log.d("listcheck", String.valueOf(mCursor.getCount()));
        Log.d("listcheck", String.valueOf(mCursor.getColumnCount()));
        while (mCursor.isAfterLast() == false) {
            Place mplace = new Place();
            mplace.setPlaceid(mCursor.getInt(mCursor.getColumnIndex(placeid)));
            mplace.setPlacename(mCursor.getString(mCursor.getColumnIndex(placename)));
            mplace.setPlacedate(mCursor.getString(mCursor.getColumnIndex(placedate)));
            mplace.setPlacetime(mCursor.getString(mCursor.getColumnIndex(placetime)));
            // mplace.setPlaceicon(mCursor.getBlob(mCursor.getColumnIndex(placeicon)));
            placelist.add(mplace);
            mCursor.moveToNext();
        }
        return placelist;
    }

    public List<Place> numTab() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor mCursor = db.rawQuery("SELECT DISTINCT " + placedate + " FROM " + placedetail + " ORDER BY " + placedate, null);
        i = mCursor.getCount();
        mCursor.moveToFirst();
        mCursor.moveToNext();
        List<Place> placeList=new ArrayList<>();
        while (mCursor.isAfterLast()==false){
            Place mplace = new Place();
            mplace.setPlacedate(mCursor.getString(mCursor.getColumnIndex(placedate)));
            placeList.add(mplace);
            mCursor.moveToNext();
        }
        return placeList;
    }
    public int tabcount(){
        SQLiteDatabase db = getReadableDatabase();
        Cursor mCursor = db.rawQuery("SELECT DISTINCT " + placedate + " FROM " + placedetail, null);
        i = mCursor.getCount();
        return i;
    }

    public List<Guide> selectGuide(String id) {
        SQLiteDatabase db = getReadableDatabase();
        String[] param = {id};
        Cursor mCursor = db.rawQuery("SELECT * FROM " + guidedetail + " WHERE " + placeid + "=?", param);
        mCursor.moveToFirst();
        List<Guide> guidelist = new ArrayList<>();
        while (mCursor.isAfterLast() == false) {
            Guide mguide = new Guide();
            mguide.setGuideid(mCursor.getInt(mCursor.getColumnIndex(guideid)));
            mguide.setGuidename(mCursor.getString(mCursor.getColumnIndex(guidename)));
            mguide.setGuidemob(mCursor.getString(mCursor.getColumnIndex(guidemob)));
            guidelist.add(mguide);
            mCursor.moveToNext();
        }
        return guidelist;
    }

    public List<Host> selectHost() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor mCursor = db.rawQuery("SELECT * FROM" + hostdetail, null);
        mCursor.moveToFirst();
        List<Host> hostlist = new ArrayList<>();
        while (mCursor.isAfterLast() == false) {
            Host mhost = new Host();
            mhost.setHostid(mCursor.getInt(mCursor.getColumnIndex(hostid)));
            mhost.setHostname(mCursor.getString(mCursor.getColumnIndex(hostname)));
            mhost.setHostadd(mCursor.getString(mCursor.getColumnIndex(hostadd)));
            mhost.setHostdesc(mCursor.getString(mCursor.getColumnIndex(hostdesc)));
            mhost.setHostmob(mCursor.getString(mCursor.getColumnIndex(hostmob)));
            hostlist.add(mhost);
            mCursor.moveToNext();
        }
        return hostlist;
    }

    public void insertPlace(int id,String name,String desc,String extra,String date,String time,byte[] icon,byte[] image1,byte[] image2,byte[] image3) {
        try {

            SQLiteDatabase db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(placeid,id);
            contentValues.put(placename,name);
            contentValues.put(placedesc,desc);
            contentValues.put(placedate,date);
            contentValues.put(placetime,time);
            contentValues.put(placeextra,extra);
           // contentValues.put(placefact,fact);
            contentValues.put(placeicon,icon);
            contentValues.put(placeimage1,image1);
            contentValues.put(placeimage2,image2);
            contentValues.put(placeimage3,image3);

            db.insert(placedetail, null, contentValues);

            Log.d("listcheck", "insertsuccess");
        } catch (Exception ex) {
            Log.d("listcheck", "insetfailed");
        }


    }

}
