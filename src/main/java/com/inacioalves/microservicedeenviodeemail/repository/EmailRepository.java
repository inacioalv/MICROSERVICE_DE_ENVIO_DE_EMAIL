package com.inacioalves.microservicedeenviodeemail.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioalves.microservicedeenviodeemail.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
