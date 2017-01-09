package net.oschina.app.com.oschina.testcase.login;

import android.util.Log;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/1.
 */

public class Login2 extends BasicTestCase {

    public Login2(){

        super(true);
    }
    public void testLogin2(){
//        solo.clickOnText("我的");
//        Log.i("AUTO","===========================HelloWorld");
//        assertTrue(solo.searchText("autotest",true));
        pageHelper.getPageNavigation().clickMyTab();
        assertTrue(pageHelper.getPageMyLoginStatus().isAlreadyLogin());
    }
    

}
