package org.example.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDTO {
    private Long id;
    private String name;
    private String accountNumber;
    private LocalDateTime createdAt;
    private String codeAccount;


}
