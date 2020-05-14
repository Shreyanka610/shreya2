package com.capgemini.hcm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.hcm.entity.Appointment;

@Repository("appointmentRepository")
public interface AppointmentDao extends JpaRepository<Appointment, Integer>
{
	public Appointment findByappointmentId();

	
}