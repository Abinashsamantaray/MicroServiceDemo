package com.contact.abinash.contact.service;

import com.contact.abinash.contact.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    // fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L , "amit@gmail.com" , "Amit" ,1134L),
            new Contact(2L , "sourav@gmail.com" , "Sourav" ,1222L),
            new Contact(3L , "abinash@gmail.com" , "Abinash" ,1000L)
     );




    @Override
    public List<Contact> getContactsOfUsers(Long userid) {
        return this.list.stream().filter(contact -> contact.getUserid().equals(userid)).collect(Collectors.toList());
    }
}
