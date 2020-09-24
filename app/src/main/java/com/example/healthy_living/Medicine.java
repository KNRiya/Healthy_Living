package com.example.healthy_living;

public class Medicine   //Model class for each Medicine
{

   public Medicine(){}
private String mName;
private String times;

    public Medicine(String mName, String times) {       //constractor of medicine class
        this.mName = mName;
        this.times = times;
    }
                                                        // getter and setter methods
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
