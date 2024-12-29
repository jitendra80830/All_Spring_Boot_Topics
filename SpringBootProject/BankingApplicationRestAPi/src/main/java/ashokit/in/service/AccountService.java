package ashokit.in.service;

import ashokit.in.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);
    AccountDto getAccount(Long id);

    AccountDto deposit(Long id , Integer amount);

    AccountDto withdraw(Long id , Integer amount);

    List<AccountDto> getAllAccounts();

    AccountDto deleteAccount(Long id);
}
