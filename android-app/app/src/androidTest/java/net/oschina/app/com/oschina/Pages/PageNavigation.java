package net.oschina.app.com.oschina.Pages;

import android.widget.FrameLayout;
import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by Admin on 2016/12/6.
 */

public class PageNavigation {
    private SoloWrap solo;
    private FrameLayout newsTab,tweetTab,exploreTab,myTab;
    private ImageView pubIM;

    public PageNavigation(SoloWrap solo){
        this.solo = solo;
    }
    /**
     * 用来加载这个页面要使用到的控件
     */
    public void initviews(){
        newsTab =(FrameLayout) solo.getView("net.oschina.app:id/nav_item_news");
        tweetTab =(FrameLayout) solo.getView("net.oschina.app:id/nav_item_tweet");
        exploreTab =(FrameLayout) solo.getView("net.oschina.app:id/nav_item_explore");
        myTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_me");
        pubIM =(ImageView) solo.getView("net.oschina.app:id/nav_item_tweet_pub");
    }
    /**
     * 封装会使用到的方法
     */
    public void clickNewsTab(){
        solo.clickOnView(newsTab);
    }
    public void clickTweetTab(){
        solo.clickOnView(tweetTab);
    }
    public void clickExploreTab(){
        solo.clickOnView(exploreTab);
    }
    public void clickMyTab(){
        solo.clickOnView(myTab);
    }
    public void clickPubIM(){
        solo.clickOnView(pubIM);
    }
}
