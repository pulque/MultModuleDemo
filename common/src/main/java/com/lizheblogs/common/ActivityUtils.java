package com.lizheblogs.common;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.lizheblogs.common.base.activity.BaseActivity;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by LiZhe on 2018-07-30.
 * com.lizheblogs.common
 */
public class ActivityUtils {

    private static LinkedHashMap<String, Class<?>> hashMap;

    public static LinkedHashMap<String, Class<?>> getAllActivities() {
        if (hashMap == null) {
            hashMap = new LinkedHashMap<>();
            LZApplication application = LZApplication.getInstance();
            PackageManager packageManager = application.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(
                        application.getPackageName(), PackageManager.GET_ACTIVITIES);
                for (ActivityInfo activity : packageInfo.activities) {
                    Log.e("=======================", activity.name);
                    hashMap.put(activity.name, Class.forName(activity.name));
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    public static ArrayList<String> getFunctions() {
        ArrayList<String> functions = new ArrayList<>();
        LinkedHashMap<String, Class<?>> allActivities = ActivityUtils.getAllActivities();
        for (String string : allActivities.keySet()) {
            Class<?> aClass = allActivities.get(string);
            try {
                Object instance = aClass.newInstance();
                if (instance instanceof BaseActivity){
                    functions.add(((BaseActivity) instance).name);
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return functions;
    }
}
