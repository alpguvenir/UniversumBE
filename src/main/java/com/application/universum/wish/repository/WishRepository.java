package com.application.universum.wish.repository;

import com.application.universum.wish.entity.Wish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishRepository extends CrudRepository<Wish, Long> {

}
