package com.roomsbooking.DaoImpl;

import org.springframework.stereotype.Repository;

import com.roomsbooking.Dao.RoomDao;

@Repository
public class RoomDaoImpl implements RoomDao{

	@Override
	public String sample() {
 		return "Hello ROOM BOOKING!!";
	}

}
