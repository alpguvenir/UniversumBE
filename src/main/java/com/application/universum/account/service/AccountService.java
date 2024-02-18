package com.application.universum.account.service;

import com.application.universum.account.entity.Account;

import java.util.List;

public interface AccountService {
    // Save operation
    Account saveAccount(Account account);

    // Read operation
    List<Account> fetchAccountList();

    // Update operation
    Account updateAccount(Account account,
                             Long userId);

    // Delete operation
    void deleteAccountById(Long userId);
}
