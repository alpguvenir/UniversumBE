package com.application.universum.account.controller;

import com.application.universum.account.entity.Account;
import com.application.universum.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired private AccountService accountService;

    @GetMapping("/")
    public String index() {
        return "Universum is Up!";
    }
    @PostMapping("/rest/account")
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }
    @GetMapping("/rest/accounts")
    public List<Account> getAccounts() {
        return accountService.fetchAccountList();
    }

    /*
    PATCH PUT
     */

}