// package com.wecp.progressive.controller;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.service.CustomerServiceImplJpa;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/customers")
// public class CustomerController {
//     @Autowired
//     private CustomerServiceImplJpa customerServiceImplJpa;

//     @GetMapping
//     public ResponseEntity<List<Customers>> getAllCustomers(){
//         return ResponseEntity.ok(customerServiceImplJpa.getAllCustomers());
//     }

//     @GetMapping("/{customerId}")
//     public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId){
//         return ResponseEntity.ok(customerServiceImplJpa.getCustomerById(customerId));
//     }

//     @PostMapping
//     public ResponseEntity<Integer> addCustomer( @RequestBody Customers customers){
//         customerServiceImplJpa.addCustomer(customers);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     @PutMapping("/{customerId}")
//     public ResponseEntity<Void> updateCustomer(@RequestBody Customers customers) {
//         customers.getCustomerId();
//         customerServiceImplJpa.updateCustomer(customers);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     @DeleteMapping("/{customerId}")
//     public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId){
//         customerServiceImplJpa.deleteCustomer(customerId);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     // @GetMapping
//     // public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
//     //     return null;
//     // }
// }