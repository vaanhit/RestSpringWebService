package com.vaan.hit.message.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

	/*
	 * @RequestMapping(value = "/message", method = RequestMethod.GET) public
	 * @ResponseBody String getMessageByID (HttpServletRequest request) {
	 * logger.info("I am inside getMessage() method"); String msg =
	 * request.getParameter("message");
	 * 
	 * return"Rohit Bhatia"; }
	 */

	// @RequestMapping(value = "/{id}", method = RequestMethod.GET, headers =
	// "Accept=application/json")
	// @RequestMapping(value = "/{id}", method = RequestMethod.GET, headers =
	// "Accept=application/json")
	@RequestMapping(value = RestURLConst.GET_MESSAGES, method = RequestMethod.GET)
	public @ResponseBody List<MessageEntity> putMessage() {

		logger.info("I am inside getMessage() method");
		//Jackson is automatically converting this list into JSON data and returning JSON.
		List<MessageEntity> msgLst = messageService.messageLst();
		return msgLst;
	}

}
