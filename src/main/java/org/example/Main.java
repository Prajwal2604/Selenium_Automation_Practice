package org.example;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String currentUrl = driver.getCurrentUrl();
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        String ExpectedTitle = "Automation Testing Practice";
        WebElement btn = driver.findElement(By.name("login"));
        btn.click();
        System.out.println(btn.isSelected());
        System.out.println("Login Successful");

//        List<WebElement> options = driver.findElements(By.cssSelector("input[name='username']"));
//
//        for (WebElement option : options) {
//            if (option.getText().equalsIgnoreCase("admin")) {
//                option.click();
//            }
//        }
//        driver.switchTo().frame(driver.findElement(By.id("login_form")));
//
//        String ParentWindow = driver.getWindowHandle();
//        Set<String> Windows = driver.getWindowHandles();
//
//        for (String window : Windows) {
//            if (!window.equals(ParentWindow)) {
//                driver.switchTo().window(window);
//            }
//        }
//
//        JavascriptExecutor js =  (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView()", btn);
//        System.out.println(options);
//        Assert.assertEquals(ExpectedTitle, PageTitle);
//        driver.close();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
//        Name.sendKeys("Prajwal");
//
//        WebElement SimpleAlert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
//        SimpleAlert.click();
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();
//        wait.until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
        }
}