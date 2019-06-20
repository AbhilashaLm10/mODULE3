package com.cg.service;

import java.util.List;

import com.cg.entities.BookingDetails;
import com.cg.entities.HotelDetails;

public interface IBookingService {
	public abstract List<HotelDetails> loadAllHotel();

	public abstract HotelDetails findHotel(int id);
	public abstract void saveBooking (BookingDetails bookingDetails);
	
}
