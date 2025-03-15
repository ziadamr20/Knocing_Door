package org.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Beneficiaries {
    private Actions actions;
    private WebDriver driver;
    private WebDriverWait wait;

    /*****************************************************          Step  1    ********************************************************************/
    By add_Beneficiaries_Button = By.xpath("//a[contains(text(),'اضافة سيدة')]");
    By Name = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[2]/div[1]/input");
    By Natonaial_ID = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[2]/div[2]/input");
    By Phone = By.xpath("//*[@id=\"cdk-stepper-0-content-0\"]/app-lady-form/form/div[3]/div[1]/input");
    By Margie_Statues_Radio_Button_NotMarred = By.xpath("//*[@id=\"maritalStatus-1\"]");
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

    By Hasband_Name = By.xpath("//*[@id=\"cdk-stepper-0-content-1\"]/app-husband-form/form/div[2]/div[1]/input");
    By Hasband_NID = By.xpath("//*[@id=\"cdk-stepper-0-content-1\"]/app-husband-form/form/div[2]/div[2]/input");
    By Hasband_Work_Statues = By.xpath("//*[@id=\"husband-workStatus-5\"]");
    By Hasband_Education = By.xpath("//*[@id=\"husband-studyStatus-3\"]");
    By Hasband_Health = By.xpath("//*[@id=\"husband-healthStatus-4\"]");
    By Next_Step2 = By.xpath("//*[@id=\"cdk-stepper-0-content-1\"]/app-husband-form/form/div[6]/button[2]");
    /*****************************************************          Step 3    ********************************************************************/

    By Kids_Number = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[2]/div[1]/input");
    By Bigger_Kid = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[2]/div[2]/input");
    By Natural_Birth = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[3]/div[1]/input");
    By caesarean_section = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[3]/div[2]/input");
    By Pregnant_Question = By.xpath("//*[@id=\"isPregnantNow-true\"]");
    By Mariage_Question = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[4]/div[2]/input");
    By Pregnanit_Month = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[4]/div[1]/div[2]/input");
    By Pregnant_Tracking = By.xpath("//*[@id=\"isFollowingPregnancy-true\"]");
    By Pregnant_Place = By.xpath("//*[@id=\"followingPregnancyType-1\"]");
    By Nurse_Vist = By.xpath("//*[@id=\"visitedBy-0\"]");
    By pregnant_time = By.xpath("//*[@id=\"durationBetweenPregnancies-1\"]");
    By Next_step3 = By.xpath("//*[@id=\"cdk-stepper-0-content-2\"]/app-health-form/form/div[7]/button[2]");

    /*****************************************************          Step 4    ********************************************************************/

    By Method_Using = By.xpath("//*[@id=\"isUsingNow-false\"]");
    By Method_2nd_Question= By.xpath("//*[@id=\"notUse-2\"]");
    By Method_Not_Using = By.xpath("//*[@id=\"stopReasonId-2\"]");
    By Next_step4 = By.xpath("//*[@id=\"cdk-stepper-0-content-3\"]/app-used-method-form/form/div[5]/button[2]");
    /*****************************************************          Step 5    ********************************************************************/
//    By kid_martial_Married = By.xpath("//input[@id='maritalStatusId-0-5']");
    By getKid_martial_Single = By.xpath("//input[@id='maritalStatusId-0-6']");
    By kid_age_month = By.xpath("//input[@placeholder='ادخل شهر']");
    By kid_age_year = By.xpath("//input[@placeholder='ادخل سنة']");
    By sex_male = By.xpath("//input[@id='gender-0-1']");
    By sex_female = By.xpath("//input[@id='gender-0-2']");
    By kid_education = By.xpath("//input[@id='studyStatusId-0-8']");
    By kid_work_status = By.xpath("//input[@id='workStatusId-0-5']");
    By kid_health = By.xpath("//input[@id='healthStatusId-0-4']");
    By Next_Step5 = By.xpath("(//button[@type='button'][contains(text(),'التالى')])[5]");

    /*****************************************************          final Stage  2    ********************************************************************/

    By Confirm_Button = By.xpath("//button[contains(text(),'تأكيد')]");
    /******************************************************************************************************************/

    public Beneficiaries(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);

    }

    public void createBenefiters_Step1(String NID, String MOB_NUM){
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
public void CreatBenfiters_Married_Step2(String NID){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(Hasband_Name)).sendKeys("محمد احمد خالد");
            wait.until(ExpectedConditions.elementToBeClickable(Hasband_NID)).sendKeys(NID);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Hasband_Work_Statues)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Hasband_Education)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Hasband_Health)).click();
            Thread.sleep(150);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Next_Step2)).click();
        }
        catch (TimeoutException e) {
            System.out.println("حدث خطأ: العنصر لم يكن قابلاً للنقر عليه في الوقت المحدد. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("حدث خطأ: العنصر غير موجود في الصفحة. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("حدث خطأ غير متوقع: " + e.getMessage());
        }

}
    public void CreatBenfiters_Married_step3(String KID_Number,String Biger_Kid, String NaturalBirthNumber, String caesareansection
              ,String MariageQuestion,String PregnantTime ){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Kids_Number)).sendKeys(KID_Number);
            wait.until(ExpectedConditions.elementToBeClickable(Bigger_Kid)).sendKeys(Biger_Kid);
            wait.until(ExpectedConditions.elementToBeClickable(Natural_Birth)).sendKeys(NaturalBirthNumber);
            wait.until(ExpectedConditions.elementToBeClickable(caesarean_section)).sendKeys(caesareansection);
            wait.until(ExpectedConditions.elementToBeClickable(Pregnant_Question)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Mariage_Question)).sendKeys(MariageQuestion);
            wait.until(ExpectedConditions.elementToBeClickable(Pregnanit_Month)).sendKeys(PregnantTime);
            wait.until(ExpectedConditions.elementToBeClickable(Pregnant_Tracking)).click();
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Pregnant_Place)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Nurse_Vist)).click();
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(pregnant_time)).click();
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Next_step3)).click();
        }
        catch (TimeoutException e) {
            System.out.println("حدث خطأ: العنصر لم يكن قابلاً للنقر عليه في الوقت المحدد. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("حدث خطأ: العنصر غير موجود في الصفحة. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("حدث خطأ غير متوقع: " + e.getMessage());
        }
    }
    public void CreatBenfiters_Married_Step4(){
        try{
            Thread.sleep(500);
            wait.until(ExpectedConditions.elementToBeClickable(Method_Using)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Method_2nd_Question)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Method_Not_Using)).click();
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(Next_step4)).click();

        }
        catch (TimeoutException e) {
            System.out.println("حدث خطأ: العنصر لم يكن قابلاً للنقر عليه في الوقت المحدد. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("حدث خطأ: العنصر غير موجود في الصفحة. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("حدث خطأ غير متوقع: " + e.getMessage());
        }
    }
    public void CreatBenfiters_Married_Step5(String Age_month , String Age_Year){
        try{
//            wait.until(ExpectedConditions.elementToBeClickable(kid_martial_Married)).click();
            wait.until(ExpectedConditions.elementToBeClickable(getKid_martial_Single)).click();
            wait.until(ExpectedConditions.elementToBeClickable(kid_age_month)).sendKeys(Age_month);
            wait.until(ExpectedConditions.elementToBeClickable(kid_age_year)).sendKeys(Age_Year);
            wait.until(ExpectedConditions.elementToBeClickable(sex_male)).click();
            wait.until(ExpectedConditions.elementToBeClickable(sex_female)).click();
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(kid_education)).click();
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            wait.until(ExpectedConditions.elementToBeClickable(kid_work_status)).click();
            wait.until(ExpectedConditions.elementToBeClickable(kid_health)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Next_Step5)).click();
        }
        catch (TimeoutException e) {
            System.out.println("حدث خطأ: العنصر لم يكن قابلاً للنقر عليه في الوقت المحدد. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("حدث خطأ: العنصر غير موجود في الصفحة. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("حدث خطأ غير متوقع: " + e.getMessage());
        }
    }

    public void CreatBenfiters_Married_LastStage(){
        try{
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_DOWN).perform();

            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
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

