package com.example.maitree;


/**
 * Created by Hello on 14-12-2015.
 */
public class Place {
    int placeid;
    String placename;
    String placedesc;
    String placeextra;
    String placefact;
    byte[] placeicon;
    byte[] placeimage1;
    byte[] placeimage2;
    byte[] placeimage3;
    String placedate;
    String placetime;


    public int getPlaceid() {
        return placeid;
    }

    public String getPlacename() {
        return placename;
    }

    public String getPlacedesc() {
        return placedesc;
    }

    public String getPlacedate() {
        return placedate;
    }

    public String getPlacetime() {
        return placetime;
    }

    public String getPlaceextra() {
        return placeextra;
    }

    public void setPlaceextra(String placeextra) {
        this.placeextra = placeextra;
    }

    public String getPlacefact() {
        return placefact;
    }

    public void setPlacefact(String placefact) {
        this.placefact = placefact;
    }

    public byte[] getPlaceicon() {
        return placeicon;
    }

    public void setPlaceicon(byte[] placeicon) {
        this.placeicon = placeicon;

    }

    public byte[] getPlaceimage1() {
        return placeimage1;
    }

    public void setPlaceimage1(byte[] placeimage1) {
        this.placeimage1 = placeimage1;
    }

    public byte[] getPlaceimage2() {
        return placeimage2;
    }

    public void setPlaceimage2(byte[] placeimage2) {
        this.placeimage2 = placeimage2;
    }

    public byte[] getPlaceimage3() {
        return placeimage3;
    }

    public void setPlaceimage3(byte[] placeimage3) {
        this.placeimage3 = placeimage3;
    }

    public void setPlaceid(int placeid) {
        this.placeid = placeid;
        
    }

    public void setPlacename(String placename) {
        this.placename = placename;
        
    }

    public void setPlacedate(String placedate) {
        this.placedate = placedate;
       
    }

    public void setPlacedesc(String placedesc) {
        this.placedesc = placedesc;
        
    }

    public void setPlacetime(String placetime) {
        this.placetime = placetime;
        
    }
}