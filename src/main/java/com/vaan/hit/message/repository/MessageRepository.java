package com.vaan.hit.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaan.hit.message.entity.MessageEntity;

/**
 * @author Rohit
 *   MessageEntity: @entity Integer: datatype of primary key
 *
 */
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
	
}
