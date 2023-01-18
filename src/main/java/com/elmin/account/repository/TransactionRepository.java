package com.elmin.account.repository;

import com.elmin.account.model.Customer;
import com.elmin.account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {


}
