package sdet;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.*;
import org.testng.Assert;
import org.testng.annotations.*;

//Unit test for simple App.
//playwright->browser instance->page instance->web app
public class AppTest {

    @Test

    public void verifyProgram(){


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
        Page page = browser.newPage();
        page.navigate("http://playwriht.dev");
        System.out.println();
        Assert.assertEquals("Fast and reliable end-to-end testing for modern web apps",page.title());



    }





}
