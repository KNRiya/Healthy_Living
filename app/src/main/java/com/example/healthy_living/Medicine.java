package com.example.healthy_living;

public class Medicine
{

   public Medicine(){}
private String mName;
private String times;

    public Medicine(String mName, String times) {
        this.mName = mName;
        this.times = times;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
