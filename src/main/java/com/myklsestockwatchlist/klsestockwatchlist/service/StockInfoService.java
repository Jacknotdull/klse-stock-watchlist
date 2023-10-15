package com.myklsestockwatchlist.klsestockwatchlist.service;

import com.myklsestockwatchlist.klsestockwatchlist.entity.StockInfo;
import com.myklsestockwatchlist.klsestockwatchlist.repository.StockInfoRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockInfoService {
    @Value("${gainer.api.url}")
    private String gainerURL;
    @Value("${loser.api.url}")
    private String loserURL;
    @Value("${chrome.driver.dir}")
    private String chromeDriverDIR;
    @Autowired
    private StockInfoRepository stockInfoRepository;

    @Scheduled(cron = "0 0 10,17 * * *") //run at 10am and 5pm daily
//    @Scheduled(cron = "0/10 * * * * *") //for program test run, run every 10 sec
    public void fetchStockInfo(){
        System.setProperty("webdriver.chrome.driver", chromeDriverDIR);
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(gainerURL);
            List<WebElement> gainerTrElements = driver.findElements(By.cssSelector("#dttable-stock-list > tbody > tr"));
            int gainerStockCount = gainerTrElements.size();

            driver.get(loserURL);
            List<WebElement> loserTrElements = driver.findElements(By.cssSelector("#dttable-stock-list > tbody > tr"));
            int loserStockCount = loserTrElements.size();

            StockInfo stockInfo = new StockInfo();
            stockInfo.setNumGainers(gainerStockCount);
            stockInfo.setNumLosers(loserStockCount);
            stockInfoRepository.save(stockInfo);
        }catch(Exception e){
            e.getMessage();
        }
        finally{
            driver.quit();
        }
    }
}
