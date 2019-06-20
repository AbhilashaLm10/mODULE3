package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.BookingDetails;
import com.cg.entities.HotelDetails;

@Repository
/*
Spring Repository annotation is a specialization of @Component annotation, so Spring Repository classes are autodetected by spring framework through classpath scanning.

Spring Repository is very close to DAO pattern where DAO classes are responsible for providing CRUD operations on database tables. However, if you are using Spring Data for managing database operations, then you should use Spring Data Repository interface.*/
public class BookingDAOImpl implements IBookingDAO{
	//Below annotation is required to inject auto created entityManager from entityManagerFactory
		@PersistenceContext
		private EntityManager entityManager;

		@Override
		public List<HotelDetails> loadAllHotel() {
			TypedQuery<HotelDetails> query = 
					entityManager.
					createQuery
					("SELECT h FROM HotelDetails h", 
							HotelDetails.class);
			return query.getResultList();
		}

		@Override
		public HotelDetails findHotel(int id) {
			// TODO Auto-generated method stub
			return entityManager.find(HotelDetails.class,id);
		}

		@Override
		public void saveBooking(BookingDetails bookingDetails) {
			// TODO Auto-generated method stub
			entityManager.persist(bookingDetails);
			entityManager.flush();	//required to reflect changes on database
		}
}
