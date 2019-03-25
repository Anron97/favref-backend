package com.bsuir.favref.linkanalyzer;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class LinkAnalyzerTest {

    @Test
    public void getContentType_IMAGE() {
        String url1 = "http://4everstatic.com/obrazki/przyroda/rosliny/niebieska-roza-157634.jpg";
        String url2 = "https://pp.userapi.com/c847124/v847124417/1c9ec3/Ga-eUvZFqI8.jpg";
        String url3 = "https://rosphoto.com/images/u/articles/1707/xxl-1.jpg";
        try {
            ContentType type1 = LinkAnalyzer.getContentType(url1);
            ContentType type2 = LinkAnalyzer.getContentType(url2);
            ContentType type3 = LinkAnalyzer.getContentType(url3);

            Assert.assertEquals(ContentType.IMAGE, type1);
            Assert.assertEquals(ContentType.IMAGE, type2);
            Assert.assertEquals(ContentType.IMAGE, type3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getContentType_VIDEO() {
        String url1 = "https://www.youtube.com/watch?v=_bL0s9JRVRk";
        try {
            ContentType type1 = LinkAnalyzer.getContentType(url1);

            Assert.assertEquals(ContentType.VIDEO, type1);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
