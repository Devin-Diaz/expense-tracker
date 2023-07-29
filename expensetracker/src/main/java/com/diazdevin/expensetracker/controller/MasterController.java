package com.diazdevin.expensetracker.controller;

import com.diazdevin.expensetracker.model.Expense;
import com.diazdevin.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MasterController {


    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "List Of Expenses");
        List<Expense> expenses = expenseService.findAll();
        mav.addObject("expenses", expenses);
        return mav;
    }

    @RequestMapping("/expense")
    public ModelAndView addExpense(){
        ModelAndView mav = new ModelAndView("expense");
        mav.addObject("expense", new Expense());
        return mav;
    }

    @RequestMapping(value = "/expense", method = RequestMethod.POST)
    public String save(@ModelAttribute("expense") Expense expense){
        expenseService.saveExpense(expense);
        return "redirect:/";
    }

    @RequestMapping(value = "/expense/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        ModelAndView mav = new ModelAndView("expense");
        Expense expense = expenseService.findById(id);
        mav.addObject("expense", expense);
        return mav;
    }

    @RequestMapping(value = "/expense/{id}/delete")
    public String delete(@PathVariable("id") Long id){
        expenseService.delete(id);
        return "redirect:/";
    }
}








