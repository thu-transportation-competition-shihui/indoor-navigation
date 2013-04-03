package com.thu.tdnav;

import java.util.ArrayList;  
import java.util.List;  
import android.app.Activity;  
import android.app.Application;
//code for exit application 
public class tdnav extends Application {  
    private List<Activity> mainActivity = new ArrayList<Activity>();  
    public List<Activity> MainActivity() {  
        return mainActivity;  
    }  
    public void addActivity(Activity act) {  
        mainActivity.add(act);  
    }  
    public void finishAll() {  
        for (Activity act : mainActivity) {  
            if (!act.isFinishing()) {  
                act.finish();  
            }  
        }  
        //mainActivity = null;  
    }  
}  