package net.oschina.app.com.oschina.Pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/2.
 */

public class PageMyUnLoginStatus {
    private SoloWrap solo;
    private ImageView settingIV,loginIcon;

    public PageMyUnLoginStatus(SoloWrap solo){
        this.solo = solo;
    }

    /**
     * 用来要加载这个页面要使用到的控件
     *
     */
    public void initviews(){
        settingIV =(ImageView) solo.getView("net.oschina.app:id/iv_logo_setting");
        loginIcon =(ImageView) solo.getView("net.oschina.app:id/iv_portrait");
    }

    /**
     * 封装会使用到的方法
     */
    public void clickLoginIcon(){
        solo.clickOnView(loginIcon);
    }

    public void clickSettings(){
        solo.clickOnView(settingIV);
    }

}
