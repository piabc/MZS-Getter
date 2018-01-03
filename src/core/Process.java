package core;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Process {

    public static String getSource(String link) {
        String htmlSrc = "";
        try {
            htmlSrc = Jsoup.connect(link).get().html();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return Utility.resetStr(htmlSrc);
    }

}
