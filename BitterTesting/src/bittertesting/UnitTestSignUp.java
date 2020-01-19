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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author ethan
 */
public class UnitTestSignUp {
    // can use the same function and just overload parameters to do multiple use cases
    public static boolean CreateUser(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/signup.php");
        
        WebElement txtFirstName = WebElementsSignUp.txtFirstName(driver);
        WebElement txtLastName = WebElementsSignUp.txtLastName(driver);
        WebElement txtEmail = WebElementsSignUp.txtEmail(driver);
        WebElement txtUsername = WebElementsSignUp.txtUsername(driver);
        WebElement txtPassword = WebElementsSignUp.txtPassword(driver);
        WebElement txtConfirm = WebElementsSignUp.txtConfirm(driver);
        WebElement txtPhone = WebElementsSignUp.txtPhone(driver);
        WebElement txtAddress = WebElementsSignUp.txtAddress(driver);
        WebElement txtPostal = WebElementsSignUp.txtPostalCode(driver);
        WebElement txtUrl = WebElementsSignUp.txtUrl(driver);
        WebElement txtDesc = WebElementsSignUp.txtDesc(driver);
        WebElement txtLocation = WebElementsSignUp.txtLocation(driver);
        Select cboProv = WebElementsSignUp.cboProv(driver);
        WebElement btnButton = WebElementsSignUp.btnRegister(driver);
        
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        
        Faker faker = new Faker();
        
        String strFirstName = faker.name().firstName();
        String strLastName = faker.name().lastName();
      
        
           String strUsername = strFirstName + "." + strLastName;
        
        
        
            String strPassword = faker.bothify("?????###??#");
        
        
   //     String strUsername = strFirstName + "." + strLastName;
        String strEmail = strUsername + "@fake.nbcc.ca";
    //    String strPassword = faker.bothify("?????###??#");
         
        
        
        txtFirstName.sendKeys(strFirstName);
        txtLastName.sendKeys(strLastName);
        txtUsername.sendKeys(strUsername);
        txtPassword.sendKeys(strPassword);
        txtConfirm.sendKeys(strPassword);
        txtPhone.sendKeys(faker.numerify("(###)###-####"));
        txtEmail.sendKeys(strEmail);
        txtAddress.sendKeys(faker.address().streetAddress());
        //txtPostal.sendKeys(faker.bothify("?#? #?#"));
        txtPostal.sendKeys("A1A 1A1");
        txtUrl.sendKeys(faker.internet().url());
        txtDesc.sendKeys(faker.chuckNorris().fact());
        txtLocation.sendKeys(faker.address().country());
        cboProv.selectByIndex(6);
        btnButton.click();
        
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
    }//end of createuser(driver)
    
    public static boolean CreateUser(String username){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/signup.php");
        
        WebElement txtFirstName = WebElementsSignUp.txtFirstName(driver);
        WebElement txtLastName = WebElementsSignUp.txtLastName(driver);
        WebElement txtEmail = WebElementsSignUp.txtEmail(driver);
        WebElement txtUsername = WebElementsSignUp.txtUsername(driver);
        WebElement txtPassword = WebElementsSignUp.txtPassword(driver);
        WebElement txtConfirm = WebElementsSignUp.txtConfirm(driver);
        WebElement txtPhone = WebElementsSignUp.txtPhone(driver);
        WebElement txtAddress = WebElementsSignUp.txtAddress(driver);
        WebElement txtPostal = WebElementsSignUp.txtPostalCode(driver);
        WebElement txtUrl = WebElementsSignUp.txtUrl(driver);
        WebElement txtDesc = WebElementsSignUp.txtDesc(driver);
        WebElement txtLocation = WebElementsSignUp.txtLocation(driver);
        Select cboProv = WebElementsSignUp.cboProv(driver);
        WebElement btnButton = WebElementsSignUp.btnRegister(driver);
        
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        
        Faker faker = new Faker();
        
        String strFirstName = faker.name().firstName();
        String strLastName = faker.name().lastName();
      
        
           String strUsername = username;
        
        
        
            String strPassword = faker.bothify("?????###??#");
        
        
   //     String strUsername = strFirstName + "." + strLastName;
        String strEmail = strUsername + "@fake.nbcc.ca";
    //    String strPassword = faker.bothify("?????###??#");
         
        
        
        txtFirstName.sendKeys(strFirstName);
        txtLastName.sendKeys(strLastName);
        txtUsername.sendKeys(strUsername);
        txtPassword.sendKeys(strPassword);
        txtConfirm.sendKeys(strPassword);
        txtPhone.sendKeys(faker.numerify("(###)###-####"));
        txtEmail.sendKeys(strEmail);
        txtAddress.sendKeys(faker.address().streetAddress());
        //txtPostal.sendKeys(faker.bothify("?#? #?#"));
        txtPostal.sendKeys("A1A 1A1");
        txtUrl.sendKeys(faker.internet().url());
        txtDesc.sendKeys(faker.chuckNorris().fact());
        txtLocation.sendKeys(faker.address().country());
        cboProv.selectByIndex(6);
        btnButton.click();
        driver.switchTo().alert().accept();
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
    }//end of createuser(driver, strUsername)
    
     public static boolean CreateUser(String password, String password1){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/signup.php");
        
        WebElement txtFirstName = WebElementsSignUp.txtFirstName(driver);
        WebElement txtLastName = WebElementsSignUp.txtLastName(driver);
        WebElement txtEmail = WebElementsSignUp.txtEmail(driver);
        WebElement txtUsername = WebElementsSignUp.txtUsername(driver);
        WebElement txtPassword = WebElementsSignUp.txtPassword(driver);
        WebElement txtConfirm = WebElementsSignUp.txtConfirm(driver);
        WebElement txtPhone = WebElementsSignUp.txtPhone(driver);
        WebElement txtAddress = WebElementsSignUp.txtAddress(driver);
        WebElement txtPostal = WebElementsSignUp.txtPostalCode(driver);
        WebElement txtUrl = WebElementsSignUp.txtUrl(driver);
        WebElement txtDesc = WebElementsSignUp.txtDesc(driver);
        WebElement txtLocation = WebElementsSignUp.txtLocation(driver);
        Select cboProv = WebElementsSignUp.cboProv(driver);
        WebElement btnButton = WebElementsSignUp.btnRegister(driver);
        
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        
        Faker faker = new Faker();
        
        String strFirstName = faker.name().firstName();
        String strLastName = faker.name().lastName();
      
        
           String strUsername = strFirstName + "." + strLastName;
        
        
        
            String strPassword = faker.bothify("?????###??#");
        
        
   //     String strUsername = strFirstName + "." + strLastName;
        String strEmail = strUsername + "@fake.nbcc.ca";
    //    String strPassword = faker.bothify("?????###??#");
         
        
        
        txtFirstName.sendKeys(strFirstName);
        txtLastName.sendKeys(strLastName);
        txtUsername.sendKeys(strUsername);
        txtPassword.sendKeys(password);
        txtConfirm.sendKeys(password1);
        txtPhone.sendKeys(faker.numerify("(###)###-####"));
        txtEmail.sendKeys(strEmail);
        txtAddress.sendKeys(faker.address().streetAddress());
        //txtPostal.sendKeys(faker.bothify("?#? #?#"));
        txtPostal.sendKeys("A1A 1A1");
        txtUrl.sendKeys(faker.internet().url());
        txtDesc.sendKeys(faker.chuckNorris().fact());
        txtLocation.sendKeys(faker.address().country());
        cboProv.selectByIndex(6);
        btnButton.click();
        driver.switchTo().alert().accept();
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
    }//end of createuser(driver, passsword, password1)
     
    public static boolean CreateUser(int prov, String postal){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/signup.php");
        
        WebElement txtFirstName = WebElementsSignUp.txtFirstName(driver);
        WebElement txtLastName = WebElementsSignUp.txtLastName(driver);
        WebElement txtEmail = WebElementsSignUp.txtEmail(driver);
        WebElement txtUsername = WebElementsSignUp.txtUsername(driver);
        WebElement txtPassword = WebElementsSignUp.txtPassword(driver);
        WebElement txtConfirm = WebElementsSignUp.txtConfirm(driver);
        WebElement txtPhone = WebElementsSignUp.txtPhone(driver);
        WebElement txtAddress = WebElementsSignUp.txtAddress(driver);
        WebElement txtPostal = WebElementsSignUp.txtPostalCode(driver);
        WebElement txtUrl = WebElementsSignUp.txtUrl(driver);
        WebElement txtDesc = WebElementsSignUp.txtDesc(driver);
        WebElement txtLocation = WebElementsSignUp.txtLocation(driver);
        Select cboProv = WebElementsSignUp.cboProv(driver);
        WebElement btnButton = WebElementsSignUp.btnRegister(driver);
        
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        
        Faker faker = new Faker();
        
        String strFirstName = faker.name().firstName();
        String strLastName = faker.name().lastName();
      
        
           String strUsername = strFirstName + "." + strLastName;
        
        
        
            String strPassword = faker.bothify("?????###??#");
        
        
   //     String strUsername = strFirstName + "." + strLastName;
        String strEmail = strUsername + "@fake.nbcc.ca";
    //    String strPassword = faker.bothify("?????###??#");
         
        
        
        txtFirstName.sendKeys(strFirstName);
        txtLastName.sendKeys(strLastName);
        txtUsername.sendKeys(strUsername);
        txtPassword.sendKeys(strPassword);
        txtConfirm.sendKeys(strPassword);
        txtPhone.sendKeys(faker.numerify("(###)###-####"));
        txtEmail.sendKeys(strEmail);
        txtAddress.sendKeys(faker.address().streetAddress());
        //txtPostal.sendKeys(faker.bothify("?#? #?#"));
        txtPostal.sendKeys(postal);
        txtUrl.sendKeys(faker.internet().url());
        txtDesc.sendKeys(faker.chuckNorris().fact());
        txtLocation.sendKeys(faker.address().country());
        cboProv.selectByIndex(prov);
        btnButton.click();
        //driver.switchTo().alert().accept();
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
    }//end of createuser(driver, int prov, String postal) 
    
    public static boolean CreateUser(int phone){
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.10.0.30/qa/joshkd/signup.php");
        
        WebElement txtFirstName = WebElementsSignUp.txtFirstName(driver);
        WebElement txtLastName = WebElementsSignUp.txtLastName(driver);
        WebElement txtEmail = WebElementsSignUp.txtEmail(driver);
        WebElement txtUsername = WebElementsSignUp.txtUsername(driver);
        WebElement txtPassword = WebElementsSignUp.txtPassword(driver);
        WebElement txtConfirm = WebElementsSignUp.txtConfirm(driver);
        WebElement txtPhone = WebElementsSignUp.txtPhone(driver);
        WebElement txtAddress = WebElementsSignUp.txtAddress(driver);
        WebElement txtPostal = WebElementsSignUp.txtPostalCode(driver);
        WebElement txtUrl = WebElementsSignUp.txtUrl(driver);
        WebElement txtDesc = WebElementsSignUp.txtDesc(driver);
        WebElement txtLocation = WebElementsSignUp.txtLocation(driver);
        Select cboProv = WebElementsSignUp.cboProv(driver);
        WebElement btnButton = WebElementsSignUp.btnRegister(driver);
        
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        
        Faker faker = new Faker();
        
        String strFirstName = faker.name().firstName();
        String strLastName = faker.name().lastName();
      
        
           String strUsername = strFirstName + "." + strLastName;
        
        
        
            String strPassword = faker.bothify("?????###??#");
        
        
   //     String strUsername = strFirstName + "." + strLastName;
        String strEmail = strUsername + "@fake.nbcc.ca";
    //    String strPassword = faker.bothify("?????###??#");
         
        String strPhone = Integer.toString(phone);
        
        txtFirstName.sendKeys(strFirstName);
        txtLastName.sendKeys(strLastName);
        txtUsername.sendKeys(strUsername);
        txtPassword.sendKeys(strPassword);
        txtConfirm.sendKeys(strPassword);
        txtPhone.sendKeys(strPhone);
        txtEmail.sendKeys(strEmail);
        txtAddress.sendKeys(faker.address().streetAddress());
        //txtPostal.sendKeys(faker.bothify("?#? #?#"));
        txtPostal.sendKeys("E7G 2K1");
        txtUrl.sendKeys(faker.internet().url());
        txtDesc.sendKeys(faker.chuckNorris().fact());
        txtLocation.sendKeys(faker.address().country());
        cboProv.selectByIndex(7);
        
    /*    try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BitterUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        btnButton.click();
      //  driver.switchTo().alert().accept();
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
    }//end of createuser(driver, int phone) 
}
