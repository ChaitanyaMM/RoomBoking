package com.roomsbooking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roomsbooking.Dao.RoomDao;
import com.roomsbooking.Service.RoomService;
@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomDao roomdao;

	@Override
	public String sample() {
		   
 		return roomdao.sample();
	}

}
