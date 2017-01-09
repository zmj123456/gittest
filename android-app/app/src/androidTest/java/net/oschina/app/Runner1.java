package net.oschina.app;

import android.test.InstrumentationTestRunner;

import com.zutubi.android.junitreport.JUnitReportTestRunner;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testsuites.SuiteLogin;
import net.oschina.app.com.oschina.testsuites.SuiteNews;

/**
 * Created by Admin on 2016/12/7.
 */

public class Runner1 extends JUnitReportTestRunner{
    @Override
    public TestSuite getAllTests() {
        TestSuite suite = new TestSuite();
        suite.addTest(SuiteLogin.getLoginSuite());
        suite.addTest(SuiteNews.getNewsSuite());
        return suite;
    }
}
