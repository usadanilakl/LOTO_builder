package com.loto_builder.executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BrowserWindow {
    private static WebDriver driver = new ChromeDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(5));
    public static List<String> getPoints(){
        driver.get("C:/Users/usada/my_projects/Jackson/MyProject/index.html");
        WebElement trigger = driver.findElement(By.id("lotoSubmitTrigger"));
        System.out.println("Waiting");
        wait.until(ExpectedConditions.textToBe(By.id("lotoSubmitTrigger"),"done"));
        WebElement list = driver.findElement(By.id("lotoInfoList"));
        System.out.println("Getting the list");
        List<String> result = list.findElements(By.tagName("li"))
                .stream()
                        .map(e->e.findElement(By.className("point")).getText())
                                .collect(Collectors.toList());
        result.forEach(e-> System.out.println(e));
        driver.quit();
        return result;
    }

//    public static void main(String[] args) {
//        getPoints();
//    }

}
