package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.BookingDetails;
import com.cg.entities.HotelDetails;
import com.cg.service.IBookingService;

@Controller
public class BookingController {
	@Autowired
	private IBookingService bookingService;
	
	@RequestMapping("/hotelDetails.obj")
	public String getHotelDeatilsPage(Model model){
		model.addAttribute("hotelList",bookingService.loadAllHotel());
		return "hotelDetails";
	}
	
	
	@RequestMapping(value="/bookHotel.obj")
	public String nextPage(@RequestParam String id, Model model)
	{
		model.addAttribute("hotel", bookingService.findHotel(Integer.parseInt(id)));
		BookingDetails bookingDetails = new  BookingDetails();
		bookingDetails.setHotelId(Integer.parseInt(id));
		model.addAttribute("bookingDetails",bookingDetails);
		
		return "bookHotel";
	}
	@RequestMapping(value="/saveBooking.obj",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("bookingDetails") @Valid BookingDetails bookingDetails,BindingResult result, Model model){
		if(result.hasErrors())
		{
			return "bookHotel";
		}
		else
		{
			bookingService.saveBooking(bookingDetails);
			HotelDetails hotel= bookingService.findHotel(bookingDetails.getHotelId());
			model.addAttribute("hotel",hotel);
			return "bookingSuccessfull";
		}
	}
}
