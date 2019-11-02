package com.bmtc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bmtc.app.vo.Bus;

public interface BmtcBusRepository extends JpaRepository<Bus, Integer> {

}
