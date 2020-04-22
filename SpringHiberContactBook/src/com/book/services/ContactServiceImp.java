package com.book.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Contact;

@Service
public class ContactServiceImp {

	@Autowired
	private ContactRepository repos;
	
	public List<Contact> getAllContact() {
		return (List<Contact>) repos.findAll();
	}
	
	public void save(Contact contact) {
		repos.save(contact);
	}
	
	public Contact get(int id) {
		Optional<Contact> result =  repos.findById(id);
		return result.get();
	}
	
	public void updateContact(Contact contact) {
		 repos.save(contact);
	}
	
	public void delete(int id) {
		repos.deleteById(id);
	}
}
