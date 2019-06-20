package com.cg.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class BookingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq",sequenceName="booking_id",
				allocationSize=1)
	int id;
	@NotEmpty(message="Please Enter your Name")
	@Pattern(regexp = "[a-zA-Z]{3,20}", message = "Username must contain only alphabets")
	String customerName;
	@Min(value = 1, message = "Hotel Id not be less than 1")
    @Max(value = 4, message = "Hotel Id not be greater than 4")
	int hotelId;
	Date todate;
	Date fromdate;
	@Min(value = 1, message = "No of rooms can not be less than 1")
    @Max(value = 5, message = "No of rooms can be greater than 5")
	int noofrooms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public int getNoofrooms() {
		return noofrooms;
	}
	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}
	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", customerName=" + customerName
				+ ", hotelId=" + hotelId + ", todate=" + todate + ", fromdate="
				+ fromdate + ", noofrooms=" + noofrooms + "]";
	}
	
	
	
}
