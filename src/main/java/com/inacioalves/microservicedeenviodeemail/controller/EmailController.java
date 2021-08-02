package com.inacioalves.microservicedeenviodeemail.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inacioalves.microservicedeenviodeemail.dtos.EmailDto;
import com.inacioalves.microservicedeenviodeemail.model.EmailModel;
import com.inacioalves.microservicedeenviodeemail.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@PostMapping(value = "/sending-email")
	public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto ){
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(emailDto, emailModel);
		emailService.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel,HttpStatus.CREATED);
	}

}
