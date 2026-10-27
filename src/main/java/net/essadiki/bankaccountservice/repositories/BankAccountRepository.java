package net.essadiki.bankaccountservice.repositories;

import net.essadiki.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository <BankAccount, String>{
}
