package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {
    protected WebDriver driver;
    protected Properties config_knocingDoors;
    protected Knocing_Login loginPage;
    protected Beneficiaries_Married benfiters;
    protected Benfeficiaries_NotMarried  NotMarried;

    public void setup_browser() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config_knocingDoors.properties");
        config_knocingDoors = new Properties();
        config_knocingDoors.load(fis);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new Knocing_Login(driver);
        benfiters = new Beneficiaries_Married(driver);
        NotMarried = new Benfeficiaries_NotMarried(driver);
    }
    public void increaseNID() throws IOException {
        String nidValue = config_knocingDoors.getProperty("NID");
        long currentNID = Long.parseLong(nidValue);
        currentNID++;
        long lastTwoDigits = currentNID % 100;
        long tensDigit = lastTwoDigits / 10;

        if (tensDigit % 2 != 0) {
            currentNID += 10;
            currentNID -= (currentNID % 10);
        }
        config_knocingDoors.setProperty("NID", String.valueOf(currentNID));

        try (FileOutputStream output = new FileOutputStream("path_to_knocingDoors.properties")) {
            config_knocingDoors.store(output, null);
        }

        System.out.println("Updated NID: " + currentNID);
    }
}
