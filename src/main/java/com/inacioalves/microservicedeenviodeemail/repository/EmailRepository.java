package com.inacioalves.microservicedeenviodeemail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioalves.microservicedeenviodeemail.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
