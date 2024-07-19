// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.repository.CustomerRepository;

// @Service
// public class CustomerServiceImplJpa implements CustomerService{
//     @Autowired
//     private CustomerRepository customerRepository;
    
//     public List<Customers> getAllCustomers(){
//         return customerRepository.findAll();
//     }

//     public Customers getCustomerById(Integer customerID){
//         return customerRepository.findById(customerID).get();
//     }

//     public Customers addCustomer(Customers customers){
//         return customerRepository.save(customers);
//     }

//     public Customers updateCustomer(Customers customers){
//         Customers obj =customerRepository.findById(customers.getCustomerId()).get();
//         if(obj!=null){
//             customers.setName(customers.getName());
//             customers.setEmail(customers.getEmail());
//             customers.setUsername(customers.getUsername());
//             customers.setPassword(customers.getPassword());
//             customers.setRole(customers.getRole());
//             return customerRepository.save(customers);
//         }
//         return null;
//     }

//     public void deleteCustomer(Integer customerID){
//         customerRepository.deleteById(customerID);
//     }

//     public List<Customers> getAllCustomersFromArrayList(){
//         return null;
//     }

//     public void addCustomersToArrayList(){
//     }

//     public List<Customers> getAllCustomersSortedByNameFromArrayList(){
//         return null;
//     }

//     @Override
//     public Customers getCustomerById(int customerId){
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void deleteCustomer(int customerId){
//         // TODO Auto-generated method stub
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByName() throws SQLException {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Customers> addCustomersToArrayList(Customers customers) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void emptyArrayList() {
//         // TODO Auto-generated method stub
//     }
// }