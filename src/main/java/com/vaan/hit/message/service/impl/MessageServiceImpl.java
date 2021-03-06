package com.vaan.hit.message.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

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

	@Override
	public List<MessageEntity> messageLst() {
		logger.info(" ---------- Inside message Repository -------------------");
		List<MessageEntity> mstLst = messageRepository.findAll();
		
	/*	Page<MessageEntity> mstLst1 = (List)   messageRepository.findAll(new PageRequest(0, 5, Direction.DESC, "author"));
		logger.info("size of page    ------       "     + mstLst1.size());*/
		
		logger.info(" ---------- Got all message -------------------");
		return mstLst;
	}

	@Override
	public MessageEntity getMessageByID(Long messageID) {
		MessageEntity messageEntity = messageRepository.findOne(messageID);
		logger.info("-----------got MessageByID ---------");

		return messageEntity;
	}

	@Override
	public MessageEntity addMessage(MessageEntity messageEntity) {
		MessageEntity msgEntity = messageRepository.save(messageEntity);
		
		return msgEntity;
	}

	@Override
	public void deleteMessage(Long messageID) {
		messageRepository.delete(messageID);
	}

	@Override
	public MessageEntity updateMessage(MessageEntity messageEntity) {
				MessageEntity msgEntity = messageRepository.save(messageEntity);
				return msgEntity;
	}
}
