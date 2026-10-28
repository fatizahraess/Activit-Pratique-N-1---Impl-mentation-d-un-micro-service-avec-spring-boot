package net.essadiki.bankaccountservice.repositories;

import net.essadiki.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository <BankAccount, String>{
}
