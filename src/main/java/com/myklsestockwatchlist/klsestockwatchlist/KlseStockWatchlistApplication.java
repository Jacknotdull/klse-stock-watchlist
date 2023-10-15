package com.myklsestockwatchlist.klsestockwatchlist;

import com.myklsestockwatchlist.klsestockwatchlist.service.StockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KlseStockWatchlistApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(KlseStockWatchlistApplication.class, args);
		StockInfoService stockInfoService = context.getBean(StockInfoService.class);
		stockInfoService.fetchStockInfo();

	}

}
