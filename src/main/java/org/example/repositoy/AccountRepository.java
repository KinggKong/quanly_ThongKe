package org.example.repositoy;


import org.example.entity.AccountEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    List<AccountEntity> accountEntityList = new ArrayList<>();

    Long id;
    String name;
    String accountNumber;
    LocalDateTime createdAt;
    String codeAccount;

    public AccountRepository() {
        accountEntityList.add(new AccountEntity(1L, "Minh", "666666666666", LocalDateTime.now(), "GEN_01_MINH_0987654321"));
        accountEntityList.add(new AccountEntity(2L, "Chang", "77777777777", LocalDateTime.now(), "GEN_01_CHANG_0987654321"));
        accountEntityList.add(new AccountEntity(3L, "Nhi", "999999999999", LocalDateTime.now(), "GEN_01_NHI_0987654321"));
    }
}
