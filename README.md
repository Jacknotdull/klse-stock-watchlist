# klse-stock-watchlist
To fetch KLSE stock information about number of gainer and loser daily and save it in DB\
Built using Spring Boot JPA, Postgres, Selenium
1. Go to https://googlechromelabs.github.io/chrome-for-testing/#stable to download latest Chrome Driver compatible for your machine
2. Configure your directory of Chrome Driver in application.properties
3. Download and setup Postgres DB, configure your username and password in application.properties
4. Create a database named klstocklist
5. Configure your local java version if required in pom.xml
6. Uncomment the cron expression("0/10 * * * * *") of fetchStockInfo() in StockInfoService class to test run the scheduling in every 10 seconds
