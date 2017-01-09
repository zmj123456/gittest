package net.oschina.app.com.oschina.Pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/2.
 */

public class PageMyLoginStatus {
    private SoloWrap solo;
    private ImageView settingIV;
    private TextView nickTV;

    public PageMyLoginStatus(SoloWrap solo){
        this.solo = solo;
    }

    /**
     * 用来要加载这个页面要使用到的控件
     *
     */
    public void initviews(){
        solo.waitForText("点击头像登录");
        settingIV =(ImageView) solo.getView("net.oschina.app:id/iv_logo_setting");
        nickTV =(TextView) solo.getView("net.oschina.app:id/tv_nick");
    }

    /**
     * 封装会使用到的方法
     */


    public void clickSettings(){
        solo.clickOnView(settingIV);
    }

    public String getNickName(){
        return nickTV.getText().toString();
    }

    public boolean isAlreadyLogin(){
        return getNickName().equals("autotest");
    }
}
