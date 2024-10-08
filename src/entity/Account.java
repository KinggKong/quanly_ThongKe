package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    Long id;
    String name;
    String accountNumber;
    Date createdAt;
    String codeAccount;

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
