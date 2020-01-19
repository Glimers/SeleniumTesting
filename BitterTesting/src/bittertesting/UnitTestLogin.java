/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bittertesting;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import java.util.Locale;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ethan
 */
public class UnitTestLogin {
    public static WebDriver login(String username, String password){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement txtUsername = WebElementsLogin.txtUsername(driver);
        WebElement txtPassword = WebElementsLogin.txtPassword(driver);
        WebElement btnLogin = WebElementsLogin.btnSubmit(driver);
        
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
        
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/index.php";
        
        if(strActualURL.contains(strExpected)){
           // driver.close();
            return driver;
        }
        else{
            driver.close();
            return null;
        }
        
    }//end of login(username, password)
    
    public static boolean loginTest(String username, String password){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement txtUsername = WebElementsLogin.txtUsername(driver);
        WebElement txtPassword = WebElementsLogin.txtPassword(driver);
        WebElement btnLogin = WebElementsLogin.btnSubmit(driver);
        
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
        
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
        
    }//end of login(username, password)
    
    public static boolean login(String username){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement txtUsername = WebElementsLogin.txtUsername(driver);
        WebElement txtPassword = WebElementsLogin.txtPassword(driver);
        WebElement btnLogin = WebElementsLogin.btnSubmit(driver);
        
        txtUsername.sendKeys(username);
       // txtPassword.sendKeys(password);
        btnLogin.click();
        
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
        
    }//end of login(username)
    
    public static boolean login(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement txtUsername = WebElementsLogin.txtUsername(driver);
        WebElement txtPassword = WebElementsLogin.txtPassword(driver);
        WebElement btnLogin = WebElementsLogin.btnSubmit(driver);
        
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        Faker faker = new Faker();
        
        txtUsername.sendKeys(faker.name().username());
        txtPassword.sendKeys(faker.bothify("????##??##?"));
        btnLogin.click();
        
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
        
    }//end of login()
    
    public static boolean login2(String username, String password){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement txtUsername = WebElementsLogin.txtUsername(driver);
        WebElement txtPassword = WebElementsLogin.txtPassword(driver);
        WebElement btnLogin = WebElementsLogin.btnSubmit(driver);
        
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
        
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
        
    }//end of login2(username, password)
    
    public static boolean CreateNewAccount(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement btnClick = WebElementsLogin.btnClickHere(driver);
        btnClick.click();
        
        String strActualURL = driver.getCurrentUrl();
        String strExpected = "http://10.10.0.30/qa/joshkd/signup.php";
        
        if(strActualURL.contains(strExpected)){
            driver.close();
            return true;
        }
        else{
            driver.close();
            return false;
        }
    }
    
    public static boolean ClickIndex(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/login.php");
        
        WebElement btnIndex = WebElementsLogin.btnIndex(driver);
        btnIndex.click();
        
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
    }//end of click index
    
    public static boolean SkipToIndex(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/index.php");
        
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
    }//end of skip to index
    
    public static boolean SkipToUserPage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/userpage.php");
        
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
    }//end of skip to userpage
    
    public static boolean SkipToUserPage(int id){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/userpage.php?user_id=" + id);
        
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
    }//end of skip to userpage with id
    
    public static boolean SkipToSearchPage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/Search.php");
        
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
    }
}
