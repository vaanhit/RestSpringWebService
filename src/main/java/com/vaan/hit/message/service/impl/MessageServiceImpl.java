package com.vaan.hit.message.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vaan.hit.message.controller.MessageController;
import com.vaan.hit.message.entity.MessageEntity;
import com.vaan.hit.message.repository.MessageRepository;
import com.vaan.hit.message.service.MessageService;

/**
 * @author Rohit
 *
 */
@Component
public class MessageServiceImpl implements MessageService {

	private static final Logger logger = LoggerFactory
			.getLogger(MessageServiceImpl.class);

	@Autowired
	MessageRepository messageRepository;

	public List<MessageEntity> messageLst() {
		logger.info(" ---------- Inside message Repository -------------------");
		List<MessageEntity> mstLst = messageRepository.findAll();
		logger.info(" ---------- Got all message -------------------");
		return mstLst;
	}
}
