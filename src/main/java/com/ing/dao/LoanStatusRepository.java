package com.ing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.MortgageDetails;

@Repository
public interface LoanStatusRepository extends JpaRepository<MortgageDetails, Integer>{

}
