package IOS;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Iphone {
    static DesiredCapabilities caps;
    public static String name = "";

    public static DesiredCapabilities iphoneXS13() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "13");
        caps.setCapability("device", "iPhone XS");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphoneXS12() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone XS");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphoneXSMax() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone XS Max");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphoneXR() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone XR");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphoneX() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPhone X");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone8_13() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "13");
        caps.setCapability("device", "iPhone 8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone8_12() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone 8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone8_11() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPhone 8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone8_Plus() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPhone 8 Plus");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone7_12() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone 7");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone7_10() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("device", "iPhone 7");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone7_Plus() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("device", "iPhone 7 Plus");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone6S_12() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone 6S");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone6S_11() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPhone 6S");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iphone6() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPhone 6");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadPro12_9_13() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "13");
        caps.setCapability("device", "iPad Pro 12.9 2018");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadPro12_9_12() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPad Pro 12.9 2018");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadPro11() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPad Pro 11 2018");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadMini() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPad Mini 2019");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadAir() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPad Air 2019");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadPro9_7() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPad Pro 9.7 2016");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadPro12_9() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPad Pro 12.9 2017");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPadMini_4() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPad Mini 4");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPad6th() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPad 6th");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities iPad5th() {
        caps = new DesiredCapabilities();
        caps.setCapability("os_version", "11");
        caps.setCapability("device", "iPad 5th");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        name = "" + caps.getCapability("os") + caps.getCapability("os_version") + " - " + caps.getCapability("browser") + caps.getCapability("browser_version");
        return caps;
    }


}
