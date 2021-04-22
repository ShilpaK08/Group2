package com.it;

import com.it.BaseClass.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class Stationary extends BaseClass
    {
            public static String ChooseSortBy = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/div/a[2]";
            public static String Ruled = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";

        public void PaperType(String papertype)
        {
            {
                driver.findElement(By.xpath(Ruled)).click();
            }

        }
        public void SelectSortby(String ChooseSortBy, int indexNo) {
            WebElement E = driver.findElement(By.xpath(ChooseSortBy));
            E.click();
            Actions keyDown = new Actions(driver);
            keyDown.sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.DOWN, Keys.DOWN})}).perform();
        }

        public void  OneItem(String item)
        {

            driver.findElement(By.xpath(item)).click();
        }

        public void QuickView(String View)
        {
            WebElement E = driver.findElement(By.xpath(View));
            E.click();
            driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[2]/a")).click();
        }


}
