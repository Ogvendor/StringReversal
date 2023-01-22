package com.victor.name.data.repositories;

import com.victor.name.data.model.Reversal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReversalRepository extends JpaRepository<Reversal,Long> {

}
