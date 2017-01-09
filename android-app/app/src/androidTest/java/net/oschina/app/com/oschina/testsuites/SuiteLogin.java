package net.oschina.app.com.oschina.testsuites;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testcase.login.Login1;
import net.oschina.app.com.oschina.testcase.login.Login2;

/**
 * Created by Admin on 2016/12/7.
 */

public class SuiteLogin {

    public static TestSuite getLoginSuite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(Login1.class);
        suite.addTestSuite(Login2.class);
        return suite;
    }
}
