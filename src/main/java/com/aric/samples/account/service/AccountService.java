/**
 *
 */
package com.aric.samples.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aric.samples.account.model.Account;
import com.aric.samples.account.repository.AccountRepository;

/**
 * @author dursun
 *
 */
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findPersonsByName(final String name) {
        return accountRepository.findByOwnerFirstName(name);
    }

    public Account deposit(final Long accountId, final Double amount) {
        final Account acc = accountRepository.findOne(accountId);
        acc.deposit(amount);
        return accountRepository.save(acc);
    }

    public Account withdraw(final Long accountId, final Double amount) {
        final Account acc = accountRepository.findOne(accountId);
        acc.withdraw(amount);
        return accountRepository.save(acc);
    }
}
