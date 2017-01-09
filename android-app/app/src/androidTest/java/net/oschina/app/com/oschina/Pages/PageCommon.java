package net.oschina.app.com.oschina.Pages;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/6.
 */

public class PageCommon {
    private SoloWrap solo;

    public PageCommon(SoloWrap solo){
        this.solo = solo;
    }

    public boolean searchText(String text){
        return solo.searchText(text);
    }

    public void clickOnText(String text){
        solo.clickOnText(text);
    }
    public void sleep(int second){
        solo.sleep(second*1000);
    }
}
