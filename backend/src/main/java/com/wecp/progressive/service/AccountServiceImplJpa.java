// package com.wecp.progressive.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.repository.AccountRepository;

// @Service
// public class AccountServiceImplJpa {
//     @Autowired
//     private AccountRepository accountRepository;

//     // public String getMessage(String msg){
//     //     return msg;
//     // }

//     public List<Accounts> getAllAccounts(){
//         return accountRepository.findAll();
//     }
    
//     public Accounts getAccountById(Integer accountId){
//         return accountRepository.findById(accountId).get();
//     }

//     public Accounts getAccountsByUser(Integer customerId){
//         return accountRepository.getAccountsByUser(customerId);
//     } 

//     public Accounts addAccount(Accounts accounts){
//         return accountRepository.save(accounts);
//     }

//     public Accounts updateAccount(Accounts accounts){
//         Accounts obj=accountRepository.findById(accounts.getAccount_id()).get();
//         if(obj!=null){
//             obj.setBalance(accounts.getBalance());
//             return accounts;
//         }
//         return null;
//     }

//     public void deleteAccount(Integer accountId){
//         accountRepository.deleteById(accountId);
//     }
// }