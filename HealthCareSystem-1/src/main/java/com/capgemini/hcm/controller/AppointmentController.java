package com.capgemini.hcm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.capgemini.hcm.entity.Appointment;
import com.capgemini.hcm.service.AppointmentService;
import com.capgemini.hcm.service.AppointmentServiceImpl;

public class AppointmentController 
{ 
	@Autowired
	AppointmentServiceImpl app;
	@PostMapping("/add")
	public Object addAppointment(@RequestBody Appointment a)
	{
		return app.saveAppointment(a);
	}
	

	@PostMapping("/makeAppointment")
	p
	
	

}
