package com.lti.service;

import java.util.List;

import com.lti.entity.Contact;

public interface ContactService {
	String recieveContactRequest(Contact contact);
	Contact searchReqById(int cId);
	List<Contact> viewAllReq();
}
