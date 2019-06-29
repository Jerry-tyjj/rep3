package com.wangxj.mapper;

import com.wangxj.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();
}
