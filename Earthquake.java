package com.example.myquakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long mTimeInMilliseconds,String mUrl) {
        this.magnitude = magnitude;
        this.location = location;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl=mUrl;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }
}
