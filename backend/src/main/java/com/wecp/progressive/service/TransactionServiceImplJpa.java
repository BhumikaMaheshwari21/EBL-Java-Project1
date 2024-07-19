// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;

// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToOne;
// import javax.xml.crypto.Data;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.repository.TransactionRepository;

// @Service
// public class TransactionServiceImplJpa implements TransactionService {
//     @Autowired
//     private TransactionRepository transactionRepository;

//     public List<Transactions> getAllTransactions(){
//         return transactionRepository.findAll();
//     }

//     public Transactions getTransactionById(Integer transactionId){
//         if(transactionRepository.findById(transactionId)!=null){
//             return transactionRepository.findById(transactionId).get();
//         }
//         return null;
//     }

//     public Transactions addTransaction(Transactions transactions){
//         return transactionRepository.save(transactions);
//     }

//     public Transactions updateTransaction(Transactions transactions){
//         Transactions obj = transactionRepository.findById(transactions.getAccountId()).get();
//         if(obj!=null){
//             obj.setAmount(transactions.getAmount());
//             obj.setTransactionId(transactions.getTransactionId());
//             obj.setTransactionDate(transactions.getTransactionDate());
//             obj.setTransactionType(transactions.getTransactionType());
//             return transactionRepository.save(obj);
//         }
//         return null;
//     }

//     public void deleteTransaction(Integer transactionId){
//         transactionRepository.deleteById(transactionId);
//     }

//     public Transactions getAllTransactionsByCustomerId(Integer customerId){

//     }

//     @Override
//     public Transactions getTransactionById(int transactionId) throws SQLException {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
//     }

//     @Override
//     public void deleteTransaction(int transactionId) throws SQLException {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'deleteTransaction'");
//     }

//     @Override
//     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
//     }
// }