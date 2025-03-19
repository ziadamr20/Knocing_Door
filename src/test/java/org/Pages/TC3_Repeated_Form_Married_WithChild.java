package org.Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC3_Repeated_Form_Married_WithChild extends Setup {

    @BeforeClass
    public void Setup_browser_() throws IOException, InterruptedException {
        setup_browser();
        driver.get(config_knocingDoors.getProperty("Knocing_url"));
        loginPage.login(config_knocingDoors.getProperty("username"), config_knocingDoors.getProperty("password"));

    }

    @Test(priority = 0)
    public void cycling_loop() throws IOException, InterruptedException {
        while (true) {
            driver.navigate().refresh();

            System.out.println("🔄 Starting New Cycle...");

            increaseNID();
            benfiters.createBenefiters_Step1(config_knocingDoors.getProperty("NID"), config_knocingDoors.getProperty("MOB_NUM"));

            benfiters.CreatBenfiters_Married_Step2(config_knocingDoors.getProperty("Hasband_NID"));

            benfiters.CreatBenfiters_Married_step3(
                    config_knocingDoors.getProperty("Kid_Number"),
                    config_knocingDoors.getProperty("Bigger_Kid"),
                    config_knocingDoors.getProperty("NaturalBirth"),
                    config_knocingDoors.getProperty("caesarsection"),
                    config_knocingDoors.getProperty("Marigae_Question"),
                    config_knocingDoors.getProperty("Pregnant_Time")
            );

            benfiters.CreatBenfiters_Married_Step4();

            benfiters.CreatBenfiters_Married_Step5(
                    config_knocingDoors.getProperty("Age_month"),
                    config_knocingDoors.getProperty("Age_Year")
            );

            benfiters.CreatBenfiters_Married_LastStage();
            Thread.sleep(3000);
            System.out.println("✅ Cycle Finished! Restarting...\n");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void Quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
