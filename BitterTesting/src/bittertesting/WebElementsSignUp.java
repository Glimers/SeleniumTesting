/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bittertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



/**
 *
 * @author ethan
 */
public class WebElementsSignUp {
    
    public static WebElement txtFirstName(WebDriver driver) {
        return driver.findElement(By.id("firstname"));
    }
    
    public static WebElement txtLastName(WebDriver driver){
        return driver.findElement(By.id("lastname"));
    }
    
    public static WebElement txtEmail(WebDriver driver){
        return driver.findElement(By.id("email"));
    }
    
    public static WebElement txtUsername(WebDriver driver){
        return driver.findElement(By.id("username"));
    }
    
    public static WebElement txtPassword(WebDriver driver){
        return driver.findElement(By.id("password"));
    }
    
    public static WebElement txtConfirm(WebDriver driver){
        return driver.findElement(By.id("confirm"));
    }
    
    public static WebElement txtPhone(WebDriver driver){
        return driver.findElement(By.id("phone"));
    }
    
    public static WebElement txtAddress(WebDriver driver){
        return driver.findElement(By.id("address"));
    }
    
    public static WebElement txtPostalCode(WebDriver driver){
        return driver.findElement(By.id("postalCode"));
    }
    
    public static WebElement txtUrl(WebDriver driver){
        return driver.findElement(By.id("url"));
    }
    
    public static WebElement txtDesc(WebDriver driver){
        return driver.findElement(By.id("desc"));
    }
    
    public static WebElement txtLocation(WebDriver driver){
        return driver.findElement(By.id("location"));
    }
    
    public static Select cboProv(WebDriver driver){
        return new Select(driver.findElement(By.id("province")));   
    }
    
    public static WebElement btnRegister(WebDriver driver){
        return driver.findElement(By.id("button"));
    }
    
}
