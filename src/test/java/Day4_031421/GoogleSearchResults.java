package Day4_031421;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResults {

    public static void main(String[] args) {

        //set the System property of where the driver is located so you can use it
        //mac you don't put .exe after chromedriver. It's only for windows
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the WebDriver with a variable to use
        WebDriver driver = new ChromeDriver();

        //navigate/get to google home page
        driver.navigate().to("https://www.google.com");



    }//end of main


}//end of java class
