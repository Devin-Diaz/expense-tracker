package com.diazdevin.expensetracker.service;

import com.diazdevin.expensetracker.model.Expense;
import com.diazdevin.expensetracker.repository.ExpenseRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepo expenseRepo;

    @Override
    public List<Expense> findAll() {
        return expenseRepo.findAll();
    }

    @Override
    public void saveExpense(Expense expense) {
        expense.setCreatedAt(System.currentTimeMillis());
        expenseRepo.save(expense);
    }

    @Override
    public Expense findById(Long id) {
        if(expenseRepo.findById(id).isPresent()){
            return expenseRepo.findById(id).get();
        }
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Expense expense = findById(id);
        expenseRepo.delete(expense);
    }


}
