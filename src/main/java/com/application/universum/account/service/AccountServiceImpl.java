package com.application.universum.account.service;

import com.application.universum.account.entity.Account;
import com.application.universum.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("local")
public class AccountServiceImpl implements AccountService {

    @Autowired private AccountRepository accountRepository;

    @Override public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override public List<Account> fetchAccountList() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override public Account updateAccount(Account account, String userId) {

        Account accountFound = accountRepository.findById(userId).orElse(null);

        if (accountFound != null) {

            accountFound.setName(account.getName());
            accountFound.setAddress(account.getAddress());
            accountFound.setAge(account.getAge());

            return accountRepository.save(accountFound);
        }
        return null;
    }

    @Override
    public void deleteAccountById(String userId) {
        accountRepository.deleteById(userId);

    }
}
