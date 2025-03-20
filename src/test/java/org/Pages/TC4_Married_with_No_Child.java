package org.Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC4_Married_with_No_Child extends Setup {

    @BeforeClass
    public void Setup_browser_() throws IOException {
        setup_browser();
//        increaseNID();

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
        benfiters.CreatBenfiters_Married_step3_No_Child(config_knocingDoors.getProperty("kid_Number_No_Child"),
                config_knocingDoors.getProperty("Marigae_Question"), config_knocingDoors.getProperty("Pregnant_Time"));
    }

    @Test (priority = 4)
    public void Step4(){
        benfiters.CreatBenfiters_Married_Step4();
    }

    @Test (priority = 5)
    public void LastStep(){
        benfiters.CreatBenfiters_Married_LastStage();
    }
    @AfterClass
    public void Quit(){
        if (driver != null) {
            driver.quit();
        }
    }
}