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
public class WebElementsIndex {
    
    public static WebElement txtTweet(WebDriver driver){
        return driver.findElement(By.id("myTweet"));
    } //probbly do .click first before send keys
    
    public static WebElement btnSend(WebDriver driver){
        return driver.findElement(By.id("button"));
    }
    
    public static WebElement picLogout(WebDriver driver){
        return driver.findElement(By.id("dropdown01"));
    }
    
   public static WebElement btnLogout(WebDriver driver){
        return driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
    }
   
   public static WebElement txtSearch(WebDriver driver){
       return driver.findElement(By.name("SearchParams"));
   }
   
   public static WebElement btnSearch(WebDriver driver){
       return driver.findElement(By.xpath("//button[contains(text(), 'Search')]"));
   }
   
   public static WebElement btnFollow(WebDriver driver){
       return driver.findElement(By.xpath("//div[@class='col-md-3']//div[2]//a[2]"));
   }
  
   public static WebElement txtSuccess(WebDriver driver){
       return driver.findElement(By.xpath("//strong[contains(text(),'Success!')]"));
   }
   
   public static WebElement btnRetweet(WebDriver driver){
       return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/a[2]/img[1]"));
   }
   
   public static WebElement btnYourUserPage(WebDriver driver){
       return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")); 
   }
   
   public static WebElement btnReply(WebDriver driver){
       return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/a[3]/img[1]"));
   }
   
   public static WebElement txtReply(WebDriver driver){
       return driver.findElement(By.name("reply_text"));
   }
   
   public static WebElement btnSendReply(WebDriver driver){
       return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]"));
   }
   
   public static WebElement btnShowReply(WebDriver driver){
       return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/a[1]"));
   }
   
   public static WebElement btnWhoToFollowUserPage(WebDriver driver){
       return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]"));
   }
}
