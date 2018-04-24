package com.example.abratu.factoryserver.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.abratu.factoryserver.Model.Request;
import com.example.abratu.factoryserver.Model.User;
import com.example.abratu.factoryserver.Remote.APIService;
import com.example.abratu.factoryserver.Remote.FCMRetrofitClient;
import com.example.abratu.factoryserver.Remote.RetrofitClient;

import retrofit2.Retrofit;

/**
 * Created by abratu on 4/16/2018.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static final int PICK_IMAGE_REQUEST = 71;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";


    private static final String fcmURL = "https://fcm.googleapis.com/";


    public static APIService getFCMClient(){
        return FCMRetrofitClient.getClient(fcmURL).create(APIService.class);
    }

    public static String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "Placed";
        else if (code.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }

    public static boolean isConnectedToInterner(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null)
        {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if (info != null)
            {
                for (int i=0; i<info.length;i++)
                {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                        return true;
                }
            }
        }
        return false;
    }



}
