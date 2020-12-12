package com.kuan.store.dao;

import com.kuan.store.domain.Customer;

import java.util.List;

public interface CustomerDao {
    
    Customer findByPk(String pk);
    
    List<Customer> findAll();
    
    void create(Customer customer);
    
    void modify(Customer customer);
    
    void remove(String pk);
}
