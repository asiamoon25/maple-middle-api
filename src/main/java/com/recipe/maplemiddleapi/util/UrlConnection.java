package com.recipe.maplemiddleapi.util;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Component
public class UrlConnection {

    public Object connectApi(int exp1, int exp2){
        String strUrl = "http://wachan.me/exp_api.php"
                    +"?exp1="+exp1
                    +"&exp2="+exp2;


        try{
            URL url = new URL(strUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            con.setRequestMethod("POST");
            con.setDefaultUseCaches(false);
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setRequestProperty("content-type","application/x-www-form-urlencoded");

            StringBuilder sb = new StringBuilder();

            if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                System.out.println("API Connection Good");

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8)
                );

                System.out.println(br.toString());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
