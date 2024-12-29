package ashokit.in.service.impl;

import ashokit.in.AccountMapper;
import ashokit.in.dto.AccountDto;
import ashokit.in.entity.Account;
import ashokit.in.repo.AccountRepository;
import ashokit.in.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDto getAccount(Long id) {
         Account account = accountRepository.
                 findById(id).
                 orElseThrow(()-> new RuntimeException("Account "+id+" does not available"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, Integer amount) {
        Account account = accountRepository.
                findById(id).
                orElseThrow(()-> new RuntimeException("Account "+id+" does not available"));
        Integer total = account.getBalance() + amount;
        account.setBalance(total);
        Account save = accountRepository.save(account);

        return AccountMapper.mapToAccountDto(save);
    }
    public AccountDto withdraw(Long id , Integer amount){
        Integer deduct;
        Account account = accountRepository.
                findById(id).
                orElseThrow(()-> new RuntimeException("Account "+id+" does not available"));
        if(account.getBalance()<amount){
            throw new RuntimeException("Insufficient balance.");
        }else {
            deduct = account.getBalance() - amount;
            account.setBalance(deduct);
        }
        Account save = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(save);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map(account -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
    }

    @Override
    public AccountDto deleteAccount(Long id) {
        if(accountRepository.existsById(id)) {
            accountRepository.deleteById(id);
        }else {
            throw new RuntimeException("Record does not exits");
        }
        return null;
    }


}
