package org.example.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountEntity {
    private Long id;
    private String name;
    private String accountNumber;
    private LocalDateTime createdAt;
    private String codeAccount;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", createdAt=" + createdAt +
                ", codeAccount='" + codeAccount + '\'' +
                '}';
    }
}
