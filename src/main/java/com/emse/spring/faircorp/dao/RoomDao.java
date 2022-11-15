package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomDao extends JpaRepository<Room, Long>,RoomDaoCustom {

    //@Query("select c from Room r where r.id=:id")  // (2)
    //Room findByName(@Param("id") Long id);


}
