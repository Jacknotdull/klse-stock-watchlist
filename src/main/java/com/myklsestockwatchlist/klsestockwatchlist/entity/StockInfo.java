package com.myklsestockwatchlist.klsestockwatchlist.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_info")
public class StockInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private LocalDateTime recordDatetime;
    private int numGainers;
    private int numLosers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getRecordDatetime() {
        return recordDatetime;
    }

    public void setRecordDatetime(LocalDateTime recordDatetime) {
        this.recordDatetime = recordDatetime;
    }

    public int getNumGainers() {
        return numGainers;
    }

    public void setNumGainers(int numGainers) {
        this.numGainers = numGainers;
    }

    public int getNumLosers() {
        return numLosers;
    }

    public void setNumLosers(int numLosers) {
        this.numLosers = numLosers;
    }
}
