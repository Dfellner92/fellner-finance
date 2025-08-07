package com.personal.fellner_finance.ledger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    private Long id;

    // Minimal placeholder fields
    private Long userId;
    private String type;
    private Double balance;

    // Getters and setters or Lombok annotations go here
}