package com.bsuir.favref.linkanalyzer.pageanalyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;

public class PageAnalyzerTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        DesiredCapabilities DesireCaps = new DesiredCapabilities();
        DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        driver = new PhantomJSDriver(DesireCaps);
    }

    @Test
    public void getLinksOfAssertSelenium() throws IOException {
        driver.get("https://www.youtube.com/watch?v=zWmuTjHNcKc");
        ((JavascriptExecutor)driver).executeScript(
                "document.getElementsByTagName(\"video\")[0].style.border = \"6px solid GREEN\""
        );
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(screenshot, new File("D:\\result.jpg"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
