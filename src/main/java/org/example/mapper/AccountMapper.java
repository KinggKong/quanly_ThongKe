package org.example.mapper;


import org.example.dto.AccountDTO;
import org.example.entity.AccountEntity;
import org.example.model.AccountModel;

public class AccountMapper {
    public AccountDTO toDto(AccountEntity accountEntity) {
        return AccountDTO.builder()
                .id(accountEntity.getId())
                .name(accountEntity.getName())
                .codeAccount(accountEntity.getCodeAccount())
                .accountNumber(accountEntity.getAccountNumber())
                .createdAt(accountEntity.getCreatedAt())
                .build();
    }

    public AccountEntity toEntity(AccountModel accountModel) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setId(accountModel.getId());
        accountEntity.setName(accountEntity.getName());
        accountEntity.setCodeAccount(accountEntity.getCodeAccount());
        accountEntity.setAccountNumber(accountEntity.getAccountNumber());
        accountEntity.setCreatedAt(accountEntity.getCreatedAt());

        return accountEntity;
    }
}
