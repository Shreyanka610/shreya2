package com.capgemini.hcm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.hcm.dao.AppointmentDao;
import com.capgemini.hcm.entity.Appointment;

public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	AppointmentDao appointmentdao;

	@Override
	public Object saveAppointment(Appointment a) {
		// TODO Auto-generated method stub
		return appointmentdao.save(a);	}

	@Override
	public Object viewAppointment(Appointment aa) {
		// TODO Auto-generated method stub
		return appointmentdao.findAll();
	}
	@Override
	public Object makeAppointment(Appointment ma) {
		// TODO Auto-generated method stub
		return appointmentdao.findByappointmentId() ;
	
	
}
}