package Utility;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tools {

    public static void Bekle(int sn) {
        // milli saniyye cinsinden beklediyi icin 1000 le carpilir
        // bekletme metoufu

        try {
            Thread.sleep(1000 * sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }
    }

    public static void successMessageValidation() {
        WebElement msgLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        org.testng.Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }


}
