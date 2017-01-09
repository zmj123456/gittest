package net.oschina.app.com.oschina.Pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/2.
 */

public class PageSettings {
    private SoloWrap solo;
    private TextView logoutTV;

    public PageSettings(SoloWrap solo){
        this.solo = solo;
    }

    /**
     * 用来要加载这个页面要使用到的控件
     *
     */
    public void initviews(){
        logoutTV =(TextView) solo.getView("net.oschina.app:id/setting_cancle");
    }

    /**
     * 封装会使用到的方法
     */

    public void clickLogout(){
        solo.clickOnView(logoutTV);
    }
}
