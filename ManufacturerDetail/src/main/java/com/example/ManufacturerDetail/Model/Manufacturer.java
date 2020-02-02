package com.example.ManufacturerDetail.Model;

import org.springframework.stereotype.Component;

@Component
public class Manufacturer {

    String mID;
    String mName;
    String mCity;
    String mcountry;
    String mState;

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }




    public Manufacturer(String mID, String mName, String mCity, String mcountry, String mState) {
        this.mID = mID;
        this.mName = mName;
        this.mCity = mCity;
        this.mcountry = mcountry;
        this.mState = mState;
    }

    public Manufacturer() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }


    public String getMcountry() {
        return mcountry;
    }

    public void setMcountry(String mcountry) {
        this.mcountry = mcountry;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "mID='" + mID + '\'' +
                ", mName='" + mName + '\'' +
                ", mcity='" + mCity + '\'' +
                ", mcountry='" + mcountry + '\'' +
                ", mState='" + mState + '\'' +
                '}';
    }
}
