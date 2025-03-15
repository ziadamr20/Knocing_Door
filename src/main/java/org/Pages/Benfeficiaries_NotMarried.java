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

    By Name = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[2]/div[1]/input");
    By Natonaial_ID = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[2]/div[2]/input");
    By Phone = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[3]/div[1]/input");
    By Margie_Statues_Radio_Button_NotMarred = By.xpath("//*[@id=\"maritalStatus-4\"]");
    By Governate_Box = By.xpath("//*[@id=\"pn_id_1\"]/div");
    By Govrnaete = By.xpath("//*[@id=\"pn_id_1_0\"]");
    By Center_Box = By.xpath("//*[@id=\"pn_id_3\"]/div");
    By Center = By.xpath("//*[@id=\"pn_id_3_0\"]");
    By Address = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[6]/div/input");
    By Working_Statues_Radio_Button = By.xpath("//*[@id=\"workStatus-1\"]");
    By Education_Radio_Button = By.xpath("//*[@id=\"studyStatus-1\"]");
    By Health_Radio_Button = By.xpath("//*[@id=\"healthStatus-1\"]");
    By Water_Source = By.xpath("//*[@id=\"waterSource-1\"]");
    By Next = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[11]/button");

    /*****************************************************          Step 2    ********************************************************************/
    By Confirm_Button = By.xpath("//*[@id=\"cdk-stepper-0-content-1\"]/div[2]/button[2]");
    /******************************************************************************************************************/
    public Benfeficiaries_NotMarried(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);
    }
    public void createBenefiters_NotMarried_Step1(String NID, String MOB_NUM,String Addriss) throws InterruptedException {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Name)).sendKeys("سلمي محمد محمد");
            wait.until(ExpectedConditions.elementToBeClickable(Natonaial_ID)).sendKeys(NID);
            wait.until(ExpectedConditions.elementToBeClickable(Phone)).sendKeys(MOB_NUM);
            wait.until(ExpectedConditions.elementToBeClickable(Margie_Statues_Radio_Button_NotMarred)).click();
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
            wait.until(ExpectedConditions.elementToBeClickable(Health_Radio_Button)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Water_Source)).click();
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

