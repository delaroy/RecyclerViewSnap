package com.delaroystudios.recyclerviewsnap;

import java.util.List;

/**
 * Created by delaroy on 2/10/17.
 */
public class Snap {

    private int mGravity;
    private String mText;
    private List<App> mApps;

    public Snap(int gravity, String text, List<App> apps){
        mGravity = gravity;
        mText = text;
        mApps = apps;
    }

    public  String getText() { return mText; }
    public int getGravity() { return  mGravity; }
    public List<App> getApps() { return mApps; }
}
