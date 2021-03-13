package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Request;

@Repository(value="requestRepository")
public interface RequestRepository extends JpaRepository<Request, Integer> {

		@Query(value = "select r from Request r where r.buyerid = :buyerid and r.requeststatus = 'pending'")
		List<Request> findAllByBuyerid(@Param("buyerid") int buyerid);
		
		
}
