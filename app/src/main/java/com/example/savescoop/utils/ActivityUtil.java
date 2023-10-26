package com.example.savescoop.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sm3243
 */
public class ActivityUtil {
    private List<Activity> activityList = new ArrayList<>();
    private static ActivityUtil instance;

    public static synchronized ActivityUtil getInstance(){
        if(instance == null){
            instance = new ActivityUtil();
        }
        return instance;
    }

    public void addActivity(Activity activity){
        activityList.add(activity);
    }

    public void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public void finishAll(){
        for(Activity activity : activityList){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activityList.clear();
    }
}
