package com.personal.fellner_finance.settlement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.personal.fellner_finance.settlement.model.Settlement;

public interface SettlementRepository extends JpaRepository<Settlement, Long> {
}