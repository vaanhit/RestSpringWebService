package com.vaan.hit.message.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaan.hit.RestURLConst;
import com.vaan.hit.message.entity.MessageEntity;
import com.vaan.hit.message.service.impl.MessageServiceImpl;

/**
 * @author Rohit
 *
 */
@RestController
public class MessageController {

	private static final Logger logger = LoggerFactory
			.getLogger(MessageController.class);

	@Autowired
	private MessageServiceImpl messageService;

	@RequestMapping(value = RestURLConst.MESSAGES, method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody List<MessageEntity> getAllMessage() {

		logger.info("I am inside getMessage() method");
		// Jackson is automatically converting this list into JSON data and
		// returning JSON.
		List<MessageEntity> msgLst = messageService.messageLst();
		return msgLst;
	}

	@RequestMapping(value = RestURLConst.MESSAGE_BY_ID, method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody MessageEntity getMessageByID(
			@PathVariable("messageID") Long messageID) {

		logger.info("I am inside getMessageByID method");
		MessageEntity msg = messageService.getMessageByID(messageID);
		return msg;
	}

	@RequestMapping(value = RestURLConst.MESSAGES, method = RequestMethod.POST, produces = { "application/json" }, consumes = { "application/json" })
	public @ResponseBody MessageEntity addMessage(
			@RequestBody MessageEntity messageEntity) {

		MessageEntity messageent = messageService.addMessage(messageEntity);

		logger.info(messageent.getMessage());
		return messageent;
	}

	  @RequestMapping(value = RestURLConst.MESSAGES, method = RequestMethod.PUT, consumes = { "application/json" }) 
	  public @ResponseBody	  String updateMessage(  @RequestBody MessageEntity messageEntity) {
	  
		  messageService.updateMessage(messageEntity);
	  
		  return ""; 
	  }
	 

	@RequestMapping(value = RestURLConst.MESSAGE_BY_ID,method = RequestMethod.DELETE)
	public @ResponseBody void removeMessage(
			@PathVariable("messageID") Long messageID) {
		messageService.deleteMessage(messageID);

	}

}
