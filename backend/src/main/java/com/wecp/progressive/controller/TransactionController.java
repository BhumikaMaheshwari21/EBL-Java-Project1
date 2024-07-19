package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.exception.AccountNotFoundException;
import com.wecp.progressive.exception.CustomerAlreadyExistsException;
import com.wecp.progressive.exception.OutOfBalanceException;
import com.wecp.progressive.exception.WithdrawalLimitException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TransactionController {

    public ResponseEntity<List<Transactions>> getAllTransactions() {
        return null;
    }
    public ResponseEntity<Transactions> getTransactionById(int transactionId) {
        return null;
    }
    public ResponseEntity<Integer> addTransaction(Transactions transaction) {
        return null;
    }
    public ResponseEntity<Void> updateTransaction(int transactionId, Transactions transaction) {
        return null;
    }
    public ResponseEntity<Void> deleteTransaction(int transactionId) {
        return null;
    }
    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<String> exceptionHandler(AccountNotFoundException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
    }

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<String> exceptionHandler2(CustomerAlreadyExistsException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
    }

    @ExceptionHandler(OutOfBalanceException.class)
    public ResponseEntity<String> exceptionHandler3(OutOfBalanceException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
    }

    @ExceptionHandler(WithdrawalLimitException.class)
    public ResponseEntity<String> exceptionHandler3(WithdrawalLimitException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
    }
}
