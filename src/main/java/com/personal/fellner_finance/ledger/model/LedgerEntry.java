package com.personal.fellner_finance.ledger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.Instant;

@Entity
public class LedgerEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountId;
    private Double debit;
    private Double credit;
    private Instant timestamp;
    private String referenceId;

    // Getters and setters or Lombok annotations go here
}
