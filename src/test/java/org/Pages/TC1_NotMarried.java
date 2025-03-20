package org.Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC1_NotMarried extends Setup {

    @BeforeClass
    public void Setup() throws IOException {
        setup_browser();
    }
    @Test (priority = 0)
    public void URL_OPEN() throws InterruptedException {
        driver.get(config_knocingDoors.getProperty("Knocing_url"));
        loginPage.login(config_knocingDoors.getProperty("username"),config_knocingDoors.getProperty("password"));
    }
    @Test (priority = 1)
    public void Add_Benfeficary() throws InterruptedException {
        NotMarried.createBenefiters_NotMarried_Step1(config_knocingDoors.getProperty("NID")
                ,config_knocingDoors.getProperty("MOB_NUM"));
    }
    @Test (priority = 2)
    public void Add_Benficary_LastStage(){
        NotMarried.CreatBenfiters_LastStage();
    }

    @AfterClass
    public void Quit(){
        driver.quit();
    }
}