package org.example.model;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountModel {
    Long id;
    String name;
    String accountNumber;
    LocalDateTime createdAt;
    String codeAccount;
}
