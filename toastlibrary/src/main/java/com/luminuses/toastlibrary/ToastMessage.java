package com.luminuses.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void s(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
