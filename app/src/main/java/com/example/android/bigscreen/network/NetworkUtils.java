package com.example.android.bigscreen.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtils {

    public static boolean isConnectedToInternet(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm != null) {
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            return (activeNetwork != null && activeNetwork.isConnected());
        }
        return false;

    }

}