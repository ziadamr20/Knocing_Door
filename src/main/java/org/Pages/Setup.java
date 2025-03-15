package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {
    protected WebDriver driver;
    protected Properties config_knocingDoors;
    protected Knocing_Login loginPage;
    protected Beneficiaries benfiters;
    protected Benfeficiaries_NotMarried  NotMarried;

    public void setup_browser() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config_knocingDoors.properties");
        config_knocingDoors = new Properties();
        config_knocingDoors.load(fis);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // فتح المتصفح بحجم الشاشة الكامل
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new Knocing_Login(driver);
        benfiters = new Beneficiaries(driver);
        NotMarried = new Benfeficiaries_NotMarried(driver);

    }
}
