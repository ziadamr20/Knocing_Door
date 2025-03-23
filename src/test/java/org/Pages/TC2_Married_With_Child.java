package org.Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC2_Married_With_Child extends Setup {

    @BeforeClass
    public void Setup_browser_() throws IOException {
        setup_browser();
        increaseNID(); // تحديث قيمة الـ NID أولاً
    }

    @Test (priority = 0)
    public void URL_OPEN() throws InterruptedException {
        driver.get(config_knocingDoors.getProperty("Knocing_url"));
        loginPage.login(config_knocingDoors.getProperty("username"),config_knocingDoors.getProperty("password"));
        }

    @Test (priority = 1)
    public void step1() throws InterruptedException {
            benfiters.createBenefiters_Step1(config_knocingDoors.getProperty("NID"),
            config_knocingDoors.getProperty("MOB_NUM"));
    }
    @Test (priority = 2)
    public void Step2(){
    benfiters.CreatBenfiters_Married_Step2(config_knocingDoors.getProperty("Hasband_NID"));
    }
    @Test (priority = 3)
    public void Step3() {
        benfiters.CreatBenfiters_Married_step3(config_knocingDoors.getProperty("Kid_Number"), config_knocingDoors.getProperty("Bigger_Kid"),
                config_knocingDoors.getProperty("NaturalBirth"), config_knocingDoors.getProperty("caesarsection"),
                config_knocingDoors.getProperty("Marigae_Question"), config_knocingDoors.getProperty("Pregnant_Time"));
    }
    @Test (priority = 4)
    public void Step4(){
        benfiters.CreatBenfiters_Married_Step4();
    }
    @Test(priority = 5)
    public void Step5(){
        benfiters.CreatBenfiters_Married_Step5(config_knocingDoors.getProperty("Age_month"),
                config_knocingDoors.getProperty("Age_Year"));
    }
    @Test (priority = 6)
//    public void LastStep(){
//        benfiters.CreatBenfiters_Married_LastStage();
//    }
    @AfterClass
    public void Quit(){
        if (driver != null) {
//            driver.quit();
        }
    }
}