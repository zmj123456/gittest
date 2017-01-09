package net.oschina.app.com.oschina;

import com.robotium.solo.Solo;

import net.oschina.app.SoloWrap;
import net.oschina.app.com.oschina.Pages.PageCommon;
import net.oschina.app.com.oschina.Pages.PageLogin;
import net.oschina.app.com.oschina.Pages.PageMyLoginStatus;
import net.oschina.app.com.oschina.Pages.PageMyUnLoginStatus;
import net.oschina.app.com.oschina.Pages.PageNavigation;
import net.oschina.app.com.oschina.Pages.PageNewsDetail;
import net.oschina.app.com.oschina.Pages.PageSettings;

/**
 * Created by Admin on 2016/12/5.
 */

public class PageHelper {
    private PageLogin pageLogin;
    private SoloWrap solo;
    private PageMyUnLoginStatus pageMyUnLoginStatus;
    private PageSettings pageSettings;
    private PageMyLoginStatus pageMyLoginStatus;
    private PageNavigation pageNavigation;
    private PageCommon pageCommon;
    private PageNewsDetail pageNewsDetail;

    public PageHelper(SoloWrap solo){
        this.solo = solo;
    }
    public PageLogin getPageLogin(){
        if (pageLogin == null){
            pageLogin = new PageLogin(solo);
        }
        pageLogin.initviews();
        return pageLogin;
    }

    public PageMyUnLoginStatus getPageMyUnLoginStatus(){
        if (pageMyUnLoginStatus == null){
            pageMyUnLoginStatus = new PageMyUnLoginStatus(solo);
        }
        pageMyUnLoginStatus.initviews();
        return pageMyUnLoginStatus;
    }

    public PageSettings getPageSettings(){
        if (pageSettings == null){
            pageSettings = new PageSettings(solo);
        }
        pageSettings.initviews();
        return pageSettings;
    }

    public PageMyLoginStatus getPageMyLoginStatus(){
        if (pageMyLoginStatus == null){
            pageMyLoginStatus = new PageMyLoginStatus(solo);
        }
        pageMyLoginStatus.initviews();
        return pageMyLoginStatus;
    }

    public PageNavigation getPageNavigation(){
        if (pageNavigation == null){
            pageNavigation = new PageNavigation(solo);
        }
        pageNavigation.initviews();
        return pageNavigation;
    }

    public PageCommon getPageCommon(){
        if (pageCommon == null){
            pageCommon = new PageCommon(solo);
        }
        return pageCommon;
    }

    public PageNewsDetail getPageNewsDetail(){
        if (pageNewsDetail ==null){
            pageNewsDetail = new PageNewsDetail(solo);
        }
        pageNewsDetail.initViews();
        return pageNewsDetail;
    }
}
