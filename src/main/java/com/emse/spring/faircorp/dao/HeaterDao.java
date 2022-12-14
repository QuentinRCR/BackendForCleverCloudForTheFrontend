package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HeaterDao extends JpaRepository<Heater, Long> {

    @Query("select c from Heater c where c.id=:id")  // (2)
    Heater findByName(@Param("id") String id);

    void deleteByRoomId(Long Id);
}
