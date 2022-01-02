package com.glamtech.glamup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.glamtech.glamup.entity.EventPlannerEntity;
import com.glamtech.glamup.exception.EventPlannerDAOException;

@Repository
public interface EventPlannerDAO extends JpaRepository<EventPlannerEntity, Long> {

	String getEmail(@Param("loginEmail") String loginEmail) throws EventPlannerDAOException;
	
	String getEncodedPasswordByEmail(@Param("loginEmail") String loginEmail) throws EventPlannerDAOException;
	
	Integer getNoOfLoginAttemptByEmail(@Param("loginEmail") String loginEmail) throws EventPlannerDAOException;

	@Transactional
	@Modifying
	public void updateLoginAttemptByEmail(@Param("loginAttempt") int loginAttempt, @Param("loginEmail") String loginEmail)
			throws EventPlannerDAOException;

}
