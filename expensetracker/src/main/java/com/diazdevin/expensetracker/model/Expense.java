package com.diazdevin.expensetracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
@ToString
public class Expense {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long id;

    @Column(name="description")
    private String expenseName;

    private BigDecimal amount;

    private String note;

    private Long createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }


}
