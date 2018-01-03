package core;

public class Utility {

    public static String resetStr(String input) {
        return input.replaceAll("\n\r\t", " ").replaceAll("\\s{2,}", " ").trim();
    }

}
