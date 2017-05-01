package com.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.Price;

public interface PriceDao extends JpaRepository<Price, Integer> {

}


