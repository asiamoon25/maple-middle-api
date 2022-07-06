package com.recipe.maplemiddleapi.service;



import com.recipe.maplemiddleapi.util.UrlConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MappleService {

    final UrlConnection urlConnection;

    public MappleService(UrlConnection urlConnection) {
        this.urlConnection = urlConnection;
    }


    public Object levelUpInfo(int exp1,int exp2) {



        return urlConnection.connectApi(exp1,exp2);
    }
}
