package net.oschina.app.com.oschina.testcase.login;

import android.widget.EditText;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/1.
 */

public class Login1 extends BasicTestCase {

    public Login1(){
        super(false);
    }
    public void testLogin1(){
        pageHelper.getPageNavigation().clickMyTab();
        pageHelper.getPageMyUnLoginStatus().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com","123456789");
        assertTrue(pageHelper.getPageCommon().searchText("用户名或口令错"));
//        solo.clickOnText("我的getPageCommon()");
//        solo.clickOnView(solgetPageCommon()o.getView("net.oschina.app:id/iv_portrait"));
//        EditText name = (EdigetPageCommon()tText)solo.getView("net.oschina.app:id/et_username");
//        EditText pwd = (EditgetPageCommon()Text)solo.getView("net.oschina.app:id/et_password");
//        solo.clearEditText(name);
//        solo.enterText(name,"helloworld");
//        solo.clearEditText(pwd);
//        solo.enterText(pwd,"123456");
//        solo.clickOnView(solo.getView("net.oschina.app:id/btn_login"));
//        assertTrue(solo.searchText("用户名或口令错",true));
    }


}
