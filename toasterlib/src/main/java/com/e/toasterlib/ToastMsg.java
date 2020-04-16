package com.e.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMsg {

    public static void msg(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
