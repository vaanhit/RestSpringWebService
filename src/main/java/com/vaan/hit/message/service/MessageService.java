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
	
}
