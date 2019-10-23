import IOS.Iphone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;


/**
 * @author Samira ~  10/23/2019 /  7:29 PM
 */
public class Main {
    public static final String USERNAME = "samirahuseyn1";
    public static final String AUTOMATE_KEY = "zKCM4E7vz37RmFGF2UKS";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        TestCases mobileTest = new TestCases();

        // Test case1: brand= audi, design = cabrio, budget = 500, for iPhones
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphoneXS13()), Iphone.name);
       /* mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphoneXS12()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphoneXSMax()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphoneXR()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphoneX()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone8_13()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone8_12()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone8_11()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone8_Plus()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone7_12()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone7_10()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone7_Plus()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone6S_12()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone6S_11()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iphone6()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadPro12_9_13()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadPro12_9_12()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadPro11()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadMini()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadAir()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadPro9_7()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadPro12_9()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPadMini_4()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPad6th()), Iphone.name);
        mobileTest.tc_audi_cabrio_500(newWebDriver(Iphone.iPad5th()), Iphone.name);

        //--------------------------------------------------------------------------------------------------------------------------

        // Test case2: brand= audi,bmw, design = van/bus, budget = 1000, for iPhones
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphoneXS13()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphoneXS12()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphoneXSMax()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphoneXR()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphoneX()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone8_13()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone8_12()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone8_11()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone8_Plus()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone7_12()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone7_10()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone7_Plus()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone6S_12()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone6S_11()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iphone6()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadPro12_9_13()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadPro12_9_12()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadPro11()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadMini()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadAir()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadPro9_7()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadPro12_9()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPadMini_4()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPad6th()), Iphone.name);
        mobileTest.tc_audi_bmw_van_budget_1000(newWebDriver(Iphone.iPad5th()), Iphone.name);

*/
    }

    public static WebDriver newWebDriver(DesiredCapabilities Mobile) throws MalformedURLException {
        return new RemoteWebDriver(new java.net.URL(URL), Mobile);
    }
}
