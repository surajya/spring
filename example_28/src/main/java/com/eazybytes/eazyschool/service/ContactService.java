package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
//@RequestScope
//@SessionScope
@ApplicationScope
@Service
public class ContactService {

    private int counterbean;

    ContactService(){
        log.info("ContactService Bean is Instantiated");
    }

    public int getCounterbean() {
        return counterbean;
    }

    public void setCounterbean(int counterbean) {
        this.counterbean = counterbean;
    }

    public void saveContactMessage(Contact contact) {
        log.info("Contact Message: " + contact);
    }
}
