package net.oschina.app.com.oschina.testsuites;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.news.news1;
import net.oschina.app.com.oschina.testcase.login.Login1;
import net.oschina.app.com.oschina.testcase.login.Login2;

/**
 * Created by Admin on 2016/12/7.
 */

public class SuiteNews {

    public static TestSuite getNewsSuite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(news1.class);
        return suite;
    }
}
