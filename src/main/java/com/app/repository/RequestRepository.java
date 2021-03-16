package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Request;

@Repository(value="requestRepository")
public interface RequestRepository extends JpaRepository<Request, Integer> {

		//find all requests by user Id for both pending and accepted---
		@Query(value="SELECT R FROM Request R WHERE R.buyerid.personid = :buyerid AND R.requeststatus = :requeststatus")
		List<Request> findAllByBuyeridAndRequeststatus (@Param("buyerid") Integer buyerid, @Param("requeststatus") String requeststatus);
		
		//update request
		//1.buyer updates a pending request---
		//2.breeder accepts request---
		//3. buyer creates a request---
		<S extends Request> S save (Request request);
		
		//used for creating a message; we need the request
		Request findByRequestid (Integer requestid);
		
		
}
