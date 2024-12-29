package ashokit.in.dto;

import lombok.*;
@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private Integer balance;
}
