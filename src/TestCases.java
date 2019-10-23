import org.openqa.selenium.*;

import java.net.MalformedURLException;

/**
 * @author Samira ~  10/21/2019 /  9:54 PM
 */
public class TestCases {
    public void tc_audi_cabrio_500(WebDriver driver, String name) throws InterruptedException, MalformedURLException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            driver.get("https://www.vehiculum.de");

            //Accepts cookies
            WebElement cookies = driver.findElement(By.cssSelector(".cc-btn.cc-dismiss"));
            cookies.click();


            //**** Select brand
            WebElement brand = driver.findElement(By.id("select-manufacturer"));
            brand.click();

            WebElement manufacturer_Audi = driver.findElement(By.id("manufacturer_Audi"));
            manufacturer_Audi.sendKeys("Audi");
            Thread.sleep(5000);
            manufacturer_Audi.click();

            //**** Select design
            WebElement design = driver.findElement(By.id("select-body-type"));
            design.click();

            //**** Select Cabrio for design
            WebElement cabrio = driver.findElement(By.id("body_type_cabrio"));
            cabrio.sendKeys("8");
            Thread.sleep(5000);
            cabrio.click();

            //**** Select budget
            WebElement budget;
            budget = driver.findElement(By.id("select-budget"));
            budget.sendKeys("500");
            Thread.sleep(5000);
            budget.submit();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,300)");
            Thread.sleep(5000);
            driver.quit();
        } catch (NoSuchElementException e) {
            System.out.println("---------------------------------ERROR-----------------------------------------");
            System.out.println(e.getMessage());
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Device: " + name + " Test Case: tc_audi_cabrio_500" + " -> Exception: NoSuchElementException");
            System.out.println("---------------------------------ERROR-----------------------------------------");
        }
    }

    public static void tc_audi_bmw_van_budget_1000(WebDriver driver, String name) throws InterruptedException, MalformedURLException {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.get("https://www.vehiculum.de");
            WebElement cookies = driver.findElement(By.cssSelector(".cc-btn.cc-dismiss"));
            cookies.click();

            //**** Select brand
            WebElement brand = driver.findElement(By.id("select-manufacturer"));
            brand.click();

            WebElement manufacturer_Audi = driver.findElement(By.id("manufacturer_Audi"));
            manufacturer_Audi.sendKeys("Audi");
            Thread.sleep(5000);
            manufacturer_Audi.click();

            WebElement manufacturer_Bmw = driver.findElement(By.id("manufacturer_BMW"));
            manufacturer_Bmw.sendKeys("BMW");
            Thread.sleep(5000);
            manufacturer_Bmw.click();


            //**** Select design
            WebElement design = driver.findElement(By.id("select-body-type"));
            design.click();

            //**** Select Van/Bus for design
            WebElement van_Bus = driver.findElement(By.id("body_type_van"));
            van_Bus.sendKeys("6");
            Thread.sleep(5000);
            van_Bus.click();

            //**** Select budget
            WebElement budget;
            budget = driver.findElement(By.id("select-budget"));
            budget.sendKeys("1000");
            Thread.sleep(900);
            budget.submit();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,300)");
            Thread.sleep(5000);
            driver.quit();
        } catch (NoSuchElementException e) {
            System.out.println("---------------------------------ERROR-----------------------------------------");
            System.out.println(e.getMessage());
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Device: " + name + " Test Case: tc_audi_bmw_van_budget_1000" + " -> Exception: NoSuchElementException");
            System.out.println("---------------------------------ERROR-----------------------------------------");
        }
    }
}
