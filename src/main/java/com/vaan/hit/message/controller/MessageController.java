package com.vaan.hit.message.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaan.hit.RestURLConst;
import com.vaan.hit.message.entity.MessageEntity;

/**
 * @author Rohit
 *
 */
@RestController
public class MessageController {
		
	private static final Logger logger = LoggerFactory.getLogger(MessageController.class); 
	
	/*@RequestMapping(value = "/message", method = RequestMethod.GET)
	public @ResponseBody  String getMessageByID (HttpServletRequest request) {
			logger.info("I am inside getMessage() method");
			String msg = request.getParameter("message");
			
			return"Rohit Bhatia";
	}*/
	
	@RequestMapping(value = RestURLConst.GET_MESSAGES, method = RequestMethod.GET)
	public @ResponseBody  List<MessageEntity> putMessage () {
			
			logger.info("I am inside getMessage() method" );
			
			List<MessageEntity> lst = new ArrayList<MessageEntity>();
			MessageEntity msgEntity = new MessageEntity(1,"aaaa","Rohit");
			lst.add(msgEntity);
			MessageEntity msgEntity1 = new MessageEntity(2,"bbbb","Rohit");
			lst.add(msgEntity1);
			MessageEntity msgEntity2 = new MessageEntity(3,"ccccc","Rohit");
			lst.add(msgEntity2);
			
			
			return lst;
	}
	
}
