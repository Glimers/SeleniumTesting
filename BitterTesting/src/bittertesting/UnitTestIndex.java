/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bittertesting;

import static bittertesting.WebElementsIndex.btnLogout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author ethan
 */
public class UnitTestIndex {
    
    public static boolean sendTweet(WebDriver driver, String message){
        
        WebElement txtTweet = WebElementsIndex.txtTweet(driver);
        WebElement btnSend = WebElementsIndex.btnSend(driver);
        
        txtTweet.click();
        txtTweet.sendKeys(message);
        btnSend.click();
        btnSend.click();
        
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/index.php?message=You%20sucessfully%20tweeted!&msgHeader=Success!";
        
        if(strActualURL.equals(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
    } //end of sendTweet
    
    public static boolean logout(WebDriver driver){ 
        
        WebElement logoutDropdown = WebElementsIndex.picLogout(driver);
        WebElement logout = WebElementsIndex.btnLogout(driver);
        
        logoutDropdown.click();
        logout.click();
        
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/login.php";
        if(strActualURL.contains(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
   } //end fo logout
    
    public static boolean Search(WebDriver driver) { 
        
        WebElement btnSearch = WebElementsIndex.btnSearch(driver);
        WebElement txtSearch = WebElementsIndex.txtSearch(driver);
        
        
        btnSearch.click();
        
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/index.php";
        if(strActualURL.contains(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
   } //end of search() 
    
    public static boolean Search(WebDriver driver, String name){ 
        
        WebElement btnSearch = WebElementsIndex.btnSearch(driver);
        WebElement txtSearch = WebElementsIndex.txtSearch(driver);
        
        txtSearch.sendKeys(name);
        btnSearch.click();
        
        
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/Search.php";
        if(strActualURL.contains(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
   } //end of search(name)
    
    public static boolean Follow(WebDriver driver){
        
        WebElement btnFollow = WebElementsIndex.btnFollow(driver);
        btnFollow.click();
        
        WebElement txtSuccess = WebElementsIndex.txtSuccess(driver);
        String success = txtSuccess.getText();
        
        if(success.contains("Success")){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
        
       
    } //end of follow
    
     public static boolean Retweet(WebDriver driver){
        WebElement btnRetweet = WebElementsIndex.btnRetweet(driver);
        btnRetweet.click();
        
        WebElement txtSuccess = WebElementsIndex.txtSuccess(driver);
        String success = txtSuccess.getText();
        
        if(success.contains("Success")){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
        
       
    }//end of retweet
    
     public static boolean userPage(WebDriver driver){
         WebElement btnUserPage = WebElementsIndex.btnYourUserPage(driver);
         btnUserPage.click();
         
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/userpage.php?";
        if(strActualURL.contains(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
     }//end of userpage
    
    public static boolean replyTweet(WebDriver driver){
        WebElement btnReply = WebElementsIndex.btnReply(driver);
        btnReply.click();
        
        WebElement txtReply = WebElementsIndex.txtReply(driver);
        txtReply.sendKeys("1234");
        
        WebElement btnSendReply = WebElementsIndex.btnSendReply(driver);
        btnSendReply.click();
        
        WebElement btnShowReply = WebElementsIndex.btnShowReply(driver);
        String text = btnShowReply.getText();
        
        if(text.contains("Show")){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
    }//end of replytweet
    
    public static boolean userPage2(WebDriver driver){
         WebElement btnUserPage = WebElementsIndex.btnWhoToFollowUserPage(driver);
         btnUserPage.click();
         
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/userpage.php?";
        if(strActualURL.contains(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
     }//end of userpage2 this clicks on a user on the who to follow section
}
