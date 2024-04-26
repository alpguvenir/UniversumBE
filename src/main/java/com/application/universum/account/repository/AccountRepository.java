package com.application.universum.account.repository;

import com.application.universum.account.entity.Account;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("local")
public interface AccountRepository extends CrudRepository<Account, Long> {

}
