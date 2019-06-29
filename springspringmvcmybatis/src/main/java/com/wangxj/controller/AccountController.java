package com.wangxj.controller;

import com.wangxj.domain.Account;
import com.wangxj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        return "保存成功";
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Account> accountList = accountService.findAll();
        modelAndView.setViewName("findAll");
        modelAndView.addObject("accountList",accountList);
        return modelAndView;
    }

    public void save(){
        System.out.println("你好");
    }
}
