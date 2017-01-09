package net.oschina.app.com.oschina;

import net.oschina.app.BasicTestCase;

/**
 * Created by Admin on 2016/12/11.
 */

public class Cross1 extends BasicTestCase{

    public Cross1(){
        super(false);
    }
    public void testC(){
        pageHelper.getPageCommon().clickOnText("什么是SeetaFace开源人脸识别引擎");
        pageHelper.getPageCommon().sleep(8);
        pageHelper.getPageNewsDetail().clickShareIV();
        pageHelper.getPageCommon().clickOnText("QQ");
        Utils.sendHttpRequest("Cross2","testC","","");
        pageHelper.getPageNewsDetail().clickCountTV();
        pageHelper.getPageCommon().sleep(8);

    }
}
