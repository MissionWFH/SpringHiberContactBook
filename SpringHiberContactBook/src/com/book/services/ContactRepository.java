package com.book.services;

import org.springframework.data.repository.CrudRepository;

import com.book.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
