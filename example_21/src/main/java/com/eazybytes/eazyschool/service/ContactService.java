package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static final Logger log = LoggerFactory.getLogger(ContactService.class);

    public void saveContactMessage(Contact contact) {
        log.info("Contact Message: " + contact);
    }
}
