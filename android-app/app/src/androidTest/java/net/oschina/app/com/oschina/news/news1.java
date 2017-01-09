package net.oschina.app.com.oschina.news;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/1.
 */

public class news1 extends BasicTestCase {

    public news1(){
        super(false);
    }
    public void testLogin1(){
        pageHelper.getPageNavigation().clickMyTab();
        pageHelper.getPageMyUnLoginStatus().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com","123456789");
        assertTrue(pageHelper.pageCommon().searchText("用户名或口令错"));
//        solo.clickOnText("我的");
//        solo.clickOnView(solo.getView("net.oschina.app:id/iv_portrait"));
//        EditText name = (EditText)solo.getView("net.oschina.app:id/et_username");
//        EditText pwd = (EditText)solo.getView("net.oschina.app:id/et_password");
//        solo.clearEditText(name);
//        solo.enterText(name,"helloworld");
//        solo.clearEditText(pwd);
//        solo.enterText(pwd,"123456");
//        solo.clickOnView(solo.getView("net.oschina.app:id/btn_login"));
//        assertTrue(solo.searchText("用户名或口令错",true));
    }


}
