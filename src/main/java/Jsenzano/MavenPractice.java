package Jsenzano;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenPractice {
    public static void main(String[] args) {
        TestData test  = new TestData();
        System.out.println(test.firstName());
        System.out.println(test.lastName());
        System.out.println(test.phoeNumber());
        System.out.println(test.address());


    }
}
