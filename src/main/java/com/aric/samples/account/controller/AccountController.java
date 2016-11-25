/**
 *
 */
package com.aric.samples.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aric.samples.account.model.Account;
import com.aric.samples.account.service.AccountService;

/**
 * @author dursun
 *
 */
@RestController()
public class AccountController {
    @Autowired
    private AccountService service;

    @RequestMapping("/query")
    public List<Account> account(@RequestParam(value = "name", required = true) final String name) {
        return service.findPersonsByName(name);
    }

    @RequestMapping("/deposit")
    public Account deposit(@RequestParam(value = "id", required = true) final Long accountId,
            @RequestParam(value = "amount", required = true) final Double amount) {
        return service.deposit(accountId, amount);
    }

    @RequestMapping("/withdraw")
    public Account withdraw(@RequestParam(value = "id", required = true) final Long accountId,
            @RequestParam(value = "amount", required = true) final Double amount) {
        return service.withdraw(accountId, amount);
    }
}
