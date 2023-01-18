package com.elmin.account.repository;

import com.elmin.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String>{
}
