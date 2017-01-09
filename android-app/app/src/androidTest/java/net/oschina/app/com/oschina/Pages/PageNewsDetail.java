package net.oschina.app.com.oschina.Pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2017/1/4.
 */

public class PageNewsDetail {
    private SoloWrap solo;
    private ImageView shareIV;
    private TextView countTV;

    public PageNewsDetail(SoloWrap solo){
        this.solo = solo;
    }

    public void initViews(){
        shareIV =(ImageView) solo.getView("net.oschina.app:id/iv_share");
        countTV = (TextView) solo.getView("net.oschina.app:id/tv_comment_count");
    }

    public void clickShareIV(){
        solo.clickOnView(shareIV);
    }

    public void clickCountTV(){
        solo.clickOnView(countTV);
    }
}
