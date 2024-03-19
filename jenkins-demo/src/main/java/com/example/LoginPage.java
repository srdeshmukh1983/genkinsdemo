package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPage extends BasePage{
     
     public LoginPage(WebDriver driver) {
         super(driver);
         
    }
     
    @FindBy(name = "username")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
  
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement login;
  
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public  WebElement errorMessage;
    
     
    public void login(String strUserName, String strPassword) {
          
        userName.sendKeys(strUserName);
        password.sendKeys(strPassword);
        login.click();
  
    }
   
    
    public String getErrorMessage() {
        return errorMessage.getText();
    }
     
  
}