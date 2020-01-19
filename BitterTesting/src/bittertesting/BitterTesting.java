/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bittertesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ethan
 */
public class BitterTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ethan\\OneDrive\\Desktop\\School\\Year 2\\Quality Assurance Testing\\chromedriver_win32\\chromedriver.exe");
        int bug = 0;

       
        boolean test01 = UnitTestSignUp.CreateUser(); //Test 1 Successfully insert new user
        if(test01)System.out.println("Test01: passed");
        else {System.out.println("Test1 failed"); bug++;} 
      
        
        boolean test02 = UnitTestSignUp.CreateUser("nick"); //Test 2 not create another nick user
        if(test02){System.out.println("Test02: Created new user, Test02 fail"); bug++;}
        else System.out.println("Test02: Did not create dupilicate user, Test02 passed");
      
        boolean test03 = UnitTestSignUp.CreateUser("password" ,"password1");//Test 3 should not create new user because passwords do not match
        if(test03){System.out.println("Test03: Created new user, Test03 fail"); bug++;}
        else System.out.println("Test03: Did not create user because passwords do not match, Test03 passed"); 
      
        boolean test04 = UnitTestSignUp.CreateUser(7, "A1A 1A1"); //Test 4 should not create a new user because postal code belongs to NewFoundland and New Brunswick is selected
        if(test04){System.out.println("Test04: Created new user, Test04 fail (This is a bug)"); bug++; }
        else System.out.println("Test04: Did not create new user because postal did not match province, Test04 passed"); 
        
        boolean test05 = UnitTestSignUp.CreateUser(123); //Test 5 should not create a user because phone number is invalid
        if(test05) {System.out.println("Test05: Created new user, Test05 fail (this is a bug)"); bug++;}
        else System.out.println("Test05: Did not create new user because phone number was invalid, Test05 passed"); 
      
        boolean test06 = UnitTestLogin.loginTest("nick", "asdf"); //Test 6 should login
        if(test06) System.out.println("Test06: Logged In Successfully, Test06 passed");
        else {System.out.println("Test06: Did not login, Test06 failed"); bug++;} 
      
        boolean test07 = UnitTestLogin.login("nick"); //Test 7 should not login since no password
        if(test07){ System.out.println("Test07: Logged in, Test07 fail"); bug++; }
        else System.out.println("Test07: Did not login, Test07 passed"); 
      
        boolean test08 = UnitTestLogin.login(); //Test 8 should not login since random username and passwords are entered
        if(test08) {System.out.println("Test08: Logged in, Test08 failed"); bug++;}
        else System.out.println("Test08: Did not login, Test08 passed"); 
        
        boolean test09 = UnitTestLogin.login2("nick", "fdsa"); //Test should not login since password is incorrect
        if(test09){ System.out.println("Test09: Logged in, Test09 failed"); bug++;}
        else System.out.println("Test09: Did not login, Test09 passed"); 
      
        
        WebDriver test10 = UnitTestLogin.login("nick", "asdf"); //this test should post tweet
            if(test10 != null){ 
               boolean test = UnitTestIndex.sendTweet(test10,"this is a tweet");
               if(test) System.out.println("Test10: Posted Tweet, Test10 passed");
               else{ System.out.println("Test10: Did not post tweet, Test10 failed"); bug++;}
            } 
      
        WebDriver test11 = UnitTestLogin.login("nick", "asdf"); //this test should log the user out
            if(test11 != null){ 
               boolean test = UnitTestIndex.logout(test11);
               if(test) System.out.println("Test11: Logged Out, Test11 passed");
               else {System.out.println("Test11: Did not logout, Test11 failed bug"); bug++;}
            } 
       
        WebDriver test12 = UnitTestLogin.login("nick", "asdf"); //this test should not search
            if(test12 != null){ 
               boolean test = UnitTestIndex.Search(test12);
               if(test) System.out.println("Test12: Did not search for empty textbox, Test12 passed");
               else {System.out.println("Test12: Searched, Test12 failed because searched for empty field BUG"); bug++;}
            } 
       
       WebDriver test13 = UnitTestLogin.login("nick", "asdf"); //this test should search for user ethan
            if(test13 != null){ 
               boolean test = UnitTestIndex.Search(test13, "ethan");
               if(test) System.out.println("Test13: Searched for ethan, Test13 passed");
               else {System.out.println("Test13: Searched, Test13 failed because searched for empty field BUG"); bug++;}
            } 
           
            boolean test14 = UnitTestLogin.CreateNewAccount(); //test should redirect to signup page
            if(test14){ 
                System.out.println("Test14, test passed by going to signup.php");
            } 
            else{
                System.out.println("Test14, test failed because did not go to signup.php"); bug++;
            } 
        
        boolean test15 = UnitTestLogin.ClickIndex(); //should just stay on login page
        if(test15){
            System.out.println("Test15: Stayed on login.php, test passed");
        }
        else{
            System.out.println("Test15: Left login.php, test failed BUG"); bug++;
        }
      
       
       WebDriver test16 = UnitTestLogin.login("nick", "asdf"); //this test should follow the top user on who to troll
            if(test16 != null){ 
               boolean test = UnitTestIndex.Follow(test16);
               if(test) System.out.println("Test16: Successfully followed user, test16 passed");
               else {System.out.println("Test16: Searched, Test16 failed to follow BUG"); bug++;}
            }
            
        WebDriver test17 = UnitTestLogin.login("nick", "ASDF"); //Test 17 should not login because password is all caps
        if(test17 != null){ System.out.println("Test17: Logged In Successfully, Test17 failed"); bug++;}
        else System.out.println("Test17: Did not login, Test17 passed"); 
            
     WebDriver test18 = UnitTestLogin.login("nick", "asdf"); //this test should retweet the top tweet on newsfeed
            if(test18 != null){ 
               boolean test = UnitTestIndex.Retweet(test18);
               if(test) System.out.println("Test18: Successfully retweeted, test16 passed");
               else {System.out.println("Test18: Test16 failed to retweet BUG"); bug++;}
            }
     
      
     WebDriver test19 = UnitTestLogin.login("nick", "asdf"); //this test should redirect to userpage.php
            if(test19 != null){ 
               boolean test = UnitTestIndex.userPage(test19);
               if(test) System.out.println("Test19: Successfully reached userpage.php, test19 passed");
               else System.out.println("Test19: Test19 failed to reach userpage.php BUG");
            }
      //At this point i have 19 test and 4 bugs
      
       
       WebDriver test20 = UnitTestLogin.login("nick", "asdf"); //this test should post reply to a tweet
            if(test20 != null){ 
               boolean test = UnitTestIndex.replyTweet(test20);
               if(test) System.out.println("Test20: Successfully replied to tweet, test20 passed");
               else {System.out.println("Test20: failed to reply to tweet BUG"); bug++;}
            }
            
            
       WebDriver test21 = UnitTestLogin.login("nick", "asdf"); //this show redirect to userpage.php
            if(test21 != null){ 
               boolean test = UnitTestIndex.userPage2(test21);
               if(test) System.out.println("Test21: Successfully reached userpage.php, test21 passed");
               else {System.out.println("Test21: Test21 failed to reach userpage.php BUG"); bug++;}
            }
       
       
       boolean test22 = UnitTestLogin.SkipToIndex(); //user needs to be logged in to access index.php
            if(test22){                
               System.out.println("Test22: Redirected to login.php, Test 22 pass");  
            }
            else {System.out.println("Test22: Redirected to index.php, Test 22 Fail"); bug++;}
         
            
       boolean test23 = UnitTestLogin.SkipToUserPage(); //user needs to be logged in to access userpage.php
            if(test23){                
               System.out.println("Test22: Redirected to login.php, Test 23 pass");  
            }
            else {System.out.println("Test22: Redirected to userpage.php, Test 23 Fail"); bug++;}
       
       boolean test24 = UnitTestLogin.SkipToUserPage(1); //user needs to be logged in to access userpage.php
            if(test24){                
               System.out.println("Test24: Redirected to login.php, Test 24 pass");  
            }
            else {System.out.println("Test24: Redirected to userpage.php?user_id=34, Test 24 Fail"); bug++;}
       
       boolean test25 = UnitTestLogin.SkipToSearchPage();
             if(test25){                
               System.out.println("Test25: Redirected to login.php, Test 25 pass");  
            }
            else {System.out.println("Test25: Redirected to search.php, Test 25 Fail"); bug++;}
       
       
        System.out.println("There were " + bug + " bugs found");
    }
    
}











/*  FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en"), new RandomService());
        
        Faker faker = new Faker();
        
        //String firstName = faker.name().firstName();
        
        //CAn also use numerify and letterify()
        String strRandomLettersAndNumbers = faker.bothify("???##????.##??##@gmail.com");
        System.out.println(strRandomLettersAndNumbers);
        */