package com.vaan.hit.message.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vaan.hit.message.entity.MessageEntity;

/**
 * @author Rohit
 *
 */
@Service
public interface MessageService {

	public List<MessageEntity> messageLst();

	public MessageEntity getMessageByID(Long messageID);

	public MessageEntity addMessage(MessageEntity messageEntity);

	public void deleteMessage(Long messageID);

	public MessageEntity updateMessage(MessageEntity messageEntity);

}
