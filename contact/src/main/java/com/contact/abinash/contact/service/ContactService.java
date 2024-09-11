package com.contact.abinash.contact.service;

import com.contact.abinash.contact.Entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUsers(Long userid);

}
