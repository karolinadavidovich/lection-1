package HM7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {
        String ipAddress = "242.525.25.24";
        String regexPattern = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";

        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("IP Address " + ipAddress + " is valid");
        }
    }
}


