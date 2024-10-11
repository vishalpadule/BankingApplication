package net.vpapplication.banking.repository;

import net.vpapplication.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
