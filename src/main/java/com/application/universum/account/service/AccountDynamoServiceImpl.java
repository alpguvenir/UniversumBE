package com.application.universum.account.service;

import com.application.universum.account.entity.Account;
import com.application.universum.account.repository.AccountDynamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("dynamodb")
public class AccountDynamoServiceImpl implements AccountService {

    @Autowired private AccountDynamoRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return null;
    }

    @Override
    public List<Account> fetchAccountList() {
        return accountRepository.getAccountsList();
    }

    @Override
    public Account updateAccount(Account account, Long userId) {
        return null;
    }

    @Override
    public void deleteAccountById(Long userId) {

    }

}
