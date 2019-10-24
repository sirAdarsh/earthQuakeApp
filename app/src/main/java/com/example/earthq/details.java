package com.example.earthq;

public class details {
    private String Mag;
    private String Location;
    private String Date;

    public details(String mMag,String mLocation,String mDate){
        Mag=mMag;
        Location=mLocation;
        Date=mDate;
    }

    public String getMag(){
        return Mag;
    }
    public String getLocation(){
        return Location;
    }
    public String getDate(){
        return Date;
    }
}
