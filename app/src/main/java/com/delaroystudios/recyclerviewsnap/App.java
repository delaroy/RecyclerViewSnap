package com.delaroystudios.recyclerviewsnap;

/**
 * Created by delaroy on 2/10/17.
 */
public class App {

    private int mDrawable;
    private  String mName;
    private float mRating;

    public App(String name, int drawable, float rating){
        mName = name;
        mDrawable = drawable;
        mRating = rating;
    }

    public float getRating(){ return mRating; }
    public int getDrawable() { return mDrawable; }
    public String getName() { return mName; }

}
