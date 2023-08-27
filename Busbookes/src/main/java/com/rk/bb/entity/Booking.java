package com.rk.bb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking_table")
public class Booking {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long booking_id;
		@ManyToOne
		@JoinColumn(name = "user_id")
		private User user;
		@ManyToOne
		@JoinColumn(name = "schedule_id")
		private Schedule schedule;
		private String seat_numbers;
		private double total_fare;
		private String status;
		private String payment_status;
		private String payment_reference;

		public Long getBooking_id() {
			return booking_id;
		}

		public void setBooking_id(Long booking_id) {
			this.booking_id = booking_id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Schedule getSchedule() {
			return schedule;
		}

		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}

		public String getSeat_numbers() {
			return seat_numbers;
		}

		public void setSeat_numbers(String seat_numbers) {
			this.seat_numbers = seat_numbers;
		}

		public double getTotal_fare() {
			return total_fare;
		}

		public void setTotal_fare(double total_fare) {
			this.total_fare = total_fare;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPayment_status() {
			return payment_status;
		}

		public void setPayment_status(String payment_status) {
			this.payment_status = payment_status;
		}

		public String getPayment_reference() {
			return payment_reference;
		}

		public void setPayment_reference(String payment_reference) {
			this.payment_reference = payment_reference;
		}

	}


