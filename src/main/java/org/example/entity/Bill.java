package org.example.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bill {
    Long id;
    AccountEntity accountEntity;
    String code;
    Date createdAt;
    double amount;
    String content;
    String receivingAccount;

    @Override
    public String toString() {
        return "Bill[" +
                "id=" + id +
                ", account=" + accountEntity +
                ", code='" + code + '\'' +
                ", createdAt=" + createdAt +
                ", amount=" + amount +
                ", content='" + content + '\'' +
                ", receivingAccount='" + receivingAccount + '\'' +
                ']';
    }
}
