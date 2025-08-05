package com.alexandre.email_service.application;

import com.alexandre.email_service.adapters.EmailSenderGateway;
import com.alexandre.email_service.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUserCase {
    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService (EmailSenderGateway emailSenderGateway){

        this.emailSenderGateway = emailSenderGateway;
    }


    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject,body);
    }
}
