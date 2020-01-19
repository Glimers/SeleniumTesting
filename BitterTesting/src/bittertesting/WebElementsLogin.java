/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bittertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author ethan
 */
public class WebElementsLogin {
    
    public static WebElement txtUsername(WebDriver driver){
        return driver.findElement(By.id("username"));
    }
    
    public static WebElement txtPassword(WebDriver driver){
        return driver.findElement(By.id("password"));
    }
    
    public static WebElement btnSubmit(WebDriver driver){
        return driver.findElement(By.id("button"));
    }
    
    public static WebElement btnClickHere(WebDriver driver){
        return driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]"));
    }
    
    public static WebElement btnIndex(WebDriver driver){
        return driver.findElement(By.xpath("//img[@class='logo']"));
    }
}
