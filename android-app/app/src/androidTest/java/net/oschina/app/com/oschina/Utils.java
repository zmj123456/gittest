package net.oschina.app.com.oschina;

import junit.framework.Assert;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Admin on 2016/12/11.
 */

public class Utils {
    public static void sendHttpRequest(String className, String methodName,String deviceId,String value){
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("http://192.168.1.105:8080/Server2/Server").newBuilder();
        urlBuilder.addQueryParameter("className", "1.0");
        urlBuilder.addQueryParameter("methodName", "vogella");
        urlBuilder.addQueryParameter("value", value);
//        urlBuilder.addQueryParameter("deviceId", "deviceId");
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = client.newCall(request).execute();
            JSONObject result = new JSONObject(response.body().string().toString());
            Assert.assertEquals("uiautomator excuted successfully",result.get("msg").toString());
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("cross App cannot be completed!");
        } catch (JSONException e) {
            e.printStackTrace();
            Assert.fail("cross App cannot be completed!");
        }
    }
}
