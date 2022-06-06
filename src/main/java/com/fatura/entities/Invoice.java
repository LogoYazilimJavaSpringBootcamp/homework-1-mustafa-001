package com.fatura.entities;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Invoice {
    private ZonedDateTime date;
    private BigDecimal amount;
    private Company company;

    public Invoice(ZonedDateTime date, BigDecimal amount, Company company) {
        this.date = date;
        this.amount = amount;
        this.company = company;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}