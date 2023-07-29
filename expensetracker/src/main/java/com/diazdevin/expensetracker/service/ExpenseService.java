package com.diazdevin.expensetracker.service;

import com.diazdevin.expensetracker.model.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();

    void saveExpense(Expense expense);

    Expense findById(Long id);

    void delete(Long id);

}
