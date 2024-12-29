package ashokit.in.controller;

import ashokit.in.dto.AccountDto;
import ashokit.in.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/account")
public class AccountRestController {

   private AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
        return new ResponseEntity<>(accountService.getAccount(id),HttpStatus.OK);
    }

    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id ,
                                              @RequestBody Map<String , Integer> request){
        AccountDto amount = accountService.deposit(id, request.get("amount"));
        return ResponseEntity.ok(amount);
    }
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id
            , @RequestBody Map<String , Integer> request){

        AccountDto withdraw = accountService.withdraw(id, request.get("amount"));

        return ResponseEntity.ok(withdraw);

    }
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> allAccounts = accountService.getAllAccounts();

        return new ResponseEntity<>(allAccounts , HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<AccountDto> deleteRecord(@PathVariable Long id){
        AccountDto accountDto = accountService.deleteAccount(id);
        return ResponseEntity.ok(accountDto);
    }

}
