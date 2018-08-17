package com.capgemini.capstore.repo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Merchant;

@Repository
public interface MerchantRepo extends JpaRepository<Merchant, Integer>,CrudRepository<Merchant, Integer>{
/*
	@Query("Select merchant from Merchant merchant")
	public List<Merchant> getAllMerchants();*/
}