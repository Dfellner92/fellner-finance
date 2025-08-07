package com.personal.fellner_finance.ledger.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.personal.fellner_finance.ledger.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
