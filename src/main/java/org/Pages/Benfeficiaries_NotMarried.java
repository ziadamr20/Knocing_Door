package org.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Benfeficiaries_NotMarried {
    private Actions actions;
    private WebDriver driver;
    private WebDriverWait wait;

    /*****************************************************          Step  1    ********************************************************************/
    By add_Beneficiaries_Button = By.xpath("//a[contains(text(),'اضافة سيدة')]");
    By Name = By.xpath("//input[@placeholder='ادخل اسم السيدة']");
    By Natonaial_ID = By.xpath("//input[@placeholder='ادخل الرقم القومى للسيدة']");
    By Phone = By.xpath("//input[@placeholder='ادخل رقم تليفون السيدة']");
    By Margie_Statues_Radio_Button_NotMarred = By.xpath("//input[@id=\"maritalStatus-4\"]");
    By Governate_Box = By.xpath("//span[@aria-label='اختر المحافظة']");
    By Govrnaete = By.xpath("//span[@class='ng-star-inserted'][contains(text(),'الاسكندرية')]");
    By Center_Box = By.xpath("//span[@aria-label='اختر المركز / القسم']");
    By Center = By.xpath("//span[@class='ng-star-inserted'][contains(text(),'الرمل')]");
    By Address = By.xpath("//input[@placeholder='ادخل العنوان بالتفصيل']");
    By Working_Statues_Radio_Button = By.xpath("//*[@id=\"workStatus-1\"]");
    By Education_Radio_Button = By.xpath("//*[@id=\"studyStatus-1\"]");
    By Health_Radio_Button = By.xpath("//*[@id=\"healthStatus-1\"]");
    By Water_Source = By.xpath("//*[@id=\"waterSource-1\"]");
    By Next = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[11]/button");

    /*****************************************************          Step 2    ********************************************************************/
    By Confirm_Button = By.xpath("//button[contains(text(),'تأكيد')]");

    /******************************************************************************************************************/
    public Benfeficiaries_NotMarried(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);
    }
    public void createBenefiters_NotMarried_Step1(String NID, String MOB_NUM,String Addriss) throws InterruptedException {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(add_Beneficiaries_Button)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Name)).sendKeys("سلمي محمد محمد");
            wait.until(ExpectedConditions.elementToBeClickable(Natonaial_ID)).sendKeys(NID);
            wait.until(ExpectedConditions.elementToBeClickable(Phone)).sendKeys(MOB_NUM);
            wait.until(ExpectedConditions.elementToBeClickable(Margie_Statues_Radio_Button_NotMarred)).click();
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Governate_Box)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Govrnaete)).click();
            Thread.sleep(150);
            wait.until(ExpectedConditions.elementToBeClickable(Center_Box)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Center)).click();
            Thread.sleep(150);
            wait.until(ExpectedConditions.elementToBeClickable(Address)).sendKeys("شارع محمد محمد");
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Working_Statues_Radio_Button)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Education_Radio_Button)).click();
            Thread.sleep(150);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Health_Radio_Button)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Water_Source)).click();
            Thread.sleep(150);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Next)).click();
        } catch (TimeoutException e) {
            System.out.println("حدث خطأ: العنصر لم يكن قابلاً للنقر عليه في الوقت المحدد. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("حدث خطأ: العنصر غير موجود في الصفحة. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("حدث خطأ غير متوقع: " + e.getMessage());
        }
    }

    public void CreatBenfiters_LastStage(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(Confirm_Button)).click();
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

