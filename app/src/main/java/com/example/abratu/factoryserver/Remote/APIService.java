package com.example.abratu.factoryserver.Remote;

import com.example.abratu.factoryserver.Model.MyResponse;

import com.example.abratu.factoryserver.Model.MyResponse;
import com.example.abratu.factoryserver.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;



/**
 * Created by abratu on 4/23/2018.
 */

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAiTYPVGc:APA91bFCJeIH5ZSPEcshj2vF7ammKa8PGGr_wLJa2b1WfQLJkUQrCfdZo5fCI9_W9K-hvWcyYDaTQYIQGAsUftjTcMyxbeANVhePjE6t0JUF6X_s5cc3nW6pb7oTm2oAk0XxxhvXf9Uv"
            }
    )


    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
