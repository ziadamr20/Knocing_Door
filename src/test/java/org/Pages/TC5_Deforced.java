package org.Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC5_Deforced extends Setup {

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
        Deforce.createBenefiters_Diforced_Step1(config_knocingDoors.getProperty("NID"),config_knocingDoors.getProperty("MOB_NUM"));
    }

    @Test (priority = 2)
    public void Step2() {
        Deforce.CreatBenfiters_Deforce_step2(config_knocingDoors.getProperty("Kid_Number"), config_knocingDoors.getProperty("Bigger_Kid"),
                config_knocingDoors.getProperty("NaturalBirth"), config_knocingDoors.getProperty("caesarsection"),
                config_knocingDoors.getProperty("Marigae_Question"), config_knocingDoors.getProperty("Pregnant_Time"));
    }
    @Test(priority = 3)
    public void Step3(){
        Deforce.CreatBenfiters_Defroce_Child_Step3(config_knocingDoors.getProperty("Age_month"),
                config_knocingDoors.getProperty("Age_Year"));
    }
    @Test (priority = 4)
    public void LastStep(){
        Deforce.CreatBenfiters_Deforce_LastStage();
    }
    @AfterClass
    public void Quit(){
        if (driver != null) {
//            driver.quit();
        }
    }
}