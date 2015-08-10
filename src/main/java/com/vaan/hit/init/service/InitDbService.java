package com.vaan.hit.init.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaan.hit.message.entity.MessageEntity;
import com.vaan.hit.message.repository.MessageRepository;

/**
 * @author Rohit
 *
 */
@Transactional
@Service
public class InitDbService {

	// Spring will inject the instance of Role/User/Item/Blog repository here.
	@Autowired
	private MessageRepository messageRepository;

	/*
	 * This method will call after the spring context creation. So it will
	 * create during application startup or during deployment on the server.
	 * 
	 * Initialize the DB here.
	 */
	@PostConstruct
	private void init() {
		MessageEntity msgEntity = new MessageEntity("message 1", "Rohit");
		messageRepository.save(msgEntity);

		MessageEntity msgEntity1 = new MessageEntity("message 2", "Rohit");
		messageRepository.save(msgEntity1);

		MessageEntity msgEntity2 = new MessageEntity("message 3", "Rohit");
		messageRepository.save(msgEntity2);
		
		MessageEntity msgEntity3 = new MessageEntity("message 4", "Rohit");
		messageRepository.save(msgEntity3);
	}

}
