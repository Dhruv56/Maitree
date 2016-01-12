package com.example.maitree;

import android.app.Application;

/**
 * Created by dhruv on 1/8/2016.
 */
public class MyApplication extends Application {
    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg1)
    {
        msg=msg1;
    }

  private static String msg;

}
