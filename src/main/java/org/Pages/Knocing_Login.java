package org.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Knocing_Login {
    private WebDriver driver;
    private WebDriverWait wait;

    By usernameField = By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div/div[1]/div/input");
    By passwordField = By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div/div[2]/div/input");
    By signInButton = By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div/div[3]/button");

    public Knocing_Login(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void login(String username, String password) throws InterruptedException {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(usernameField)).sendKeys(username);
            wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(password);
            wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
            Thread.sleep(500);
        }
        catch (TimeoutException e) {
            System.out.println("حدث خطأ: العنصر لم يكن قابلاً للنقر عليه في الوقت المحدد. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("حدث خطأ: العنصر غير موجود في الصفحة. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("حدث خطأ غير متوقع: " + e.getMessage());
        }
    }
}
