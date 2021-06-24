package com.aisha.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aisha.os.api.entity.order;
@Repository
public interface OrderRepository  extends JpaRepository<order, Integer>{

}
