package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Message;

@Repository(value = "messagerepository")
public interface MessageRepository extends JpaRepository<Message, Integer>{
	
	//create message
	<S extends Message> S save (Message message);
	
	//viewing a message
	@Query(value = "select m from Message m where m.requestid.requestid = :requestid")
	List<Message> findAllByRequestid (@Param("requestid") int requestid);
}
