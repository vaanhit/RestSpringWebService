package com.vaan.hit.message.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vaan.hit.message.entity.MessageEntity;

/**
 * @author Rohit
 *   MessageEntity: @entity Integer: datatype of primary key
 *
 */
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
	
	@Override
	public Page<MessageEntity> findAll(Pageable pageable);
	
	/*@Override
	public List<MessageEntity> findAll(Sort sort);*/
	
	
	
}
