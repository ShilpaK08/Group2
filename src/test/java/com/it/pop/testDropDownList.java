package com.it.pop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testDropDownList extends DropDownList{
    @Test
    public void testDropDown() {

        selectDropDown(dropdown, 1);

        assertTrue(driver1.findElement(By.xpath(dropdown)).isEnabled());
    }
}
