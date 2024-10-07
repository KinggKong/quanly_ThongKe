package org.example.service.impl;

import org.example.dto.AccountDTO;
import org.example.entity.AccountEntity;
import org.example.mapper.AccountMapper;
import org.example.model.AccountModel;
import org.example.repositoy.AccountRepository;
import org.example.service.IAccountService;

import java.util.List;

public class AccountService implements IAccountService {

    AccountDTO accountDTO;
    AccountEntity accountEntity;
    AccountMapper accountMapper;
    AccountModel accountModel;
    AccountRepository accountRepository;

    public AccountService() {
    }

    public AccountService(AccountDTO accountDTO, AccountEntity accountEntity, AccountMapper accountMapper, AccountModel accountModel, AccountRepository accountRepository) {
        this.accountDTO = accountDTO;
        this.accountEntity = accountEntity;
        this.accountMapper = accountMapper;
        this.accountModel = accountModel;
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountEntity> getAll() {
        return List.of();
    }

    @Override
    public AccountEntity getById(long id) {
        return null;
    }

    @Override
    public void add(AccountEntity accountEntity) {

    }

    @Override
    public void update(Long id, AccountEntity accountEntity) {

    }

    @Override
    public void delete(Long id) {

    }
}
