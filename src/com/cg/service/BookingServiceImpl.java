package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IBookingDAO;
import com.cg.entities.BookingDetails;
import com.cg.entities.HotelDetails;


@Service
@Transactional	//This annotation will make automatic transaction management  
public class BookingServiceImpl implements IBookingService{
	@Autowired 
	private IBookingDAO bookingDao;

	@Override
	public List<HotelDetails> loadAllHotel() {
		return bookingDao.loadAllHotel();
	}

	@Override
	public HotelDetails findHotel(int id) {
		// TODO Auto-generated method stub
		return bookingDao.findHotel(id);
	}

	@Override
	public void saveBooking(BookingDetails bookingDetails) {
		// TODO Auto-generated method stub
		bookingDao.saveBooking(bookingDetails);
	}
}
