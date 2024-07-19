// package com.wecp.progressive.controller;

// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.exception.AccountNotFoundException;
// import com.wecp.progressive.exception.CustomerAlreadyExistsException;
// import com.wecp.progressive.exception.OutOfBalanceException;
// import com.wecp.progressive.exception.WithdrawalLimitException;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// @RestController
// @RequestMapping("/accounts")
// public class AccountController {

//     // public ResponseEntity<String> getMessage(){
//     //     return ResponseEntity.ok("Welcome to BankSafe Online!");
//     // }
    
//     public ResponseEntity<List<Accounts>> getAllAccounts() {
//         return null;
//     }

//     public ResponseEntity<Accounts> getAccountById(int accountId) {
//         return null;
//     }

//     public ResponseEntity<List<Accounts>> getAccountsByUser(String param) {
//         return null;
//     }

//     public ResponseEntity<Integer> addAccount(Accounts accounts) {
//         return null;
//     }

//     public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts) {
//         return null;
//     }

//     public ResponseEntity<Void> deleteAccount(int accountId) {
//         return null;
//     }
// }