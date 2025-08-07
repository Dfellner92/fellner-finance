package com.personal.fellner_finance.ledger.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.personal.fellner_finance.ledger.model.LedgerEntry;

public interface LedgerEntryRepository extends JpaRepository<LedgerEntry, Long> {
}