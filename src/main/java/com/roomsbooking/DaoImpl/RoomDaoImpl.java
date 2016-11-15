package com.roomsbooking.DaoImpl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.roomsbooking.Dao.RoomDao;
import com.roomsbooking.Objects.Room;

@Repository
public class RoomDaoImpl implements RoomDao {
	private HibernateTemplate hibernatetemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernatetemplate = hibernateTemplate;
	}

	@Override
	public String sample() {
		return "Hello ROOM BOOKING!!";

	}

	@Override
	@Transactional(readOnly = false)
	public Room add(Room room) {
		System.out.println("Create new room " + room);
		hibernatetemplate.save(room);
		System.out.println("Employee created " + room);
		return room;
	}

}
