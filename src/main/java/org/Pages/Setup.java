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
    public void increaseNID() throws IOException {
        // قراءة قيمة الـ NID الحالية
        String nidValue = config_knocingDoors.getProperty("NID");
        long currentNID = Long.parseLong(nidValue); // تحويلها إلى رقم
        currentNID++; // زيادتها +1
        long lastTwoDigits = currentNID % 100; // مثال: 69 في 29711112111169
        long tensDigit = lastTwoDigits / 10;  // الرقم في خانة العشرات فقط

        // التأكد أن خانة العشرات زوجية
        if (tensDigit % 2 != 0) { // لو خانة العشرات فردية
            currentNID += 10; // تزود 10 علشان تخلي خانة العشرات زوجية
            currentNID -= (currentNID % 10); // تجعل آخر خانة صفر للحفاظ على الترتيب
        }
        config_knocingDoors.setProperty("NID", String.valueOf(currentNID));

        // حفظ التعديلات في ملف properties
        try (FileOutputStream output = new FileOutputStream("path_to_knocingDoors.properties")) {
            config_knocingDoors.store(output, null);
        }

        System.out.println("Updated NID: " + currentNID);
    }
}
