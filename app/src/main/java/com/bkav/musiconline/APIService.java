package com.bkav.musiconline;

import java.io.DataOutputStream;

public class APIService {
    private  static String base_url="https://hocvienmatma.000webhostapp.com/";

    public  static Dataservice getService(){
        return APIRetrofitclient.getClient(base_url).create(Dataservice.class);
    }


}
