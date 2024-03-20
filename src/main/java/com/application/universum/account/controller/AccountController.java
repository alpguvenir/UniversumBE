package com.application.universum.account.controller;

import com.application.universum.account.entity.Account;
import com.application.universum.account.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired private AccountService accountService;

    //  When we use the @Valid annotation, if the entity has a NotNull/NotBlank field left empty, it will return 400, the application will not throw an exception
    //  If the @Valid annotation is not added, it will return 500 server error with the following message:
    //      jakarta.validation.ConstraintViolationException: Validation failed for classes [com.application.universum.account.entity.Account] during persist time for groups [jakarta.validation.groups.Default, ]
    //      List of constraint violations:[
    //          ConstraintViolationImpl{interpolatedMessage='Email cannot be left empty', propertyPath=EmailAddress, rootBeanClass=class com.application.universum.account.entity.Account, messageTemplate='Email cannot be left empty'}
    //      ]
    @PostMapping("/rest/account")
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @GetMapping("/rest/accounts")
    public List<Account> getAccounts() {
        return accountService.fetchAccountList();
    }

}