package com.aisha.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aisha.os.api.entity.order;

public interface OrderRepository  extends JpaRepository<order, Integer>{

}
