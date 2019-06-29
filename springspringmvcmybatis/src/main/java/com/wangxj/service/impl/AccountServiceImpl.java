package com.wangxj.service.impl;

import com.wangxj.domain.Account;
import com.wangxj.mapper.AccountMapper;
import com.wangxj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountList = accountMapper.findAll();
        return accountList;
    }
}
