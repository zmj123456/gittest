package net.oschina.app;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;

import com.robotium.solo.Solo;

import net.oschina.app.AppStart;
import net.oschina.app.com.oschina.PageHelper;

/**
 * Created by Admin on 2016/12/1.
 */

public class BasicTestCase extends ActivityInstrumentationTestCase2<AppStart>{
    private boolean isNeedLogin=false;
    private Solo solo1;
    private SoloWrap solo;
    protected PageHelper pageHelper;

    public BasicTestCase(boolean isNeedLogin){
        super(AppStart.class);
        this.isNeedLogin = isNeedLogin;
    }

    @Override
    public void setUp() throws Exception {
        try{
            super.setUp();
            solo1 = new Solo(getInstrumentation(),getActivity());
            solo = new SoloWrap(solo1);
            pageHelper = new PageHelper(solo);
//            Log.i("AUTO","==================================1");
//            int a=0;
//            int b=3/a;
            solo.clickOnText("我的");
            if (isNeedLogin){
                if(!pageHelper.getPageMyLoginStatus().isAlreadyLogin())
                    pageHelper.getPageMyUnLoginStatus().clickLoginIcon();
                pageHelper.getPageLogin().login("735723619@qq.com","123456");
            }else{
                if (pageHelper.getPageMyLoginStatus().isAlreadyLogin()){
                    pageHelper.getPageMyLoginStatus().clickSettings();
                    pageHelper.getPageSettings().clickLogout();
                }
            }
            pageHelper.getPageNavigation().clickNewsTab();
        }catch (Exception ex){
            Log.i("AUTO","Exception happended in setup, error msg is:" + ex.getMessage());
            solo.takeScreenShot(this.getClass().getSimpleName());
            tearDown();
            throw ex;
        }
    }

    @Override
    protected void runTest() throws Throwable {
        try {
            super.runTest();
        }catch (Throwable ex){
            Log.i("AUTO","Exception happended in runTest, error msg is:" + ex.getMessage());
            solo.takeScreenShot(this.getClass().getSimpleName());
            throw ex;
        }

    }

    @Override
    public void tearDown() throws Exception {
        try{

        }catch (Throwable th){
            Log.i("AUTO","Exception happended in tearDown, error msg is:" + th.getMessage());
            solo.takeScreenShot(this.getClass().getSimpleName());
            throw th;
        }finally {
            solo.finishOpenedActivities();
            super.tearDown();
        }
    }
}
