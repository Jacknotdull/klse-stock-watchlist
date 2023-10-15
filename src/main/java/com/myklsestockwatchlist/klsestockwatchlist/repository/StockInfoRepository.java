package com.myklsestockwatchlist.klsestockwatchlist.repository;

import com.myklsestockwatchlist.klsestockwatchlist.entity.StockInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockInfoRepository extends JpaRepository<StockInfo, Long> {
}
