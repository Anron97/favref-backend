package com.bsuir.favref.linkanalyzer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class that provide opportunity get information about link.
 */
public class LinkAnalyzer {
    private static final String REQUEST_METHOD = "HEAD";

    public static ContentType getContentType(String url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setAllowUserInteraction(false);
        connection.setUseCaches(true);
        connection.setRequestMethod(REQUEST_METHOD);
        connection.connect();
        String contentType = connection.getContentType();
        return parseContentType(contentType);
    }

    private static ContentType parseContentType(String contentType) {
        if (contentType == null) {
            return ContentType.OTHER;
        }
        if (contentType.contains("text")) {
            return ContentType.TEXT;
        } else if (contentType.contains("image")){
            return ContentType.IMAGE;
        } else if (contentType.contains("video")) {
            return ContentType.VIDEO;
        }
        return ContentType.OTHER;
    }
}
